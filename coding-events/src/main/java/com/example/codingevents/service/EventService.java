package com.example.codingevents.service;

import com.example.codingevents.models.Event;
import com.example.codingevents.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventService{

    private final EventRepository eventRepository;


    public Object findAll() {
        return eventRepository.findAll();
    }

    public void save(Event newEvent) {
        eventRepository.save(newEvent);
    }

    public void deleteById(int id) {
        eventRepository.deleteById(id);
    }

    public Optional<Event> findById(Integer eventId) {
        return eventRepository.findById(eventId);
    }
}
