package com.footballleague.sapient.apibeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.footballleague.sapient.constants.FbLeagueApiConstants;
import com.footballleague.sapient.util.GenericsConstantUtilty;

@Component
public class FootBallApiExchange {
	
	@Autowired
	private FbLeagueApiConstants leagueApiConstants;

	public CountryBean[] getCountries() {
		return GenericsConstantUtilty.REST_TEMPLATE.getForObject(leagueApiConstants.getUrls().getGetCountries(), CountryBean[].class);
	}

	public LeagueBean[] getLeaguesList(String countryId) {
		return GenericsConstantUtilty.REST_TEMPLATE.getForObject(leagueApiConstants.getUrls().getGetLeagues(), LeagueBean[].class, countryId);
	}

	public TeamBean[] getTeams(String leagueId) {
		return GenericsConstantUtilty.REST_TEMPLATE.getForObject(leagueApiConstants.getUrls().getGetTeams(), TeamBean[].class, leagueId);
	}

	public StrandingBean[] getStranding(String leagueId) {
		return GenericsConstantUtilty.REST_TEMPLATE.getForObject(leagueApiConstants.getUrls().getGetStranding(), StrandingBean[].class, leagueId);
	}

}
