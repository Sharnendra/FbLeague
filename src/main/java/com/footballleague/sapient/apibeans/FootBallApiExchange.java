package com.footballleague.sapient.apibeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.footballleague.sapient.constants.FbLeagueApiConstants;
import com.footballleague.sapient.constants.GenericsConstantUtilty;

@Component
public class FootBallApiExchange {
	
	@Autowired
	private FbLeagueApiConstants leagueApiConstants;

	public CountryBean[] getCountries() {
		return GenericsConstantUtilty.REST_TEMPLATE.getForObject(leagueApiConstants.getUrls().getGetCountries(), CountryBean[].class);
	}

	public LeagueBean[] getLeaguesList() {
		return GenericsConstantUtilty.REST_TEMPLATE.getForObject(leagueApiConstants.getUrls().getGetLeagues(), LeagueBean[].class);
	}

	public TeamBean[] getTeams() {
		return GenericsConstantUtilty.REST_TEMPLATE.getForObject(leagueApiConstants.getUrls().getGetTeams(), TeamBean[].class);
	}

}
