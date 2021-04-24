package com.footballleague.sapient.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.footballleague.sapient.apibeans.CountryBean;
import com.footballleague.sapient.apibeans.FbApiResponseData;
import com.footballleague.sapient.apibeans.FbApiRestResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryBeanResponse extends FbApiRestResponse implements FbApiResponseData {

	public CountryBeanResponse(List<CountryBean> countryList) {
		this.countryList = countryList;
	}

	@JsonProperty(value = "Response")
	private List<CountryBean> countryList;

	public List<CountryBean> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<CountryBean> countryList) {
		this.countryList = countryList;
	}
}
