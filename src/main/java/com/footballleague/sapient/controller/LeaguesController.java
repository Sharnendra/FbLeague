package com.footballleague.sapient.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.footballleague.sapient.apibeans.RestResponse;
import com.footballleague.sapient.apibeans.SingleRequestBean;
import com.footballleague.sapient.constants.UrlConstant;
import com.footballleague.sapient.exception.FootBallAppException;
import com.footballleague.sapient.exception.UnhandledException;
import com.footballleague.sapient.service.LeaguesService;
import com.footballleague.sapient.util.GenericsConstantUtilty;

@RestController
public class LeaguesController extends BaseController{

	@Autowired
	private LeaguesService leaguesService;
	
	private static final Logger log = LogManager.getLogger(LeaguesController.class);
	
	@PostMapping(UrlConstant.GET_LEAGUES)
	public RestResponse getLeagues(@RequestBody SingleRequestBean country) {
		RestResponse response = new RestResponse(GenericsConstantUtilty.generateRequestId());
		setRequestLog(requestLog,response.getRequestId(),null,null,null,"getLeagues");
		log.info(requestLog.toString()+ "== getLeagues Start :=====");
		try {
			response.setData(leaguesService.getLeaguesList(String.valueOf(country.getCountryId())));
		}catch (FootBallAppException ex) {
			response.setError(ex);
		}catch (Exception e) {
			response.setError(new UnhandledException());
		}
		finally {
			log.info(requestLog.toString()+ "== getLeagues End :=====");
		}
		return response;
	}
}
