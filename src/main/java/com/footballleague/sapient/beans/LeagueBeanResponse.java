package com.footballleague.sapient.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.footballleague.sapient.apibeans.FbApiResponseData;
import com.footballleague.sapient.apibeans.FbApiRestResponse;
import com.footballleague.sapient.apibeans.LeagueBean;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueBeanResponse extends FbApiRestResponse implements FbApiResponseData{

	public LeagueBeanResponse(List<LeagueBean> leagues) {
		this.leagues = leagues;
	}
	
	@JsonProperty(value = "Response")
	private List<LeagueBean> leagues;

	public List<LeagueBean> getLeagues() {
		return leagues;
	}

	public void setLeagues(List<LeagueBean> leagues) {
		this.leagues = leagues;
	}
	
}
