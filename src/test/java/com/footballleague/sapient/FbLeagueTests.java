package com.footballleague.sapient;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.footballleague.sapient.apibeans.FootBallApiExchange;
import com.footballleague.sapient.apibeans.SingleRequestBean;
import com.footballleague.sapient.beans.CountryBeanResponse;
import com.footballleague.sapient.beans.LeagueBeanResponse;
import com.footballleague.sapient.beans.StrandingBeanResponse;
import com.footballleague.sapient.beans.TeamBeanResponse;
import com.footballleague.sapient.constants.ErrorConstants;
import com.footballleague.sapient.exception.FbStrandingResponseException;
import com.footballleague.sapient.service.CountryService;
import com.footballleague.sapient.service.LeaguesService;
import com.footballleague.sapient.service.StrandingService;
import com.footballleague.sapient.service.TeamService;
import com.footballleague.sapient.util.GenericsConstantUtilty;
import com.footballleague.sapient.utils.TestUtility;

@SpringBootTest
public class FbLeagueTests {

	@InjectMocks
	private CountryService country;
	
	@InjectMocks
	private LeaguesService league;
	
	@InjectMocks
	private TeamService team;
	
	@InjectMocks
	private StrandingService stranding;
	
	@Mock
	private FootBallApiExchange apiExchange;
	
	@Mock
	private GenericsConstantUtilty utility;
	
	/*
	 * Test Cases for Country Service
	 * */
	@Test
	public void testCountryBeanResponse() {
		Mockito.when(apiExchange.getCountries()).thenReturn(TestUtility.getCountryBeanArray());
		CountryBeanResponse countries = country.getCountries();
		assertNotNull(countries);
		assertEquals(2, countries.getCountryList().size());
	}
	
	@Test
	public void testCountryBeanResponseWithException() throws FbStrandingResponseException{
		Mockito.when(apiExchange.getCountries()).thenReturn(null);
		try {
			country.getCountries();
		}catch (FbStrandingResponseException e) {
			Assertions.assertEquals(true, e.getErrorMessage().contains(ErrorConstants.COUTRIES_NOT_FOUND));
		}
	}
	
	@Test
	public void testCountryBeanResponseWithAPICallFail() throws FbStrandingResponseException{
		Mockito.when(apiExchange.getCountries()).thenThrow(new FbStrandingResponseException(ErrorConstants.REST_TEMPLATE_CALL_FAILED));
		try {
			country.getCountries();
		}catch (FbStrandingResponseException e) {
			Assertions.assertEquals(true, e.getErrorMessage().contains(ErrorConstants.REST_TEMPLATE_CALL_FAILED));
		}
	}
	
	/*
	 * Test Cases for League Service
	 * */
	@Test
	public void testLeagueBeanResponse() {
		Mockito.when(apiExchange.getLeaguesList(Mockito.any(String.class))).thenReturn(TestUtility.getLeaguesBeanArray());
		LeagueBeanResponse leaguesList = league.getLeaguesList("2");
		assertNotNull(leaguesList);
		assertEquals(2, leaguesList.getLeagues().size());
	}
	
	@Test
	public void testLeagueBeanResponseWithException() throws FbStrandingResponseException{
		Mockito.when(apiExchange.getLeaguesList(Mockito.any(String.class))).thenReturn(null);
		try {
			league.getLeaguesList("2");
		}catch (FbStrandingResponseException e) {
			Assertions.assertEquals(true, e.getErrorMessage().contains(ErrorConstants.LEAGUES_NOT_FOUND));
		}
	}
	
	@Test
	public void testLeagueBeanResponseWithAPICallFail() throws FbStrandingResponseException{
		Mockito.when(apiExchange.getLeaguesList(Mockito.any(String.class))).thenThrow(new FbStrandingResponseException(ErrorConstants.REST_TEMPLATE_CALL_FAILED));
		try {
			league.getLeaguesList("2");
		}catch (FbStrandingResponseException e) {
			Assertions.assertEquals(true, e.getErrorMessage().contains(ErrorConstants.REST_TEMPLATE_CALL_FAILED));
		}
	}
	
	/*
	 * Test Cases for Team Service
	 * */
	@Test
	public void testTeamBeanResponse() {
		Mockito.when(apiExchange.getTeams(Mockito.any(String.class))).thenReturn(TestUtility.getTeamBeanArray());
		TeamBeanResponse teams = team.getTeams("2");
		assertNotNull(teams);
		assertEquals(2, teams.getTeams().size());
	}
	
	@Test
	public void testTeamBeanResponseWithException() throws FbStrandingResponseException{
		Mockito.when(apiExchange.getTeams(Mockito.any(String.class))).thenReturn(null);
		try {
			team.getTeams("2");
		}catch (FbStrandingResponseException e) {
			Assertions.assertEquals(true, e.getErrorMessage().contains(ErrorConstants.TEAMS_NOT_FOUND));
		}
	}
	
	@Test
	public void testTeamBeanResponseWithAPICallFail() throws FbStrandingResponseException{
		Mockito.when(apiExchange.getTeams(Mockito.any(String.class))).thenThrow(new FbStrandingResponseException(ErrorConstants.REST_TEMPLATE_CALL_FAILED));
		try {
			team.getTeams("2");
		}catch (FbStrandingResponseException e) {
			Assertions.assertEquals(true, e.getErrorMessage().contains(ErrorConstants.REST_TEMPLATE_CALL_FAILED));
		}
	}
	
	/*
	 * Test Cases for Stranding Service for Stranding List
	 * */
	@Test
	public void testStrandingListBeanResponse() {
		Mockito.when(apiExchange.getStranding(Mockito.any(String.class))).thenReturn(TestUtility.getStrandingBean());
		StrandingBeanResponse strandings = stranding.getStranding("2");
		assertNotNull(strandings);
		assertEquals(2, strandings.getStrandings().size());
	}
	
	@Test
	public void testStrandingListBeanResponseWithException() throws FbStrandingResponseException{
		Mockito.when(apiExchange.getStranding(Mockito.any(String.class))).thenReturn(null);
		try {
			stranding.getStranding("2");
		}catch (FbStrandingResponseException e) {
			Assertions.assertEquals(true, e.getErrorMessage().contains(ErrorConstants.NO_STRANDING_LIST_FOUND));
		}
	}
	
	@Test
	public void testStrandingListBeanResponseWithAPICallFail() throws FbStrandingResponseException{
		Mockito.when(apiExchange.getStranding(Mockito.any(String.class))).thenThrow(new FbStrandingResponseException(ErrorConstants.REST_TEMPLATE_CALL_FAILED));
		try {
			stranding.getStranding("2");
		}catch (FbStrandingResponseException e) {
			Assertions.assertEquals(true, e.getErrorMessage().contains(ErrorConstants.REST_TEMPLATE_CALL_FAILED));
		}
	}
	
	/*
	 * Test Cases for Stranding Service for selected Stranding Details
	 * */
	@Test
	public void testStrandingBeanResponse() {
		SingleRequestBean countryDetails = TestUtility.getSingleRequestBean();
		Mockito.when(apiExchange.getStranding(Mockito.any(String.class))).thenReturn(TestUtility.getStrandingBean());
		StrandingBeanResponse strandings = stranding.getStrandingDetails(countryDetails);
		assertNotNull(strandings);
		assertEquals(1, strandings.getStrandings().size());
	}
	
	@Test
	public void testStrandingBeanResponseWithException() throws FbStrandingResponseException{
		SingleRequestBean countryDetails = TestUtility.getSingleRequestBean();
		Mockito.when(apiExchange.getStranding(Mockito.any(String.class))).thenReturn(null);
		try {
			stranding.getStrandingDetails(countryDetails);
		}catch (FbStrandingResponseException e) {
			Assertions.assertEquals(true, e.getErrorMessage().contains(ErrorConstants.NO_STRANDING_LIST_FOUND));
		}
	}
	
	@Test
	public void testStrandingBeanResponseWithSecondryException() throws FbStrandingResponseException{
		SingleRequestBean countryDetails = TestUtility.getSingleRequestNullBean();
		Mockito.when(apiExchange.getStranding(Mockito.any(String.class))).thenReturn(TestUtility.getStrandingBean());
		StrandingBeanResponse strandings = stranding.getStrandingDetails(countryDetails);
		assertNotNull(strandings);
		assertEquals(ErrorConstants.DATA_NOT_FOUND_FOR_STRNDING, strandings.getMessage());
	}
	
	@Test
	public void testStrandingBeanResponseWithAPICallFail() throws FbStrandingResponseException{
		SingleRequestBean countryDetails = TestUtility.getSingleRequestBean();
		Mockito.when(apiExchange.getStranding(Mockito.any(String.class))).thenThrow(new FbStrandingResponseException(ErrorConstants.REST_TEMPLATE_CALL_FAILED));
		try {
			stranding.getStrandingDetails(countryDetails);
		}catch (FbStrandingResponseException e) {
			Assertions.assertEquals(true, e.getErrorMessage().contains(ErrorConstants.REST_TEMPLATE_CALL_FAILED));
		}
	}
}
