package com.guigu.system.test.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.construct.service.DepartmentService;
import com.guigu.system.construct.service.EmployeeVOService;
import com.guigu.system.construct.service.PositionService;
import com.guigu.system.order.service.OrderVOService;
import com.guigu.system.po.AttendanceRecordVO;
import com.guigu.system.po.Department;
import com.guigu.system.po.EmpTestVO;
import com.guigu.system.po.Employees;
import com.guigu.system.po.EmployeesVO;
import com.guigu.system.po.Position;
import com.guigu.system.po.SalaryRuleVO;
import com.guigu.system.po.TargetRecordVO;
import com.guigu.system.po.mapper.AttendanceRecordVOMapper;
import com.guigu.system.po.mapper.OrderVOMapper;
import com.guigu.system.test.service.EmpTestVOService;
import com.guigu.system.test.service.SalaryRuleService;
import com.guigu.system.test.service.TargetRecordVOService;

@RequestMapping("/empTest/")
@Controller
public class EmpTestController {

	@Resource(name="empTestVOServiceImpl")
	private EmpTestVOService empTestVOService;
	
	@Resource(name="targetRecordVOServiceImpl")
	private TargetRecordVOService targetRecordVOService;
	
	@Resource(name="employeeVOServiceImpl")
	private EmployeeVOService employeeVOService;
	
	@Resource(name="departmentServiceImpl")
	private DepartmentService departmentService;
	
	@Resource(name="positionServiceImpl")
	private PositionService positionService;
	
	@Resource(name="salaryRuleServiceImpl")
	private SalaryRuleService salaryRuleService;
	
	@Resource(name="orderVOserviceImpl")
	private OrderVOService orderVOService;
	
	@Resource(name="orderVOMapper")
	private OrderVOMapper orderVOMapper;
	
	@Resource(name="attendanceRecordVOMapper")
	private AttendanceRecordVOMapper attendanceRecordVOMapper;
	
	@RequestMapping("list.action")
	public String list(Model model,EmpTestVO empTestVO) {
		List<EmpTestVO> list=empTestVOService.findList(empTestVO);
		model.addAttribute("list", list);
		return "test/empTest_list";
	}
	
	@RequestMapping("main.action")
	public String main(Model model,EmpTestVO empTestVO) {
		List<EmpTestVO> list=empTestVOService.findList(empTestVO);
		model.addAttribute("list", list);
		return "test/salary_list";
	}
	@RequestMapping("load.action")
	public String load(Model model,int employeeId) {
		EmployeesVO employeesVO=employeeVOService.findOne(employeeId);
		Department department=new Department();
		department.setDepartmentName(employeesVO.getDepartmentName());
		String parentName=departmentService.findList(department).get(0).getDepartmentName();
		List<TargetRecordVO> targets=targetRecordVOService.find(parentName);
		model.addAttribute("list", targets);
		model.addAttribute("emp", employeesVO);
		return "test/empTest_add";
	}
	
	@RequestMapping("add.action")
	public String add(Model model,EmpTestVO empTestVO) {
		
        EmployeesVO employeesVO= employeeVOService.findOne(empTestVO.getEmpId());
		SalaryRuleVO salaryRuleVO=new SalaryRuleVO();
		salaryRuleVO.setPositionId(employeesVO.getPosition());
		salaryRuleVO=salaryRuleService.findOne(salaryRuleVO);
		empTestVO.setEmployeeName(employeesVO.getEmployeeName());
		empTestVO.setPositionSalary(salaryRuleVO.getPositionSalary());
		Department department= departmentService.findOne(employeesVO.getDepartment());
		//��������
		empTestVO.setBaseSalary(salaryRuleVO.getBaseSalary());
		String date=empTestVO.getTestDate();
		empTestVO.setTestDate(date+"%");
		List<AttendanceRecordVO> attendanceRecordVOs=attendanceRecordVOMapper.find(empTestVO);
		for (AttendanceRecordVO attendanceRecordVO : attendanceRecordVOs) {
			if (attendanceRecordVO.getTypeCategory()==2) {
				empTestVO.setBaseSalary(empTestVO.getBaseSalary()-salaryRuleVO.getBaseSalary()/30);
			}
			if(attendanceRecordVO.getTypeCategory()==1) {
				empTestVO.setBaseSalary(empTestVO.getBaseSalary()-salaryRuleVO.getBaseSalary()/30*0.5);
			}
		}
		//��ɹ���
		//��Ч����
		if ("���в�".equals(department.getDepartmentName())) {
			double money=orderVOMapper.floorMoney(empTestVO);
			empTestVO=this.function(empTestVO, salaryRuleVO,money);
		}
		if ("��ױ��".equals(department.getDepartmentName())) {
			double money=orderVOMapper.makeUpMoney(empTestVO);
			empTestVO=this.function(empTestVO, salaryRuleVO,money);
		}
		if ("��Ӱ��".equals(department.getDepartmentName())) {
			double money=orderVOMapper.photoMoney(empTestVO);
			empTestVO=this.function(empTestVO, salaryRuleVO,money);	
		}
		if ("���벿".equals(department.getDepartmentName())) {
			double money=orderVOMapper.psMoney(empTestVO);
			empTestVO=this.function(empTestVO, salaryRuleVO,money);
		}

		if ("������".equals(department.getDepartmentName())) {
			double money=orderVOMapper.chooseMoney(empTestVO);
			empTestVO=this.function(empTestVO, salaryRuleVO,money);
		}
		
		//�ܹ���
		empTestVO.setAllSalary(empTestVO.getBaseSalary()+empTestVO.getPositionSalary()+empTestVO.getUpSalary()
					+empTestVO.getJxSalary());
		
		empTestVO.setTestDate(date);

		boolean result=empTestVOService.save(empTestVO);
		if(result) {
			model.addAttribute("info", "��ӳɹ�");
		}else {
			model.addAttribute("info", "���ʧ��");
		}
		return this.list(model, null);
	}
	
	@RequestMapping("delete.action")
	public String delete(Model model,int testId) {
		boolean result=empTestVOService.delete(testId);
		if(result) {
			model.addAttribute("info", "ɾ���ɹ�");
		}else {
			model.addAttribute("info", "ɾ��ʧ��");
		}
		return this.list(model, null);
		
	}
	
	@RequestMapping("deleteMain.action")
	public String deleteMain(Model model,int testId) {
		boolean result=empTestVOService.delete(testId);
		if(result) {
			model.addAttribute("info", "ɾ���ɹ�");
		}else {
			model.addAttribute("info", "ɾ��ʧ��");
		}
		return this.main(model, null);
		
	}
	
	public  EmpTestVO function(EmpTestVO empTestVO,SalaryRuleVO salaryRuleVO,double money) {
		empTestVO.setUpSalary(money*salaryRuleVO.getUpPercent());
		if(money<salaryRuleVO.getTargetMoney()) {
			empTestVO.setJxSalary(-(100-empTestVO.getTestScore())*salaryRuleVO.getScoreMoney());
		}else {
			empTestVO.setJxSalary((empTestVO.getTestScore()/100)*(money-salaryRuleVO.getTargetMoney())*salaryRuleVO.getJxPercent());
		}
		return empTestVO;
	}
	
}
