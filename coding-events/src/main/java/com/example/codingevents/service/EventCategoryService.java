package com.example.codingevents.service;

import com.example.codingevents.models.EventCategory;
import com.example.codingevents.repository.EventCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventCategoryService{

    private final EventCategoryRepository eventCategoryRepository;

    public Object findAll() {
        return eventCategoryRepository.findAll();
    }

    public void save(EventCategory newEventCategory) {
        eventCategoryRepository.save(newEventCategory);
    }

    public Optional<EventCategory> findById(Integer categoryId) {
        return eventCategoryRepository.findById(categoryId);
    }
}
