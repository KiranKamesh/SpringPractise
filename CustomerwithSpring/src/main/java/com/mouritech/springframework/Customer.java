package com.mouritech.springframework;

import org.springframework.stereotype.Service;

@Service("customerdetails")
public class Customer {
	private String custName;
	private Integer custId;
	private Double custSalary;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String custName, Integer custId, Double custSalary) {
		super();
		this.custName = custName;
		this.custId = custId;
		this.custSalary = custSalary;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public Double getCustSalary() {
		return custSalary;
	}

	public void setCustSalary(Double custSalary) {
		this.custSalary = custSalary;
	}

	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custId=" + custId + ", custSalary=" + custSalary + "]";
	}
	
	
	

}
