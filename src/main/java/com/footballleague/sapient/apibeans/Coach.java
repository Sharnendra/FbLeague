package com.footballleague.sapient.apibeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coach {

	@JsonProperty("coach_name")
	private String coachName;
	
	@JsonProperty("coach_country")
	private String coachCountry;
	
	@JsonProperty("coach_age")
    private int coachAge;

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getCoachCountry() {
		return coachCountry;
	}

	public void setCoachCountry(String coachCountry) {
		this.coachCountry = coachCountry;
	}

	public int getCoachAge() {
		return coachAge;
	}

	public void setCoachAge(int coachAge) {
		this.coachAge = coachAge;
	}
}
