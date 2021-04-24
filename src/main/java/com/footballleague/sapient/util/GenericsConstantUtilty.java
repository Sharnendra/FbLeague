package com.footballleague.sapient.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.footballleague.sapient.apibeans.LeagueBean;
import com.footballleague.sapient.apibeans.SingleRequestBean;
import com.footballleague.sapient.apibeans.StrandingBean;
import com.footballleague.sapient.apibeans.TeamBean;
import com.footballleague.sapient.beans.LeagueBeanResponse;
import com.footballleague.sapient.beans.StrandingBeanResponse;
import com.footballleague.sapient.beans.TeamBeanResponse;
import com.footballleague.sapient.exception.RestTemplateResponseErrorHandler;

@Component
public class GenericsConstantUtilty {
	
	public static final RestTemplate REST_TEMPLATE =new RestTemplate();
	static
	{
		REST_TEMPLATE.setErrorHandler(new RestTemplateResponseErrorHandler());
	}
	
	public static final String REST_EXCEPTION_RESPONSE=" Returning Response : ";
	
	/**
	 * This method checks whether the source String is empty.
	 *
	 * @param source String
	 * @return true if source is empty, false if source is not empty.
	 */
	public static boolean isNullOrEmpty(String source) {

		return (null == source || "".equals(source.trim()));
	}

	/**
	 * This method checks whether the source Collection is empty.
	 *
	 * @param source Collection
	 * @return true if source Collection is empty, false if source Collection is not
	 *         empty.
	 */
	public static boolean isNullOrEmpty(Collection<?> source) {

		return (null == source || source.isEmpty());
	}

	/**
	 * This method checks whether the source Object is empty.
	 *
	 * @param source Object
	 * @return true if source is empty, false if source is not empty.
	 */
	public static boolean isNullOrEmpty(Object source) {

		return (null == source);
	}

	/**
	 * This method checks whether the source array is empty.
	 *
	 * @param source Object[]
	 * @return true if source array is empty, false if source array is not empty.
	 */
	public static boolean isNullOrEmpty(Object[] source) {

		return (null == source || source.length <= 0);
	}

	/**
	 * This method checks whether the source String is not empty.
	 *
	 * @param source String
	 * @return true if source is not empty, false if source is empty.
	 */
	public static boolean isNotEmpty(String source) {

		return !isNullOrEmpty(source);
	}

	/**
	 * This method checks whether the source Collection is not empty.
	 *
	 * @param source Collection
	 * @return true if source Collection is not empty, false if source Collection is
	 *         empty.
	 */
	public static boolean isNotEmpty(Collection<?> source) {

		return !isNullOrEmpty(source);
	}

	/**
	 * This method checks whether the source Object is not empty.
	 *
	 * @param source Object
	 * @return true if source is not empty, false if source is empty.
	 */
	public static boolean isNotEmpty(Object source) {

		return !isNullOrEmpty(source);
	}

	/**
	 * This method checks whether the source Object[] is not empty.
	 *
	 * @param source Object[]
	 * @return true if source array is not empty, false if source array is empty.
	 */
	public static boolean isNotEmpty(Object[] source) {

		return !isNullOrEmpty(source);
	}
	
	public static LeagueBeanResponse leagueBeanResponseTranslator(LeagueBean[] leagues) {
		LeagueBeanResponse leagueBeanResponse = new LeagueBeanResponse(Arrays.asList(leagues));
		leagueBeanResponse.setStatus("Success");
		leagueBeanResponse.setMessage("Data Found");
		return leagueBeanResponse;
	}
	
	public static TeamBeanResponse teamBeanResponseTranslator(TeamBean[] listofTeams) {
		TeamBeanResponse teamBeanResponse = new TeamBeanResponse(Arrays.asList(listofTeams));
		teamBeanResponse.setStatus("Success");
		teamBeanResponse.setMessage("Data Found");
		return teamBeanResponse;
	}
	
	public static StrandingBeanResponse strandingBeanResponseTranslator(StrandingBean[] strandings) {
		StrandingBeanResponse strandingBeanResponse = new StrandingBeanResponse(Arrays.asList(strandings));
		strandingBeanResponse.setStatus("Success");
		strandingBeanResponse.setMessage("Data Found");
		return new StrandingBeanResponse(Arrays.asList(strandings));
	}
	
	public static LeagueBean getLeagueDetails(List<LeagueBean> list, SingleRequestBean countryDetails) {
		return Optional.ofNullable(list.stream()
				.filter(x -> x.getCountryName().equals(countryDetails.getCountryName()))
				.findFirst())
				.map(x -> x.get())
				.orElse(null);
	}
	
	public static TeamBean getTeamDetails(List<TeamBean> teams, SingleRequestBean data) {
		return Optional.ofNullable(teams.stream().filter(x -> x.getTeamKey().equals(data.getTeamId()) 
				&& x.getTeamName().equals(data.getTeamName()))
				.findFirst())
				.map(x -> x.get())
				.orElse(null); 
	}

	public static StrandingBean getStrandingDetails(List<StrandingBean> strandings, SingleRequestBean countryDetails) {
		StrandingBean data = null;
		Optional<StrandingBean> resp = strandings.stream()
		.filter(x -> x.getTeamId().equals(countryDetails.getTeamId())
				&& x.getTeamName().equals(countryDetails.getTeamName())
				&& x.getLeagueId().equals(countryDetails.getLeagueId())
				&& x.getLeagueName().equals(countryDetails.getLeagueName())
				&& x.getCountryname().equals(countryDetails.getCountryName()))
		.findFirst();
		try {
			data = resp.get();
		}catch (Exception e) {
		}
		return data;
	}
	
	public static String generateRequestId() {
		return UUID.randomUUID().toString();
	}	
}
