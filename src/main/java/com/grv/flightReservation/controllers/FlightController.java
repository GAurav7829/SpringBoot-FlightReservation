package com.grv.flightReservation.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grv.flightReservation.entities.Flight;
import com.grv.flightReservation.repos.FlightRepository;

@Controller
public class FlightController {

	private FlightRepository flightRepository;

	@RequestMapping("/findFlights")
	public String findFlights(Model model, @RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("departureDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date departureDate) {
		System.out.println("from: " + from);
		System.out.println("to: " + to);
		System.out.println("departureDate: " + departureDate);

		try {
			//giving null pointer exception, need to figure out
			List<Flight> flights = flightRepository.findFlights(from, to);
			model.addAttribute("flights", flights);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "displayFlights";
	}
}
