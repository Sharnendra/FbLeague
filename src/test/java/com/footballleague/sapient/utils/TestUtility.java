package com.footballleague.sapient.utils;

import com.footballleague.sapient.apibeans.CountryBean;
import com.footballleague.sapient.apibeans.LeagueBean;
import com.footballleague.sapient.apibeans.SingleRequestBean;
import com.footballleague.sapient.apibeans.StrandingBean;
import com.footballleague.sapient.apibeans.TeamBean;

public class TestUtility {

	public static CountryBean[] getCountryBeanArray() {
		CountryBean[] resp = new CountryBean[2];
		CountryBean ob = new CountryBean();
		ob.setCountryId(1);
		ob.setCountryName("name 1");
		ob.setCountryLogo("logo 1");
		resp[0] = ob;

		ob = new CountryBean();
		ob.setCountryId(2);
		ob.setCountryName("name 2");
		ob.setCountryLogo("logo 2");
		resp[1] = ob;
		return resp;
	}

	public static LeagueBean[] getLeaguesBeanArray() {
		LeagueBean[] resp = new LeagueBean[2];
		LeagueBean ob1 = new LeagueBean();
		ob1.setCountryId("1");
		ob1.setCountryName("name 1");
		ob1.setLeagueId("League 1");
		ob1.setLeagueName("league name 1");
		resp[0] = ob1;

		ob1 = new LeagueBean();
		ob1.setCountryId("2");
		ob1.setCountryName("name 2");
		ob1.setLeagueId("League 2");
		ob1.setLeagueName("league name 2");
		resp[1] = ob1;
		return resp;
	}

	public static TeamBean[] getTeamBeanArray() {
		TeamBean[] resp = new TeamBean[2];
		TeamBean ob1 = new TeamBean();
		ob1.setTeamKey("1");
		ob1.setTeamName("Team 1");
		resp[0] = ob1;

		ob1 = new TeamBean();
		ob1.setTeamKey("2");
		ob1.setTeamName("Team 2");
		resp[1] = ob1;
		return resp;
	}

	public static StrandingBean[] getStrandingBean() {
		StrandingBean[] resp = new StrandingBean[2];
		StrandingBean ob = new StrandingBean();
		ob.setTeamId("1");
		ob.setTeamName("Team 1");
		ob.setLeagueId("1");
		ob.setLeagueName("league name 1");
		ob.setCountryname("name 1");
		resp[0] = ob;

		ob = new StrandingBean();
		ob.setTeamId("2");
		ob.setTeamName("Team 2");
		ob.setLeagueId("2");
		ob.setLeagueName("league name 2");
		ob.setCountryname("name 2");
		resp[1] = ob;
		return resp;
	}

	public static SingleRequestBean getSingleRequestBean() {
		SingleRequestBean countryDetails = new SingleRequestBean();
		StrandingBean[] strandingBean = getStrandingBean();
		countryDetails.setCountryId(1);
		countryDetails.setCountryName(strandingBean[0].getCountryname());
		countryDetails.setLeagueId(strandingBean[0].getLeagueId());
		countryDetails.setLeagueName(strandingBean[0].getLeagueName());
		countryDetails.setTeamId(strandingBean[0].getTeamId());
		countryDetails.setTeamName(strandingBean[0].getTeamName());
		return countryDetails;
	}

	public static SingleRequestBean getSingleRequestNullBean() {
		SingleRequestBean countryDetails = new SingleRequestBean();
		countryDetails.setCountryId(3);
		countryDetails.setCountryName("CountryName");
		countryDetails.setLeagueId("LeagueId");
		countryDetails.setLeagueName("LeagueName");
		countryDetails.setTeamId("TeamId");
		countryDetails.setTeamName("TeamName");
		return countryDetails;
	}
}
