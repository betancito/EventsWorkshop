package com.riwi.events.controllers.generic;
import org.springframework.http.ResponseEntity;

public interface create <Entity>{
    public ResponseEntity<Entity>
    Create(Entity Entity);
}
