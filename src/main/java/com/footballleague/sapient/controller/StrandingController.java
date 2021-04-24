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
import com.footballleague.sapient.service.StrandingService;
import com.footballleague.sapient.util.GenericsConstantUtilty;

@RestController
public class StrandingController extends BaseController{

	@Autowired
	private StrandingService strandingService;
	
	private static final Logger log = LogManager.getLogger(StrandingController.class);
	
	@PostMapping(UrlConstant.GET_STRANDING)
	public RestResponse getStranding(@RequestBody SingleRequestBean leagueBean) {
		RestResponse response = new RestResponse(GenericsConstantUtilty.generateRequestId());
		setRequestLog(requestLog,response.getRequestId(),null,null,null,"getStranding");
		log.info(requestLog.toString()+ "== getStranding Start :=====");
		try {
			response.setData(strandingService.getStranding(leagueBean.getLeagueId()));
		}catch (FootBallAppException ex) {
			response.setError(ex);
		}catch (Exception e) {
			response.setError(new UnhandledException());
		}
		finally {
			log.info(requestLog.toString()+ "== getStranding End :=====");
		}
		return response;
	}
	
	@PostMapping(UrlConstant.GET_STRANDING_DETAILS)
	public RestResponse getStrandingDetails(@RequestBody SingleRequestBean countryDetails) {
		RestResponse response = new RestResponse(GenericsConstantUtilty.generateRequestId());
		setRequestLog(requestLog,response.getRequestId(),null,null,null,"getStrandingDetails");
		response.setData(strandingService.getStrandingDetails(countryDetails));
		return response;
	}
}
