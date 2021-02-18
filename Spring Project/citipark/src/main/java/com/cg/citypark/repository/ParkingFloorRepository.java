package com.cg.citypark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.citypark.beans.ParkingFloor;

@Repository
public interface ParkingFloorRepository extends JpaRepository<ParkingFloor, Long> {

}
