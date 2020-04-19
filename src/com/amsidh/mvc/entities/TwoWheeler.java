package com.amsidh.mvc.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="BIKE")
public class TwoWheeler extends Vehicle {

	private String steringHandler;

	public String getSteringHandler() {
		return steringHandler;
	}

	public void setSteringHandler(String steringHandler) {
		this.steringHandler = steringHandler;
	}

	
	

}
