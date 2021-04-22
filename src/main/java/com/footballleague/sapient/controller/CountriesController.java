package com.footballleague.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footballleague.sapient.beans.CountryBeanResponse;
import com.footballleague.sapient.service.CountryService;

@RestController
public class CountriesController {
	
	@Autowired
	private CountryService coutryService;
	
	@GetMapping("/getCountries")
	public CountryBeanResponse getCountry() {
		return coutryService.getCountries();
	}

}
