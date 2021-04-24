package com.footballleague.sapient.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballleague.sapient.apibeans.FootBallApiExchange;
import com.footballleague.sapient.apibeans.SingleRequestBean;
import com.footballleague.sapient.apibeans.StrandingBean;
import com.footballleague.sapient.beans.StrandingBeanResponse;
import com.footballleague.sapient.constants.ErrorConstants;
import com.footballleague.sapient.exception.FbStrandingResponseException;
import com.footballleague.sapient.util.GenericsConstantUtilty;

@Service
public class StrandingService {

	@Autowired
	private FootBallApiExchange apiExchange;

	public StrandingBeanResponse getStranding(String leagueId) {
		try {
			StrandingBean[] stranding = apiExchange.getStranding(leagueId);
			if(GenericsConstantUtilty.isNullOrEmpty(stranding)) {
				throw new FbStrandingResponseException(ErrorConstants.NO_STRANDING_LIST_FOUND);
			}
			return GenericsConstantUtilty.strandingBeanResponseTranslator(stranding);
		}catch (Exception e) {
			throw new FbStrandingResponseException(ErrorConstants.REST_TEMPLATE_CALL_FAILED+e);
		}
	}

	public StrandingBeanResponse getStrandingDetails(SingleRequestBean countryDetails) {
		StrandingBeanResponse response = null;
		try {
			StrandingBean[] stranding = apiExchange.getStranding(countryDetails.getLeagueId());
			if(GenericsConstantUtilty.isNullOrEmpty(stranding)) {
				throw new FbStrandingResponseException(ErrorConstants.NO_STRANDING_LIST_FOUND);
			}
			response = GenericsConstantUtilty
					.strandingBeanResponseTranslator(stranding);
			StrandingBean strandingBean = GenericsConstantUtilty
					.getStrandingDetails(response.getStrandings(), countryDetails);
			if(GenericsConstantUtilty.isNullOrEmpty(strandingBean)) {
				response.setMessage(ErrorConstants.DATA_NOT_FOUND_FOR_STRNDING);
				response.setStrandings(null);
				return response;
			}
			response.setStrandings(new ArrayList<StrandingBean>(Arrays.asList(strandingBean)));
			return response;
		}catch (Exception e) {
			throw new FbStrandingResponseException(ErrorConstants.REST_TEMPLATE_CALL_FAILED+e);
		}
	}

}
