package com.footballleague.sapient.apibeans;

import org.springframework.stereotype.Component;

import com.footballleague.sapient.exception.FootBallAppException;

@Component
public class RestResponse implements Response{

	private String requestId;
	private FbApiResponseData data;
	private FootBallAppException error;
	
	public RestResponse() {
		super();
	}

	public RestResponse(String requestId) {
		this.requestId = requestId;
	}
	
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public FbApiResponseData getData() {
		return data;
	}
	public void setData(FbApiResponseData data) {
		this.data = data;
	}
	public FootBallAppException getError() {
		return error;
	}
	public void setError(FootBallAppException error) {
		this.error = error;
	}
	
	
}
