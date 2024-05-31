package com.test1;

public class ElasticCloudFormationData {
	private String cloudFormationCode;
	private String cloudFormationName;
	private String localCurrency;
	private String tradeCurrency;
	private String shortDescription;
	private String dataIndicator;
	private String consumedBy;
	private Integer dataArc;
	private String params;
	private String filter;
	private String status;

	public ElasticCloudFormationData() {

	}

	public ElasticCloudFormationData(String cloudFormationCode, String cloudFormationName, String localCurrency,
			String tradeCurrency, String shortDescription, String dataIndicator, String consumedBy, Integer dataArc,
			String params, String filter, String status) {
		super();
		this.cloudFormationCode = cloudFormationCode;
		this.cloudFormationName = cloudFormationName;
		this.localCurrency = localCurrency;
		this.tradeCurrency = tradeCurrency;
		this.shortDescription = shortDescription;
		this.dataIndicator = dataIndicator;
		this.consumedBy = consumedBy;
		this.dataArc = dataArc;
		this.params = params;
		this.filter = filter;
		this.status = status;
	}

	public String getCloudFormationCode() {
		return cloudFormationCode;
	}

	public void setCloudFormationCode(String cloudFormationCode) {
		this.cloudFormationCode = cloudFormationCode;
	}

	public String getCloudFormationName() {
		return cloudFormationName;
	}

	public void setCloudFormationName(String cloudFormationName) {
		this.cloudFormationName = cloudFormationName;
	}

	public String getLocalCurrency() {
		return localCurrency;
	}

	public void setLocalCurrency(String localCurrency) {
		this.localCurrency = localCurrency;
	}

	public String getTradeCurrency() {
		return tradeCurrency;
	}

	public void setTradeCurrency(String tradeCurrency) {
		this.tradeCurrency = tradeCurrency;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDataIndicator() {
		return dataIndicator;
	}

	public void setDataIndicator(String dataIndicator) {
		this.dataIndicator = dataIndicator;
	}

	public String getConsumedBy() {
		return consumedBy;
	}

	public void setConsumedBy(String consumedBy) {
		this.consumedBy = consumedBy;
	}

	public Integer getDataArc() {
		return dataArc;
	}

	public void setDataArc(Integer dataArc) {
		this.dataArc = dataArc;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
