package com.footballleague.sapient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballleague.sapient.apibeans.FootBallApiExchange;
import com.footballleague.sapient.apibeans.TeamBean;
import com.footballleague.sapient.beans.TeamBeanResponse;
import com.footballleague.sapient.constants.ErrorConstants;
import com.footballleague.sapient.exception.FbStrandingResponseException;
import com.footballleague.sapient.util.GenericsConstantUtilty;

@Service
public class TeamService {

	@Autowired
	private FootBallApiExchange apiExchange;

	public TeamBeanResponse getTeams(String leagueId) {
		try {
			TeamBean[] teams = apiExchange.getTeams(leagueId);
			if (GenericsConstantUtilty.isNullOrEmpty(teams)) {
				throw new FbStrandingResponseException(ErrorConstants.TEAMS_NOT_FOUND);
			}
			return GenericsConstantUtilty.teamBeanResponseTranslator(teams);
		} catch (Exception e) {
			throw new FbStrandingResponseException(ErrorConstants.REST_TEMPLATE_CALL_FAILED + e);
		}
	}

}
