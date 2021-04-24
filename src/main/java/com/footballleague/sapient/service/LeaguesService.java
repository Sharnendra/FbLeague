package com.footballleague.sapient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballleague.sapient.apibeans.FootBallApiExchange;
import com.footballleague.sapient.apibeans.LeagueBean;
import com.footballleague.sapient.beans.LeagueBeanResponse;
import com.footballleague.sapient.constants.ErrorConstants;
import com.footballleague.sapient.exception.FbStrandingResponseException;
import com.footballleague.sapient.util.GenericsConstantUtilty;

@Service
public class LeaguesService {

	@Autowired
	private FootBallApiExchange apiExchange;
	
	public LeagueBeanResponse getLeaguesList(String countryId) {
		try {
			LeagueBean[] leaguesList = apiExchange.getLeaguesList(countryId);
			if(GenericsConstantUtilty.isNullOrEmpty(leaguesList)) {
				throw new FbStrandingResponseException(ErrorConstants.LEAGUES_NOT_FOUND);
			}
			return GenericsConstantUtilty.leagueBeanResponseTranslator(leaguesList);
		}catch (Exception e) {
			throw new FbStrandingResponseException(ErrorConstants.REST_TEMPLATE_CALL_FAILED+e);
		}
	}
}
