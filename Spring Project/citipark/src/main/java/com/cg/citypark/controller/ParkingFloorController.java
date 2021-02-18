package com.cg.citypark.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.citypark.beans.ParkingFloor;
import com.cg.citypark.service.ParkingFloorService;

@RestController
@RequestMapping("floor/api")
public class ParkingFloorController {
	
	@Autowired
	private ParkingFloorService parkingFloorService;
	
	@PostMapping("/create")
	public ResponseEntity<?> createParkingFloor(@RequestBody ParkingFloor floor){
		ParkingFloor parkingFloor = parkingFloorService.createParkingFloor(floor);
		return new ResponseEntity<ParkingFloor>(parkingFloor, HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchallfloors")
	public Iterable<ParkingFloor> fetchingAlleParkingFloor(){
		return  parkingFloorService.fetchingAlleParkingFloor();
	}
	
	@GetMapping("/fetchfloorbyid")
	public ResponseEntity<?> fetchParkingFloorById(@RequestParam(value = "parkingFloorId") Long parkingFloorId){
		ParkingFloor parkingFloor = parkingFloorService.fetchParkingFloorById(parkingFloorId);
		return new ResponseEntity<ParkingFloor>(parkingFloor, HttpStatus.OK);
	}

}