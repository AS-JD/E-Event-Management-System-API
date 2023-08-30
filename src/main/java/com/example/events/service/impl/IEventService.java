package com.example.events.service.impl;

import com.example.events.entity.Event;

import java.util.List;

public interface IEventService {
    List<Event> getAllEvents();


    void deleteEvent(Long eventId);

    Event saveEvent(Event event);
}
