package com.flight.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.BookingDao;
import com.flight.entity.Flights;
import com.flight.repository.FlightRepository;

@Service
public class FlightService {
	@Autowired 
	private FlightRepository flightRepo;
	
	public Flights addFlight(Flights flight) {
		return flightRepo.save(flight);
	}
	public void deleteFlight(Flights flight) {
		flightRepo.delete(flight);
	}
	public void deleteFlightbyId(Integer flightId) {
		flightRepo.deleteById(flightId);
	}
	public Flights updateFlight(Flights flight) {
		return flightRepo.save(flight);

	}
	public Flights findflightbyId(Integer flightId) {
		return flightRepo.findByFlightId(flightId);
	}
	// in this i have to fetch the flight id and date at which user booked its flight currently i am giving it the input 
	public BookingDao getIdDate() {
		List<Flights> lst = flightRepo.findAll();
		BookingDao bd = new BookingDao();
		bd.setFlightId(lst.get(1).getFlightId());
		bd.setDate(lst.get(1).getDate());
		return bd;
	}
	public List<Integer> getFlightId(){
		List<Flights> lst = flightRepo.findAll();
		List<Integer> out = new ArrayList<>();
		for(int i = 0; i < lst.size(); i ++)
			out.add(lst.get(i).getFlightId());
		return out;
		}
	
	//public List<Flights> showFlightbyId(Integer flightId) {
		//List<Flights> list =flightRepo.findById(flightId);
		//return list.stream().filter(flight-> (flight.getFlightId().equals(flightId))).toList();
	//}
	
	public List<Flights> getFlights(String flightFrom, String flightTo, String date){
		List<Flights> lst = flightRepo.findAll();
		return lst.stream()
				.filter(flight-> (flight.getFlightFrom().equals(flightFrom) && flight.getFlightTo().equals(flightTo)&& flight.getDate().equals(date)))
				.toList();
	}
	
	public List<Flights> getallFlights(Flights flight){
		return  flightRepo.findAll();
	}
}
