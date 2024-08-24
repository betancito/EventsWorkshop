package com.riwi.events.repositories;

import com.riwi.events.entities.event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface eventRepo extends JpaRepository<event, String> {
}
