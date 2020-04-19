package com.amsidh.mvc.entities.tableperclass;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {

	private String steringHandler;

	public String getSteringHandler() {
		return steringHandler;
	}

	public void setSteringHandler(String steringHandler) {
		this.steringHandler = steringHandler;
	}

	
	

}
