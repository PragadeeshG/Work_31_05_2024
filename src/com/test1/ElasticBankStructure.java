package com.test1;

public class ElasticBankStructure {
	private Integer recordKey;
	private Integer elasticCloudFormationCode;
	private String elasticCloudFormationCodePosition;
	private String elasticCloudFormationCodeLength;
	private String elasticCheckDigitsPosition;
	private String elasticCheckDigitsLength;
	private boolean elasticIdentifierPosition;
	private String elasticIdentifierLength;
	private String branchIdentifierPosition;
	private String branchIdentifierLength;
	private String elasticNationalIdLength;
	private String cacheNumberPosition;
	private String cacheNumberLength;
	private String elasticTotalLength;

	public ElasticBankStructure() {

	}

	public ElasticBankStructure(Integer recordKey, Integer elasticCloudFormationCode,
			String elasticCloudFormationCodePosition, String elasticCloudFormationCodeLength,
			String elasticCheckDigitsPosition, String elasticCheckDigitsLength, boolean elasticIdentifierPosition,
			String elasticIdentifierLength, String branchIdentifierPosition, String branchIdentifierLength,
			String elasticNationalIdLength, String cacheNumberPosition, String cacheNumberLength,
			String elasticTotalLength) {
		super();
		this.recordKey = recordKey;
		this.elasticCloudFormationCode = elasticCloudFormationCode;
		this.elasticCloudFormationCodePosition = elasticCloudFormationCodePosition;
		this.elasticCloudFormationCodeLength = elasticCloudFormationCodeLength;
		this.elasticCheckDigitsPosition = elasticCheckDigitsPosition;
		this.elasticCheckDigitsLength = elasticCheckDigitsLength;
		this.elasticIdentifierPosition = elasticIdentifierPosition;
		this.elasticIdentifierLength = elasticIdentifierLength;
		this.branchIdentifierPosition = branchIdentifierPosition;
		this.branchIdentifierLength = branchIdentifierLength;
		this.elasticNationalIdLength = elasticNationalIdLength;
		this.cacheNumberPosition = cacheNumberPosition;
		this.cacheNumberLength = cacheNumberLength;
		this.elasticTotalLength = elasticTotalLength;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public Integer getElasticCloudFormationCode() {
		return elasticCloudFormationCode;
	}

	public void setElasticCloudFormationCode(Integer elasticCloudFormationCode) {
		this.elasticCloudFormationCode = elasticCloudFormationCode;
	}

	public String getElasticCloudFormationCodePosition() {
		return elasticCloudFormationCodePosition;
	}

	public void setElasticCloudFormationCodePosition(String elasticCloudFormationCodePosition) {
		this.elasticCloudFormationCodePosition = elasticCloudFormationCodePosition;
	}

	public String getElasticCloudFormationCodeLength() {
		return elasticCloudFormationCodeLength;
	}

	public void setElasticCloudFormationCodeLength(String elasticCloudFormationCodeLength) {
		this.elasticCloudFormationCodeLength = elasticCloudFormationCodeLength;
	}

	public String getElasticCheckDigitsPosition() {
		return elasticCheckDigitsPosition;
	}

	public void setElasticCheckDigitsPosition(String elasticCheckDigitsPosition) {
		this.elasticCheckDigitsPosition = elasticCheckDigitsPosition;
	}

	public String getElasticCheckDigitsLength() {
		return elasticCheckDigitsLength;
	}

	public void setElasticCheckDigitsLength(String elasticCheckDigitsLength) {
		this.elasticCheckDigitsLength = elasticCheckDigitsLength;
	}

	public boolean isElasticIdentifierPosition() {
		return elasticIdentifierPosition;
	}

	public void setElasticIdentifierPosition(boolean elasticIdentifierPosition) {
		this.elasticIdentifierPosition = elasticIdentifierPosition;
	}

	public String getElasticIdentifierLength() {
		return elasticIdentifierLength;
	}

	public void setElasticIdentifierLength(String elasticIdentifierLength) {
		this.elasticIdentifierLength = elasticIdentifierLength;
	}

	public String getBranchIdentifierPosition() {
		return branchIdentifierPosition;
	}

	public void setBranchIdentifierPosition(String branchIdentifierPosition) {
		this.branchIdentifierPosition = branchIdentifierPosition;
	}

	public String getBranchIdentifierLength() {
		return branchIdentifierLength;
	}

	public void setBranchIdentifierLength(String branchIdentifierLength) {
		this.branchIdentifierLength = branchIdentifierLength;
	}

	public String getElasticNationalIdLength() {
		return elasticNationalIdLength;
	}

	public void setElasticNationalIdLength(String elasticNationalIdLength) {
		this.elasticNationalIdLength = elasticNationalIdLength;
	}

	public String getCacheNumberPosition() {
		return cacheNumberPosition;
	}

	public void setCacheNumberPosition(String cacheNumberPosition) {
		this.cacheNumberPosition = cacheNumberPosition;
	}

	public String getCacheNumberLength() {
		return cacheNumberLength;
	}

	public void setCacheNumberLength(String cacheNumberLength) {
		this.cacheNumberLength = cacheNumberLength;
	}

	public String getElasticTotalLength() {
		return elasticTotalLength;
	}

	public void setElasticTotalLength(String elasticTotalLength) {
		this.elasticTotalLength = elasticTotalLength;
	}

}
