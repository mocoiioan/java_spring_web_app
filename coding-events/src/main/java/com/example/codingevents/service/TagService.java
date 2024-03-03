package com.example.codingevents.service;

import com.example.codingevents.models.Tag;
import com.example.codingevents.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TagService{

    private final TagRepository tagRepository;


    public Object findAll() {
        return tagRepository.findAll();
    }

    public void save(Tag tag) {
        tagRepository.save(tag);
    }
}
