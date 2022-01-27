package com.grv.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grv.flightReservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
