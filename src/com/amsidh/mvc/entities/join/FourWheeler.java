package com.amsidh.mvc.entities.join;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {

	private String wheelHandler;

	public String getWheelHandler() {
		return wheelHandler;
	}

	public void setWheelHandler(String wheelHandler) {
		this.wheelHandler = wheelHandler;
	}

}
