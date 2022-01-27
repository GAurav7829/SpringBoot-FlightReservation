package com.grv.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grv.flightReservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
