package com.test1;

public class CacheResponse {
	private Integer cacheId;
	private String cacheOwner;
	private boolean activeAccount;
	private Integer cacheTypeId;
	private String cacheType;
	private String cacheStatus;
	private Integer cacheDescription;
	private Integer firstLevel;
	private String parentId;
	private Integer flushInterval;
	private String readOnly;
	private String status;
	private String eviction;

	public CacheResponse() {

	}

	public CacheResponse(Integer cacheId, String cacheOwner, boolean activeAccount, Integer cacheTypeId,
			String cacheType, String cacheStatus, Integer cacheDescription, Integer firstLevel, String parentId,
			Integer flushInterval, String readOnly, String status, String eviction) {
		super();
		this.cacheId = cacheId;
		this.cacheOwner = cacheOwner;
		this.activeAccount = activeAccount;
		this.cacheTypeId = cacheTypeId;
		this.cacheType = cacheType;
		this.cacheStatus = cacheStatus;
		this.cacheDescription = cacheDescription;
		this.firstLevel = firstLevel;
		this.parentId = parentId;
		this.flushInterval = flushInterval;
		this.readOnly = readOnly;
		this.status = status;
		this.eviction = eviction;
	}

	public Integer getCacheId() {
		return cacheId;
	}

	public void setCacheId(Integer cacheId) {
		this.cacheId = cacheId;
	}

	public String getCacheOwner() {
		return cacheOwner;
	}

	public void setCacheOwner(String cacheOwner) {
		this.cacheOwner = cacheOwner;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public Integer getCacheTypeId() {
		return cacheTypeId;
	}

	public void setCacheTypeId(Integer cacheTypeId) {
		this.cacheTypeId = cacheTypeId;
	}

	public String getCacheType() {
		return cacheType;
	}

	public void setCacheType(String cacheType) {
		this.cacheType = cacheType;
	}

	public String getCacheStatus() {
		return cacheStatus;
	}

	public void setCacheStatus(String cacheStatus) {
		this.cacheStatus = cacheStatus;
	}

	public Integer getCacheDescription() {
		return cacheDescription;
	}

	public void setCacheDescription(Integer cacheDescription) {
		this.cacheDescription = cacheDescription;
	}

	public Integer getFirstLevel() {
		return firstLevel;
	}

	public void setFirstLevel(Integer firstLevel) {
		this.firstLevel = firstLevel;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Integer getFlushInterval() {
		return flushInterval;
	}

	public void setFlushInterval(Integer flushInterval) {
		this.flushInterval = flushInterval;
	}

	public String getReadOnly() {
		return readOnly;
	}

	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEviction() {
		return eviction;
	}

	public void setEviction(String eviction) {
		this.eviction = eviction;
	}

}
