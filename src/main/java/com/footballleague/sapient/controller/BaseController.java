package com.footballleague.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.footballleague.sapient.util.RequestLogDeatils;

public abstract class BaseController {
	
	@Autowired
	RequestLogDeatils requestLog;
	
	void setRequestLog(RequestLogDeatils requestLog, String requestId, String sapCode, String mobileNumber,
			String deviceIdentifier, String activity) {
		requestLog.setRequestId(requestId);
		requestLog.setActivity(activity);
		requestLog.setSapCode(sapCode);
		requestLog.setDeviceIdentifier(deviceIdentifier);
		requestLog.setMobileNumber(mobileNumber);
	}

}
