package com.riwi.events.controllers.implementation;

import com.riwi.events.entities.event;
import com.riwi.events.services.interfaces.iEventserv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/event")
public class eventController {
    @Autowired
    private iEventserv eventService;

    @PostMapping("/create")
    public ResponseEntity<event> create(@RequestBody event event) {
        if(event.getCapacity() <= 0 || event.getDateCreated().isBefore(LocalDate.now())){
            return null;
        }
        return ResponseEntity.ok(eventService.save(event));
    }

    @GetMapping("/list")
    public List<event> getAllEvents() {
        return eventService.findAll();
    }

    @GetMapping("read/{id}")
    public ResponseEntity<event> getEventById(@PathVariable String id) {
        Optional<event> event = eventService.findById(id);
        return event.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable String id) {
        if (eventService.findById(id).isPresent()) {
            eventService.delete(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
