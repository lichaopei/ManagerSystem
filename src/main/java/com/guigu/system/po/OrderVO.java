package com.guigu.system.po;

public class OrderVO extends Orders{
	
	private String typeName;
	private String floorName;
	private String makeUpName;
	private String photoName;
	private String psName;
	private String chooseName;
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getFloorName() {
		return floorName;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	public String getMakeUpName() {
		return makeUpName;
	}
	public void setMakeUpName(String makeUpName) {
		this.makeUpName = makeUpName;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	public String getPsName() {
		return psName;
	}
	public void setPsName(String psName) {
		this.psName = psName;
	}
	public String getChooseName() {
		return chooseName;
	}
	public void setChooseName(String chooseName) {
		this.chooseName = chooseName;
	}
	@Override
	public String toString() {
		return "OrderVO [typeName=" + typeName + ", floorName=" + floorName + ", makeUpName=" + makeUpName
				+ ", photoName=" + photoName + ", psName=" + psName + ", chooseName=" + chooseName + "]";
	}
	
}
