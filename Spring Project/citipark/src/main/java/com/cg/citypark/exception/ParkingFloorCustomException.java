package com.cg.citypark.exception;

import com.cg.citypark.beans.ParkingFloor;

public class ParkingFloorCustomException {

	public static void validateFloor(ParkingFloor floor) {
		if (floor.getFloorNumber() == null || floor.getFloorNumber().isEmpty()) {
			throw new IllegalArgumentException("please provide valid FloorNumber");
		}
		if (floor.getNumberOfParkingSlot() == null || floor.getNumberOfParkingSlot().isEmpty()) {
			throw new IllegalArgumentException("please provide valid input");
		}
	}

}
