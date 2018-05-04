package com.guigu.system.po;

public class Admin {
    private Integer adminId;

    private String adminAccount;

    private String adminPwd;

    private String adminState;

    private String adminRight;

    private String adminName;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd == null ? null : adminPwd.trim();
    }

    public String getAdminState() {
        return adminState;
    }

    public void setAdminState(String adminState) {
        this.adminState = adminState == null ? null : adminState.trim();
    }

    public String getAdminRight() {
        return adminRight;
    }

    public void setAdminRight(String adminRight) {
        this.adminRight = adminRight == null ? null : adminRight.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminAccount=" + adminAccount + ", adminPwd=" + adminPwd
				+ ", adminState=" + adminState + ", adminRight=" + adminRight + ", adminName=" + adminName + "]";
	}
    
}