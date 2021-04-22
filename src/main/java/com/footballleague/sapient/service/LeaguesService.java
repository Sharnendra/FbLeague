package com.footballleague.sapient.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballleague.sapient.apibeans.FootBallApiExchange;
import com.footballleague.sapient.apibeans.LeagueBean;
import com.footballleague.sapient.beans.LeagueBeanResponse;

@Service
public class LeaguesService {

	@Autowired
	private FootBallApiExchange apiExchange;
	
	public LeagueBeanResponse getLeaguesList() {
		LeagueBean[] leagues= apiExchange.getLeaguesList();
		return new LeagueBeanResponse(Arrays.asList(leagues));
	}
}
