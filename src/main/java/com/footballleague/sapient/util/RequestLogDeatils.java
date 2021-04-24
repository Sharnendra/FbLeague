package com.footballleague.sapient.util;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestLogDeatils {
	private String requestId;
	private String activity;
	private String sapCode;
	private String mobileNumber;
	private String deviceIdentifier;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getSapCode() {
		return sapCode;
	}

	public void setSapCode(String sapCode) {
		this.sapCode = sapCode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDeviceIdentifier() {
		return deviceIdentifier;
	}

	public void setDeviceIdentifier(String deviceIdentifier) {
		this.deviceIdentifier = deviceIdentifier;
	}

	@Override
	public String toString() {
//		return "\nRequestLogDeatils: \n{\n\trequestId=" + requestId + ", \n\tactivity=" + activity + ",\n\tsapCode=" + sapCode
//				+ ", \n\tmobileNumber=" + mobileNumber + ",\n\tdeviceIdentifier=" + deviceIdentifier + "\n}\n";
		return requestId + '/' + activity + '/' + (deviceIdentifier != null ? deviceIdentifier : "NA") + '/'
				+ (sapCode != null ? sapCode : "NA") + " -- ";
	}

}
