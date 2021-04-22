package com.footballleague.sapient.beans;

import java.util.ArrayList;
import java.util.List;

import com.footballleague.sapient.apibeans.LeagueBean;

public class LeagueBeanResponse {

	public LeagueBeanResponse(List<LeagueBean> leagues) {
		this.leagues = leagues;
	}
	
	private List<LeagueBean> leagues = new ArrayList<>();

	public List<LeagueBean> getLeagues() {
		return leagues;
	}

	public void setLeagues(List<LeagueBean> leagues) {
		this.leagues = leagues;
	}
	
}
