package com.footballleague.sapient.beans;

import java.util.ArrayList;
import java.util.List;

import com.footballleague.sapient.apibeans.CountryBean;

public class CountryBeanResponse{

	public CountryBeanResponse(List<CountryBean> countryList) {
		this.countryList = countryList;
	}
	private List<CountryBean> countryList = new ArrayList<>();

	public List<CountryBean> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<CountryBean> countryList) {
		this.countryList = countryList;
	}
}
