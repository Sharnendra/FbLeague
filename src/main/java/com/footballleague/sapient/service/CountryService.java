package com.footballleague.sapient.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballleague.sapient.apibeans.CountryBean;
import com.footballleague.sapient.apibeans.FootBallApiExchange;
import com.footballleague.sapient.beans.CountryBeanResponse;

@Service
public class CountryService{
	
	@Autowired
	private FootBallApiExchange apiExchange;

	public CountryBeanResponse getCountries() {
		CountryBean[] listOfContries= apiExchange.getCountries();
		return new CountryBeanResponse(Arrays.asList(listOfContries));
	}

}
