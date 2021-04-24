package com.footballleague.sapient.apibeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {

	@JsonProperty("player_key")
	private String playerKey;

	@JsonProperty("player_name")
	private String playerName;

	@JsonProperty("player_number")
	private int playerNumber;

	@JsonProperty("player_country")
	private String playerCountry;

	@JsonProperty("player_type")
	private String playerType;

	@JsonProperty("player_age")
	private String playerAge;

	@JsonProperty("player_match_played")
	private String playerMatchPlayed;

	@JsonProperty("player_goals")
	private String playerGoals;

	public String getPlayerKey() {
		return playerKey;
	}

	public void setPlayerKey(String playerKey) {
		this.playerKey = playerKey;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public String getPlayerCountry() {
		return playerCountry;
	}

	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}

	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	public String getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(String playerAge) {
		this.playerAge = playerAge;
	}

	public String getPlayerMatchPlayed() {
		return playerMatchPlayed;
	}

	public void setPlayerMatchPlayed(String playerMatchPlayed) {
		this.playerMatchPlayed = playerMatchPlayed;
	}

	public String getPlayerGoals() {
		return playerGoals;
	}

	public void setPlayerGoals(String playerGoals) {
		this.playerGoals = playerGoals;
	}

	public int getPlayerYellowCards() {
		return playerYellowCards;
	}

	public void setPlayerYellowCards(int playerYellowCards) {
		this.playerYellowCards = playerYellowCards;
	}

	public int getPlayerRedCards() {
		return playerRedCards;
	}

	public void setPlayerRedCards(int playerRedCards) {
		this.playerRedCards = playerRedCards;
	}

	@JsonProperty("player_yellow_cards")
	private int playerYellowCards;

	@JsonProperty("player_red_cards")
	private int playerRedCards;
}
