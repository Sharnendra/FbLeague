package com.footballleague.sapient.constants;

/**
 * this class contain all error message
 */
public class ErrorConstants {

	public static final String APIFOOTBALL_RESPONSE_EXCEPTION_CODE = "CODE0000001";
	public static final String APIFOOTBALL_RESPONSE_EXCEPTION_MESSAGE = "Call to API Football service returns with HttpStatus : ";
	public static final String UNKNOWN_ERROR_CODE = "UNKNOWNERROR";
	public static final String UNKNOWN_ERROR_MESSAGE = "Something went wrong please try again after some time.";
	public static final String COUTRIES_NOT_FOUND = "Service did not return any country list to populate.";
	public static final String REST_TEMPLATE_CALL_FAILED = "Rest ApI returns with exception ";
	public static final String LEAGUES_NOT_FOUND = "There is no leagues found for selected country name/ id.";
	public static final String NO_STRANDING_LIST_FOUND = "No Stranding detail list found from the service to select from.";
	public static final String TEAMS_NOT_FOUND = "No Team list found for the selected league.";
	public static final String DATA_NOT_FOUND_FOR_STRNDING = "Data Not Found for selected country, team, and league.";
}
