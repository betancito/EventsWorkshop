package com.riwi.events.services.implementation;

import com.riwi.events.entities.event;
import com.riwi.events.repositories.eventRepo;
import com.riwi.events.services.interfaces.iEventserv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class eventImplementation implements iEventserv {
    @Autowired
    private eventRepo eventRepository;

    @Override
    public event save(event event) {
        return eventRepository.save(event);
    }

    @Override
    public List<event> findAll() {
        return eventRepository.findAll();
    }

    @Override
    public Page<event> findAll(Pageable events) {
        return eventRepository.findAll(events);
    }

    @Override
    public Optional<event> findById(String id) {
        return eventRepository.findById(id);
    }

    @Override
    public void delete(String id) {
        eventRepository.deleteById(id);
    }
}
