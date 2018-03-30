package com.guigu.system.attendance.service;

import java.util.List;

import com.guigu.system.po.AttendanceRecordVO;

public interface AttendanceService {

	public List<AttendanceRecordVO> findList(AttendanceRecordVO attendanceRecordVO);
	
	public AttendanceRecordVO findOne(Integer attendanceRecordId);
	
	public boolean save(AttendanceRecordVO attendanceRecordVO);
	
	public boolean update(AttendanceRecordVO attendanceRecordVO);
	
	public boolean delete(Integer attendanceRecordId);
}
