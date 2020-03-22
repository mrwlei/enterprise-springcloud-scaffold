package com.scaffold.sample.web.api.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @title: ResultT
 * @description: 结果返回模型
 * @author yds
 * @date 2019/11/19 18:40
 */
@Data
public class ResultMapper<T> implements Serializable{
	private static final long serialVersionUID = 1L;
	private String resCode;
	private String resMsg;
	private T data = null;

	public ResultMapper() {
		this.resCode = ResultCode.OK.getValue();
		this.resMsg = ResultCode.OK.getMessage();
	}

	public ResultMapper(T data) {
		this.resCode = ResultCode.OK.getValue();
		this.resMsg = ResultCode.OK.getMessage();
		this.data = data;
	}


	public ResultMapper(ResultCode resultCode, T data) {
		this.resCode = resultCode.getValue();
		this.resMsg = resultCode.getMessage();
		this.data = data;
	}


	public ResultMapper(String code, String message, T data) {
		this.resCode = code;
		this.resMsg = message;
		this.data = data;
	}


	public ResultMapper<T> buildError() {
		this.resCode = ResultCode.SYSERROR.getValue();
		this.resMsg = ResultCode.SYSERROR.getMessage();
		return this;
	}


	public ResultMapper<T> buildError(ResultCode msgEnum) {
		this.resCode = msgEnum.getValue();
		this.resMsg = msgEnum.getMessage();
		return this;
	}

	public ResultMapper<T> buildError(String code, String msg) {
		this.resCode = code;
		this.resMsg = msg;
		return this;
	}

	public ResultMapper<T> buildError(ResultCode msgEnum, T data) {
		this.resCode = msgEnum.getValue();
		this.resMsg = msgEnum.getMessage();
		if (data != null){
			this.data = data;
		}
		return this;
	}

	public ResultMapper<T> buildError(String code, String msg, T data) {
		this.resCode = code;
		this.resMsg = msg;
		if (data != null){
			this.data = data;
		}
		return this;
	}
}
