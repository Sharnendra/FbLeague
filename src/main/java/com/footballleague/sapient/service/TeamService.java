package com.footballleague.sapient.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballleague.sapient.apibeans.FootBallApiExchange;
import com.footballleague.sapient.apibeans.TeamBean;
import com.footballleague.sapient.beans.TeamBeanResponse;

@Service
public class TeamService {

	@Autowired
	private FootBallApiExchange apiExchange;
	
	public TeamBeanResponse getTeams() {
		TeamBean[] listofTeams = apiExchange.getTeams();
		return new TeamBeanResponse(Arrays.asList(listofTeams));
	}

}
