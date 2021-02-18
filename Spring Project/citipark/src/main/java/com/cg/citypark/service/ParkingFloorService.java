package com.cg.citypark.service;

import com.cg.citypark.beans.ParkingFloor;

public interface ParkingFloorService {

	ParkingFloor createParkingFloor(ParkingFloor floor);

	Iterable<ParkingFloor> fetchingAlleParkingFloor();

	ParkingFloor fetchParkingFloorById(Long parkingFloorId);

}
