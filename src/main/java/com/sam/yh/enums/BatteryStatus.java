package com.sam.yh.enums;

public enum BatteryStatus {

	NORMAL(1, "����"), 
	ABNORMAL(2, "�쳣");

	private int status;
	private String desc;

	private BatteryStatus(int status, String desc) {
		this.status = status;
		this.desc = desc;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
