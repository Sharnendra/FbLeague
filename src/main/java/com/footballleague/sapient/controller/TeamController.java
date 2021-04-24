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
import com.footballleague.sapient.service.TeamService;
import com.footballleague.sapient.util.GenericsConstantUtilty;

@RestController
public class TeamController extends BaseController{

	@Autowired
	private TeamService teamService;
	
	private static final Logger log = LogManager.getLogger(TeamController.class);
	
	@PostMapping(UrlConstant.GET_TEAMS)
	public RestResponse getTeams(@RequestBody SingleRequestBean leagueBean) {
		RestResponse response = new RestResponse(GenericsConstantUtilty.generateRequestId());
		setRequestLog(requestLog,response.getRequestId(),null,null,null,"getTeams");
		log.info(requestLog.toString()+ "== getTeams Start :=====");
		try {
			response.setData(teamService.getTeams(leagueBean.getLeagueId()));
		}catch (FootBallAppException ex) {
			response.setError(ex);
		}catch (Exception e) {
			response.setError(new UnhandledException());
		}
		finally {
			log.info(requestLog.toString()+ "== getTeams End :=====");
		}
		return response;
	}
}
