package com.flight.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.flight.entity.Flights;

@Repository
public interface FlightRepository extends MongoRepository<Flights, Integer>{
	
	public Flights findByFlightId(Integer flightId);
}
