package com.grv.flightReservation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.grv.flightReservation.entities.Flight;
import com.grv.flightReservation.repos.FlightRepository;

@SpringBootTest
class FlightReservationApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private FlightRepository flightRepository;
	
	@Test
	public void testFindFlights() {
		List<Flight> findFlights = flightRepository.findFlights("AUS", "NYC");
		assertEquals(false, findFlights.isEmpty());
	}

}
