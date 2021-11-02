package com.flight.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Flight")

public class Flights {

	@Id
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
	public Flights() {
		
	}
	
	public Flights(Integer flightId,String flightName,String flightFrom,String flightTo,String date,Double fare) {
		super();
		this.flightId=flightId;
		this.flightName=flightName;
		this.flightFrom=flightFrom;
		this.flightTo=flightTo;
		this.date=date;
		this.fare=fare;
	}
	@Override
	public String toString() {
		return "Flights [flightId=" + flightId + ", flightName=" + flightName + ", flightFrom=" + flightFrom
				+ ", flightTo=" + flightTo + ", date=" + date + ", fare=" + fare + "]";
	}
	
}
