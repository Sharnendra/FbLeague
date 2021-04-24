package com.footballleague.sapient.apibeans;

import com.footballleague.sapient.exception.FootBallAppException;

public interface Response {
	String getRequestId();

	FbApiResponseData getData();

	FootBallAppException getError();
}
