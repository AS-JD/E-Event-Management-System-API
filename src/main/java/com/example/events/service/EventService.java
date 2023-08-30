package com.example.events.service;

import com.example.events.entity.Event;
import com.example.events.repository.EventRepository;
import com.example.events.service.impl.IEventService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventService implements IEventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
@Override
    public List<Event> getAllEvents() {

        return eventRepository.findAll();
    }
    @Transactional
    @Override
    public void deleteEvent(Long eventId) {
        eventRepository.deleteById(eventId);
    }
    @Override
    public  Event saveEvent(Event event){
        return eventRepository.save(event);
}
}
