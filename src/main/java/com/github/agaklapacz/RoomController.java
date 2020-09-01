package com.github.agaklapacz;

import com.github.agaklapacz.adapter.RoomRepository;
import com.github.agaklapacz.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    private RoomRepository repository;

}
