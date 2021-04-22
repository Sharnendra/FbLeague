package com.footballleague.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footballleague.sapient.beans.TeamBeanResponse;
import com.footballleague.sapient.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@GetMapping("/getTeams")
	public TeamBeanResponse getTeams() {
		return teamService.getTeams();
	}
}
