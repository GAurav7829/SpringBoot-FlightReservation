package com.grv.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grv.flightReservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
