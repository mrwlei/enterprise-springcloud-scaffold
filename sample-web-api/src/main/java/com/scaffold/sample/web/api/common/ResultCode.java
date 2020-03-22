package com.scaffold.sample.web.api.common;

public enum ResultCode {
	/**
	 * 获取成功
	 */
	OK("0000", "获取成功"),
	SYSERROR("5000", "系统异常"),

	;

	
	String value;
	
	String message;
	
	boolean show;
	
	public String getMessage() {
		return message;
	}
	
	public String getValue() {
		return value;
	}
	ResultCode(String value, String message){
		this(value, message, false);
	}
	ResultCode(String value, String message, boolean show) {
		this.value = value;
		this.message = message;
		this.show = show;
	}
	
}
