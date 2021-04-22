package com.footballleague.sapient.beans;

import java.util.ArrayList;
import java.util.List;

import com.footballleague.sapient.apibeans.TeamBean;

public class TeamBeanResponse {

	public TeamBeanResponse(List<TeamBean> teams) {
		this.teams = teams;
	}
	
	private List<TeamBean> teams = new ArrayList<>();

	public List<TeamBean> getTeams() {
		return teams;
	}

	public void setTeams(List<TeamBean> teams) {
		this.teams = teams;
	}
	
}
