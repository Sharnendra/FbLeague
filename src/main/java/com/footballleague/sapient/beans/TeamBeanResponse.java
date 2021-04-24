package com.footballleague.sapient.beans;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.footballleague.sapient.apibeans.FbApiResponseData;
import com.footballleague.sapient.apibeans.FbApiRestResponse;
import com.footballleague.sapient.apibeans.TeamBean;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamBeanResponse extends FbApiRestResponse implements FbApiResponseData {

	public TeamBeanResponse(List<TeamBean> teams) {
		this.teams = teams;
	}

	@JsonProperty(value = "Response")
	private List<TeamBean> teams = new ArrayList<>();

	public List<TeamBean> getTeams() {
		return teams;
	}

	public void setTeams(List<TeamBean> teams) {
		this.teams = teams;
	}

}
