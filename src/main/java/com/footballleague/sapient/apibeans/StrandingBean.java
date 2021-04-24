package com.footballleague.sapient.apibeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StrandingBean {

	@JsonProperty("country_name")
	public String countryname;
	
	@JsonProperty("league_id")
    public String leagueId;
	
	@JsonProperty("league_name")
    public String leagueName;
	
	@JsonProperty("team_id")
    public String teamId;
	
	@JsonProperty("team_name")
    public String teamName;
	
	@JsonProperty("overall_league_position")
    public String overallLeaguePosition;
	
	@JsonProperty("overall_league_payed")
    public String overallLeaguePayed;
	
	@JsonProperty("overall_league_W")
    public String overallLeagueW;
	
	@JsonProperty("overall_league_D")
    public String overallLeagueD;
	
	@JsonProperty("overall_league_L")
    public String overallLeagueL;
	
	@JsonProperty("overall_league_GF")
    public String overallLeagueGF;
	
	@JsonProperty("overall_league_GA")
    public String overallLeagueGA;
	
	@JsonProperty("overall_league_PTS")
    public String overallLeaguePTS;
	
	@JsonProperty("home_league_position")
    public String homeLeaguePosition;
	
	@JsonProperty("home_league_payed")
    public String homeLeaguePayed;
	
	@JsonProperty("home_league_W")
    public String homeLeagueW;
	
	@JsonProperty("home_league_D")
    public String homeLeagueD;
	
	@JsonProperty("home_league_L")
    public String homeLeagueL;
	
	@JsonProperty("home_league_GF")
    public String homeLeagueGF;
	
	@JsonProperty("home_league_GA")
    public String homeLeagueGA;
	
	@JsonProperty("home_league_PTS")
    public String homeLeaguePTS;
	
	@JsonProperty("away_league_position")
    public String awayLeaguePosition;
	
	@JsonProperty("away_league_payed")
    public String awayLeaguePayed;
	
	@JsonProperty("away_league_W")
    public String awayLeagueW;
	
	@JsonProperty("away_league_D")
    public String awayLeagueD;
	
	@JsonProperty("away_league_L")
    public String awayLeagueL;
	
	@JsonProperty("away_league_GF")
    public String awayLeagueGF;
	
	@JsonProperty("away_league_GA")
    public String awayLeagueGA;
	
	@JsonProperty("away_league_PTS")
    public String awayLeaguePTS;

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getOverallLeaguePosition() {
		return overallLeaguePosition;
	}

	public void setOverallLeaguePosition(String overallLeaguePosition) {
		this.overallLeaguePosition = overallLeaguePosition;
	}

	public String getOverallLeaguePayed() {
		return overallLeaguePayed;
	}

	public void setOverallLeaguePayed(String overallLeaguePayed) {
		this.overallLeaguePayed = overallLeaguePayed;
	}

	public String getOverallLeagueW() {
		return overallLeagueW;
	}

	public void setOverallLeagueW(String overallLeagueW) {
		this.overallLeagueW = overallLeagueW;
	}

	public String getOverallLeagueD() {
		return overallLeagueD;
	}

	public void setOverallLeagueD(String overallLeagueD) {
		this.overallLeagueD = overallLeagueD;
	}

	public String getOverallLeagueL() {
		return overallLeagueL;
	}

	public void setOverallLeagueL(String overallLeagueL) {
		this.overallLeagueL = overallLeagueL;
	}

	public String getOverallLeagueGF() {
		return overallLeagueGF;
	}

	public void setOverallLeagueGF(String overallLeagueGF) {
		this.overallLeagueGF = overallLeagueGF;
	}

	public String getOverallLeagueGA() {
		return overallLeagueGA;
	}

	public void setOverallLeagueGA(String overallLeagueGA) {
		this.overallLeagueGA = overallLeagueGA;
	}

	public String getOverallLeaguePTS() {
		return overallLeaguePTS;
	}

	public void setOverallLeaguePTS(String overallLeaguePTS) {
		this.overallLeaguePTS = overallLeaguePTS;
	}

	public String getHomeLeaguePosition() {
		return homeLeaguePosition;
	}

	public void setHomeLeaguePosition(String homeLeaguePosition) {
		this.homeLeaguePosition = homeLeaguePosition;
	}

	public String getHomeLeaguePayed() {
		return homeLeaguePayed;
	}

	public void setHomeLeaguePayed(String homeLeaguePayed) {
		this.homeLeaguePayed = homeLeaguePayed;
	}

	public String getHomeLeagueW() {
		return homeLeagueW;
	}

	public void setHomeLeagueW(String homeLeagueW) {
		this.homeLeagueW = homeLeagueW;
	}

	public String getHomeLeagueD() {
		return homeLeagueD;
	}

	public void setHomeLeagueD(String homeLeagueD) {
		this.homeLeagueD = homeLeagueD;
	}

	public String getHomeLeagueL() {
		return homeLeagueL;
	}

	public void setHomeLeagueL(String homeLeagueL) {
		this.homeLeagueL = homeLeagueL;
	}

	public String getHomeLeagueGF() {
		return homeLeagueGF;
	}

	public void setHomeLeagueGF(String homeLeagueGF) {
		this.homeLeagueGF = homeLeagueGF;
	}

	public String getHomeLeagueGA() {
		return homeLeagueGA;
	}

	public void setHomeLeagueGA(String homeLeagueGA) {
		this.homeLeagueGA = homeLeagueGA;
	}

	public String getHomeLeaguePTS() {
		return homeLeaguePTS;
	}

	public void setHomeLeaguePTS(String homeLeaguePTS) {
		this.homeLeaguePTS = homeLeaguePTS;
	}

	public String getAwayLeaguePosition() {
		return awayLeaguePosition;
	}

	public void setAwayLeaguePosition(String awayLeaguePosition) {
		this.awayLeaguePosition = awayLeaguePosition;
	}

	public String getAwayLeaguePayed() {
		return awayLeaguePayed;
	}

	public void setAwayLeaguePayed(String awayLeaguePayed) {
		this.awayLeaguePayed = awayLeaguePayed;
	}

	public String getAwayLeagueW() {
		return awayLeagueW;
	}

	public void setAwayLeagueW(String awayLeagueW) {
		this.awayLeagueW = awayLeagueW;
	}

	public String getAwayLeagueD() {
		return awayLeagueD;
	}

	public void setAwayLeagueD(String awayLeagueD) {
		this.awayLeagueD = awayLeagueD;
	}

	public String getAwayLeagueL() {
		return awayLeagueL;
	}

	public void setAwayLeagueL(String awayLeagueL) {
		this.awayLeagueL = awayLeagueL;
	}

	public String getAwayLeagueGF() {
		return awayLeagueGF;
	}

	public void setAwayLeagueGF(String awayLeagueGF) {
		this.awayLeagueGF = awayLeagueGF;
	}

	public String getAwayLeagueGA() {
		return awayLeagueGA;
	}

	public void setAwayLeagueGA(String awayLeagueGA) {
		this.awayLeagueGA = awayLeagueGA;
	}

	public String getAwayLeaguePTS() {
		return awayLeaguePTS;
	}

	public void setAwayLeaguePTS(String awayLeaguePTS) {
		this.awayLeaguePTS = awayLeaguePTS;
	}
}
