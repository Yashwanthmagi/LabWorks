package com.cg.citypark.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ParkingFloor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long parkingFloorId;	
	private String floorNumber;
	private String numberOfParkingSlot;
	
	public Long getParkingFloorId() {
		return parkingFloorId;
	}
	public void setParkingFloorId(Long parkingFloorId) {
		this.parkingFloorId = parkingFloorId;
	}
	public String getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}
	public String getNumberOfParkingSlot() {
		return numberOfParkingSlot;
	}
	public void setNumberOfParkingSlot(String numberOfParkingSlot) {
		this.numberOfParkingSlot = numberOfParkingSlot;
	}
	
	
}
