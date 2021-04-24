package com.footballleague.sapient.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.footballleague.sapient.apibeans.FbApiResponseData;
import com.footballleague.sapient.apibeans.FbApiRestResponse;
import com.footballleague.sapient.apibeans.StrandingBean;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StrandingBeanResponse extends FbApiRestResponse implements FbApiResponseData {

	public StrandingBeanResponse(List<StrandingBean> strandings) {
		this.strandings = strandings;
	}

	@JsonProperty(value = "Response")
	private List<StrandingBean> strandings;

	public List<StrandingBean> getStrandings() {
		return strandings;
	}

	public void setStrandings(List<StrandingBean> strandings) {
		this.strandings = strandings;
	}
}
