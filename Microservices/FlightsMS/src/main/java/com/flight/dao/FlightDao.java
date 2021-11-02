package com.flight.dao;

import com.flight.entity.Flights;

public class FlightDao {
	private Integer flightId;
	private String flightName;
	private  String flightFrom;
	private String flightTo;
	private String date;
	private Double fare;
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightFrom() {
		return flightFrom;
	}
	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}
	public String getFlightTo() {
		return flightTo;
	}
	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Flights getFlightObject(FlightDao object) {
		Flights flightObject = new Flights();
		flightObject.setFlightId(object.getFlightId());
		flightObject.setFlightName(object.getFlightName());
		flightObject.setFlightFrom(object.getFlightFrom());;
		flightObject.setFlightTo(object.getFlightTo());
		flightObject.setDate(object.getDate());
		flightObject.setFare(object.getFare());
		return flightObject;
	}
	
}
