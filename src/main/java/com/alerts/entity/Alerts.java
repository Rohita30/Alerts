package com.alerts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Alerts {

	@Id
	@GeneratedValue
	private Long alertsId;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	@OneToOne
	@JoinColumn(name = "product_id")
	private Product product;
	@Column
	private Float alertsThresholdPrice;

	public Alerts(Long alertsId, User user, Product product, Float alertsThresholdPrice) {
		super();
		this.alertsId = alertsId;
		this.user = user;
		this.product = product;
		this.alertsThresholdPrice = alertsThresholdPrice;
	}

	public Alerts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getAlertsId() {
		return alertsId;
	}

	public void setAlertsId(Long alertsId) {
		this.alertsId = alertsId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Float getAlertsThresholdPrice() {
		return alertsThresholdPrice;
	}

	public void setAlertsThresholdPrice(Float alertsThresholdPrice) {
		this.alertsThresholdPrice = alertsThresholdPrice;
	}

}
