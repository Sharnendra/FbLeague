package com.footballleague.sapient.exception;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatus.Series;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import com.footballleague.sapient.util.GenericsConstantUtilty;
import com.google.common.io.ByteStreams;

public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {

	@Override
	public boolean hasError(ClientHttpResponse httpResponse) throws IOException {
		return (httpResponse.getStatusCode().series() == Series.CLIENT_ERROR 
		          || httpResponse.getStatusCode().series() == Series.SERVER_ERROR);
	}

	@Override
	public void handleError(ClientHttpResponse httpResponse) throws IOException {
		if (httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
		            // handle SERVER_ERROR
		} else if (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
		            // handle CLIENT_ERROR
			String responseBody=new String(ByteStreams.toByteArray(httpResponse.getBody()), Charset.forName("UTF-8"));
            if(httpResponse.getStatusCode() == HttpStatus.BAD_REQUEST) {
            	if(!GenericsConstantUtilty.isNullOrEmpty(responseBody))
            	{
            		throw new FbStrandingResponseException(String.valueOf(HttpStatus.BAD_REQUEST)+GenericsConstantUtilty.REST_EXCEPTION_RESPONSE+responseBody);
            	}
            	else
            	{
            		throw new FbStrandingResponseException(String.valueOf(HttpStatus.BAD_REQUEST));
            	}
            }
            else if(httpResponse.getStatusCode() == HttpStatus.BAD_GATEWAY)
            {
            	if(!GenericsConstantUtilty.isNullOrEmpty(responseBody))
            	{
            		throw new FbStrandingResponseException(String.valueOf(HttpStatus.BAD_GATEWAY)+GenericsConstantUtilty.REST_EXCEPTION_RESPONSE+responseBody);
            	}
            	else
            	{
            		throw new FbStrandingResponseException(String.valueOf(HttpStatus.BAD_GATEWAY));
            	}
            }
            else if(httpResponse.getStatusCode() == HttpStatus.NOT_FOUND)
            {
            	if(!GenericsConstantUtilty.isNullOrEmpty(responseBody))
            	{
            		throw new FbStrandingResponseException(String.valueOf(HttpStatus.NOT_FOUND)+GenericsConstantUtilty.REST_EXCEPTION_RESPONSE+responseBody);
            	}
            	else
            	{
            		throw new FbStrandingResponseException(String.valueOf(HttpStatus.NOT_FOUND));
            	}
            }
            else if(httpResponse.getStatusCode() == HttpStatus.INTERNAL_SERVER_ERROR)
            {
            	if(!GenericsConstantUtilty.isNullOrEmpty(responseBody))
            	{
            		throw new FbStrandingResponseException(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR)+GenericsConstantUtilty.REST_EXCEPTION_RESPONSE+responseBody);
            	}
            	else
            	{
            		throw new FbStrandingResponseException(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
            	}
            }
            else
            {
            	if(!GenericsConstantUtilty.isNullOrEmpty(responseBody))
            	{
            		throw new FbStrandingResponseException(String.valueOf(HttpStatus.BAD_REQUEST)+GenericsConstantUtilty.REST_EXCEPTION_RESPONSE+responseBody);
            	}
            	else
            	{
            		throw new FbStrandingResponseException(String.valueOf(HttpStatus.BAD_REQUEST));
            	}
            }
        }
	}

}
