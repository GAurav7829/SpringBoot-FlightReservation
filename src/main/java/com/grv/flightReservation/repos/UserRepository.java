package com.grv.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grv.flightReservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
