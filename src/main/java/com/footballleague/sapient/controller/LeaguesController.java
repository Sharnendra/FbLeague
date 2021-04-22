package com.footballleague.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footballleague.sapient.beans.LeagueBeanResponse;
import com.footballleague.sapient.service.LeaguesService;

@RestController
public class LeaguesController {

	@Autowired
	private LeaguesService leaguesService;
	
	@GetMapping("/getLeagues")
	public LeagueBeanResponse getLeagues() {
		return leaguesService.getLeaguesList();
	}
}
