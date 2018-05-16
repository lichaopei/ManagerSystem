package com.guigu.system.attendance.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.guigu.system.attendance.service.AttendanceService;
import com.guigu.system.po.Admin;
import com.guigu.system.po.AttendanceRecord;
import com.guigu.system.po.AttendanceRecordVO;
import com.guigu.system.po.mapper.AttendanceRecordMapper;
import com.guigu.system.po.mapper.AttendanceRecordVOMapper;
@Service("attendanceServiceImpl")
public class AttendanceServiceImpl implements AttendanceService{
	@Resource(name="attendanceRecordVOMapper")
	private AttendanceRecordVOMapper attendanceRecordVOMapper;
	@Resource(name="attendanceRecordMapper")
	private AttendanceRecordMapper attendanceRecordMapper;
	
	@Override
	public List<AttendanceRecordVO> findList(AttendanceRecordVO attendanceRecordVO) {
		if(attendanceRecordVO!=null) {
			if(attendanceRecordVO.getDepartmentName()!=null) {
				attendanceRecordVO.setDepartmentName("%"+attendanceRecordVO.getDepartmentName()+"%");
			}
			if (attendanceRecordVO.getEmployeeName()!=null) {
				attendanceRecordVO.setEmployeeName("%"+attendanceRecordVO.getEmployeeName()+"%");
			}
			if (attendanceRecordVO.getAttendanceDate()!=null) {
				attendanceRecordVO.setAttendanceDate(attendanceRecordVO.getAttendanceDate()+"%");
			}
		}
		return attendanceRecordVOMapper.findList(attendanceRecordVO);
	}

	@Override
	public AttendanceRecordVO findOne(Integer attendanceRecordId) {
		
		return attendanceRecordVOMapper.findOne(attendanceRecordId);
	}

	@Override
	public boolean save(AttendanceRecordVO attendanceRecordVO) {
		int i=attendanceRecordVOMapper.save(attendanceRecordVO);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(AttendanceRecordVO attendanceRecordVO) {
		AttendanceRecord attendancerecord=attendanceRecordVO;
		int i=attendanceRecordMapper.updateByPrimaryKey(attendancerecord);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Integer attendanceRecordId) {
		int i=attendanceRecordMapper.deleteByPrimaryKey(attendanceRecordId);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public Integer totalAll(AttendanceRecordVO attendanceRecordVO) {
		int i=attendanceRecordVOMapper.attendanceTotal(attendanceRecordVO);
		return i;
	}

}
