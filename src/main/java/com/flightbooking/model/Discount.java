package com.flightbooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="discount") 
public class Discount {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long discount_id;
	
    private String discount_code;  
    
    private String discount_percentage;

	public Long getDiscount_id() {
		return discount_id;
	}

	public void setDiscount_id(Long discount_id) {
		this.discount_id = discount_id;
	}

	public String getDiscount_code() {
		return discount_code;
	}

	public void setDiscount_code(String discount_code) {
		this.discount_code = discount_code;
	}

	public String getDiscount_percentage() {
		return discount_percentage;
	}

	public void setDiscount_percentage(String discount_percentage) {
		this.discount_percentage = discount_percentage;
	}

	@Override
	public String toString() {
		return "Discount [discount_id=" + discount_id + ", discount_code=" + discount_code + ", discount_percentage="
				+ discount_percentage + "]";
	}
  
}
