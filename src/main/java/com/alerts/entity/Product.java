package com.alerts.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@GeneratedValue
	private Long productId;
	@Column
	private String productName;
	@Column
	private String productDescription;
	@Column
	private String productCategory;
	@Column
	private String productBrand;
	@Column
	private Float productPrice;

	@OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
	private Alerts alerts;

	public Alerts getAlerts() {
		return alerts;
	}

	public void setAlerts(Alerts alerts) {
		this.alerts = alerts;
	}

	public Product(Long productId, String productName, String productDescription, String productCategory,
			String productBrand, Float productPrice, Alerts alerts) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productCategory = productCategory;
		this.productBrand = productBrand;
		this.productPrice = productPrice;
		this.alerts = alerts;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public Float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}
}
