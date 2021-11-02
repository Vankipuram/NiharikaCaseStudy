package com.flight.dao;

public class BookingDao {

	private Integer flightId;
	private String date;
	
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "BookingDao [flightId=" + flightId + ", date=" + date + "]";
	}
	
}
