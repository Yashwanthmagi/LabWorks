package com.cg.citypark.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.citypark.beans.ParkingFloor;
import com.cg.citypark.exception.ParkingFloorCustomException;
import com.cg.citypark.repository.ParkingFloorRepository;

@Service
public class ParkingFloorServiceImpl implements ParkingFloorService {
	
	@Autowired
	private ParkingFloorRepository parkingFloorRepository;

	@Override
	public ParkingFloor createParkingFloor(ParkingFloor floor) {
		ParkingFloorCustomException.validateFloor(floor);
		return parkingFloorRepository.save(floor);
	}

	@Override
	public Iterable<ParkingFloor> fetchingAlleParkingFloor() {
		return parkingFloorRepository.findAll();
	}

	@Override
	public ParkingFloor fetchParkingFloorById(Long parkingFloorId) {
		return parkingFloorRepository.getOne(parkingFloorId);
	}


	
	
}
