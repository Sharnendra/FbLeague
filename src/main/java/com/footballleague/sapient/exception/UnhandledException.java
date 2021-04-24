package com.footballleague.sapient.exception;

import com.footballleague.sapient.constants.ErrorConstants;

public class UnhandledException extends FootBallAppException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UnhandledException() {
		super(ErrorConstants.UNKNOWN_ERROR_CODE,ErrorConstants.UNKNOWN_ERROR_MESSAGE,false,false);
	}
	public UnhandledException(String message) {
		super(ErrorConstants.UNKNOWN_ERROR_CODE,message,false,false);
	}
	
	public UnhandledException(String code,String message) {
		super(code,message,false,false);
	}

}
