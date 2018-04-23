package com.guigu.system.po;

import java.util.List;

public class TargetList {
	private List<TargetRecordVO> list;

	public TargetList(List<TargetRecordVO> list) {
		super();
		this.list = list;
	}

	public TargetList() {
		super();
	}

	public List<TargetRecordVO> getList() {
		return list;
	}

	public void setList(List<TargetRecordVO> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "TargetList [list=" + list + "]";
	}

}
