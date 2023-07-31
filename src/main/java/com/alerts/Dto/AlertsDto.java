package com.alerts.Dto;

public class AlertsDto { 
	
	private Long userId;
	
	private Long productId;
	
	private Float alertsThresholdPrice;

	public AlertsDto(Long userId, Long productId, Float alertsThresholdPrice) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.alertsThresholdPrice = alertsThresholdPrice;
	}

	public AlertsDto() {
		super();
		// TODO Auto-generated constructor stub
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
