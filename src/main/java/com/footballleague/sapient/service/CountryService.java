package com.footballleague.sapient.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballleague.sapient.apibeans.CountryBean;
import com.footballleague.sapient.apibeans.FootBallApiExchange;
import com.footballleague.sapient.beans.CountryBeanResponse;
import com.footballleague.sapient.constants.ErrorConstants;
import com.footballleague.sapient.exception.FbStrandingResponseException;
import com.footballleague.sapient.util.GenericsConstantUtilty;

@Service
public class CountryService{
	
	@Autowired
	private FootBallApiExchange apiExchange;

	public CountryBeanResponse getCountries() {
		try {
			CountryBean[] listOfContries= apiExchange.getCountries();
			if(GenericsConstantUtilty.isNullOrEmpty(listOfContries)) {
				throw new FbStrandingResponseException(ErrorConstants.COUTRIES_NOT_FOUND);
			}
			return new CountryBeanResponse(Arrays.asList(listOfContries));
		}catch (Exception e) {
			throw new FbStrandingResponseException(ErrorConstants.REST_TEMPLATE_CALL_FAILED+e);
		}
	}

}
