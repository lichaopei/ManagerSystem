package com.guigu.system.po;

import java.util.List;

public class ModelList {
	private List<AttendanceRecordVO> list;

	public List<AttendanceRecordVO> getList() {
		return list;
	}

	public void setList(List<AttendanceRecordVO> list) {
		this.list = list;
	}

	public ModelList() {
		super();
	}
	
	
	public ModelList(List<AttendanceRecordVO> list) {
		super();
		this.list = list;
	}

	
}
