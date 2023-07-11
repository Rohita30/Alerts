package com.alerts.Dto;

public class AlertsUpdateDto { 
	
	private Float alertsThresholdPrice;

	public AlertsUpdateDto(Float alertsThresholdPrice) {
		super();
		this.alertsThresholdPrice = alertsThresholdPrice;
	}

	public AlertsUpdateDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Float getAlertsThresholdPrice() {
		return alertsThresholdPrice;
	}

	public void setAlertsThresholdPrice(Float alertsThresholdPrice) {
		this.alertsThresholdPrice = alertsThresholdPrice;
	}
	
	

}
