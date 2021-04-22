package com.footballleague.sapient.exception;

import com.footballleague.sapient.constants.ErrorConstants;

public class FbStrandingResponseException extends FootBallAppException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FbStrandingResponseException(String message) {
		super(ErrorConstants.APIFOOTBALL_RESPONSE_EXCEPTION_CODE,ErrorConstants.APIFOOTBALL_RESPONSE_EXCEPTION_MESSAGE+message,false,false);
	}
	
	public FbStrandingResponseException(String code,String message ) {
		super(ErrorConstants.APIFOOTBALL_RESPONSE_EXCEPTION_CODE,message,false,false);
	}
	
}
