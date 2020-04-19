package com.amsidh.mvc.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CAR")
public class FourWheeler extends Vehicle {

	private String wheelHandler;

	public String getWheelHandler() {
		return wheelHandler;
	}

	public void setWheelHandler(String wheelHandler) {
		this.wheelHandler = wheelHandler;
	}

}
