package com.footballleague.sapient.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footballleague.sapient.apibeans.RestResponse;
import com.footballleague.sapient.constants.UrlConstant;
import com.footballleague.sapient.exception.FootBallAppException;
import com.footballleague.sapient.exception.UnhandledException;
import com.footballleague.sapient.service.CountryService;
import com.footballleague.sapient.util.GenericsConstantUtilty;

@RestController
public class CountriesController extends BaseController{
	
	@Autowired
	private CountryService coutryService;
	
	private static final Logger log = LogManager.getLogger(CountriesController.class);
	
	@GetMapping(UrlConstant.GET_COUNTRIES)
	public RestResponse getCountry() {
		RestResponse response = new RestResponse(GenericsConstantUtilty.generateRequestId());
		setRequestLog(requestLog,response.getRequestId(),null,null,null,"getCountry");
		log.info(requestLog.toString()+ "== getCountry Start :=====");
		try {
			response.setData(coutryService.getCountries());
		}catch (FootBallAppException ex) {
			response.setError(ex);
		}catch (Exception e) {
			response.setError(new UnhandledException());
		}
		finally {
			log.info(requestLog.toString()+ "== getCountry End :=====");
		}
		return response;
	}

}
