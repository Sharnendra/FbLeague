package com.footballleague.sapient.apibeans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamBean {

	@JsonProperty("team_key")
	private int teamKey;
	
	@JsonProperty("team_name")
	private String teamName;
	
	@JsonProperty("team_badge")
	private String teamBadge;
	
	private List<Player> players;
	private List<Coach> coaches;
	
	public int getTeamKey() {
		return teamKey;
	}
	public void setTeamKey(int teamKey) {
		this.teamKey = teamKey;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamBadge() {
		return teamBadge;
	}
	public void setTeamBadge(String teamBadge) {
		this.teamBadge = teamBadge;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public List<Coach> getCoaches() {
		return coaches;
	}
	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}
}
