package com.guigu.system.po.mapper;

import java.util.List;

import com.guigu.system.po.Admin;
import com.guigu.system.po.AttendanceRecordVO;
import com.guigu.system.po.EmpTestVO;

public interface AttendanceRecordVOMapper {
	
	public List<AttendanceRecordVO> findList(AttendanceRecordVO attendanceRecordVO);
	
	public int save(AttendanceRecordVO attendanceRecordVO);
	
	public AttendanceRecordVO findOne(Integer attendanceid);
	
	public List<AttendanceRecordVO> findDept(Admin admin);
	
	public List<AttendanceRecordVO> find(EmpTestVO empTestVO);
}
