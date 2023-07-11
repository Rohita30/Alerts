package com.alerts.Dto;

public class AlertsDto2 { 
	
	private Long alertsId;
	
	private Long userId;
	
	private Long productId;
	
	private Float alertsThresholdPrice;

	public AlertsDto2(Long alertsId, Long userId, Long productId, Float alertsThresholdPrice) {
		super();
		this.alertsId = alertsId;
		this.userId = userId;
		this.productId = productId;
		this.alertsThresholdPrice = alertsThresholdPrice;
	}

	public AlertsDto2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getAlertsId() {
		return alertsId;
	}

	public void setAlertsId(Long alertsId) {
		this.alertsId = alertsId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Float getAlertsThresholdPrice() {
		return alertsThresholdPrice;
	}

	public void setAlertsThresholdPrice(Float alertsThresholdPrice) {
		this.alertsThresholdPrice = alertsThresholdPrice;
	}
	
	

}
