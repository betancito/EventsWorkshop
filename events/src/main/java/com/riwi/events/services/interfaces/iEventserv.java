package com.riwi.events.services.interfaces;

import com.riwi.events.entities.event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface iEventserv {
    event save(event Event);
    List<event> findAll();
    Page<event> findAll(Pageable pageable);
    Optional<event> findById(String id);
    void delete(String id);
}
