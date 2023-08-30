package com.example.events.controller;


import com.example.events.entity.Event;
import com.example.events.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping
    public ResponseEntity<?> getAllEvents() {
        return  new ResponseEntity<>(eventService.getAllEvents(),HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<?> saveEvent(@RequestBody Event event) {
        return  new ResponseEntity <>(eventService.saveEvent(event), HttpStatus.CREATED);
    }



    @DeleteMapping("/{eventId}")
    public ResponseEntity<?> deleteEvent(@PathVariable Long eventId) {
        eventService.deleteEvent(eventId);
        return new  ResponseEntity <>(HttpStatus.OK);
    }

}