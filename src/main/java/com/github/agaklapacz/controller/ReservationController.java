package com.github.agaklapacz.controller;

import com.github.agaklapacz.logic.ReservationService;
import com.github.agaklapacz.logic.RoomReservation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/reservations")
public class ReservationController {

    private ReservationService reservationService;

    public String getReservations(@RequestParam(value = "data", required = false)String dateString, Model model) {
        return "reservations";
    }
}
