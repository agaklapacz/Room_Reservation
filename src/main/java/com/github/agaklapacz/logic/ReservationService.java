package com.github.agaklapacz.logic;

import com.github.agaklapacz.adapter.GuestRepository;
import com.github.agaklapacz.adapter.ReservationRepository;
import com.github.agaklapacz.adapter.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ReservationService {
    private RoomRepository repository;
    private GuestRepository guestRepository;
    private ReservationRepository reservationRepository;

    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    public ReservationService(RoomRepository repository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.repository = repository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    private Date createDateFromDateString(String dateString){
        Date date = null;
        if(null!=dateString) {
            try {
                date = DATE_FORMAT.parse(dateString);
            }catch (ParseException pe){
                date = new Date();
            }
        }else{
            date = new Date();
        }
        return date;
    }
}
