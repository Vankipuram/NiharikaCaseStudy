package com.flight.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dao.BookingDao;
import com.flight.dao.FlightDao;
import com.flight.entity.Flights;
import com.flight.services.FlightService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FlightController {
	@Autowired 
	private FlightService flightSer;
	
	
	FlightDao flightDao = new FlightDao();
	
	////////////////////////API for Admin\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	
	@GetMapping("/")
	public String show() {
		return "It's working";
	}
	
	@PostMapping("/addflight")
	public String addFlight(@RequestBody FlightDao flightDao) {
		Flights object = flightDao.getFlightObject(flightDao);
		flightSer.addFlight(object);
		return "Flight added";
	}
	@DeleteMapping("del/{id}")
	public String deleteFlight(@PathVariable("id") Integer flightId) {
		flightSer.deleteFlightbyId(flightId);
		return "flight deleted successfully";
	}
	@DeleteMapping("/deleteAll")
	public String deleteFlight(Flights flight) {
		flightSer.deleteFlight(flight);
		return "flight deleted successfully";
	}
	
	@PostMapping("/updateflight/{id}")
	public void updateFlight(@RequestBody Flights flight,@PathVariable Integer id) {
		System.out.println(flight + " " + id);
		flight.setFlightId(id);
		flightSer.updateFlight(flight);
		
	}
	
	@GetMapping("/find/{id}")
	public Flights findflightbyId(@PathVariable("id") Integer flightid) {
		return flightSer.findflightbyId(flightid);
		
	}
	
	@GetMapping("/getflightIdAll")
	public List<Integer> getIdAll(){
		return flightSer.getFlightId();
	}
	//@GetMapping("/showflight/{id}")
	//public ResponseEntity<?> showFlightbyId(@PathVariable("id") Integer flightId) {
		//List<Flights> list = flightSer.showFlightbyId(flightId);
		//if(list.size()==0)
			//return new ResponseEntity<>("No Flights Available with " + flightId , HttpStatus.OK);
		
		
	//}
	@GetMapping("/getIdDate")
	public BookingDao getFlightid() {
		BookingDao bookdao = new BookingDao();
		bookdao = flightSer.getIdDate();
		return bookdao;
		
	}
	
	@GetMapping("/getallflights")
	public List<Flights> getallflights(Flights flight) {
		return flightSer.getallFlights(flight);
	}
	////////////////////API for User\\\\\\\\\\\\\\\\\\\\
	
	@GetMapping("/showflights/{from}/{to}/{date}")
	public ResponseEntity<?> showFlights(@PathVariable String from, @PathVariable String to, @PathVariable String date) {
	 List<Flights> lst =flightSer.getFlights(from, to, date);
	 if(lst.size() == 0)
	 return new ResponseEntity<>("No Flights Available " + from +" to " + to, HttpStatus.OK);
		else 
			return new ResponseEntity<>(lst, HttpStatus.OK);
	}
	
}
