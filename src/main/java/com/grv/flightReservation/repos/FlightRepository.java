package com.grv.flightReservation.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.grv.flightReservation.entities.Flight;


public interface FlightRepository extends JpaRepository<Flight, Long> {
	@Query(value="SELECT * FROM Flight WHERE departure_City=:departureCity and arrival_City=:arrivalCity and date_of_departure=:departureDate", nativeQuery= true)
	List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to, @Param("departureDate") Date departureDate);
	
	@Query(value="SELECT * FROM Flight WHERE departure_City=:departureCity and arrival_City=:arrivalCity",nativeQuery=true)
	List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to);
}
