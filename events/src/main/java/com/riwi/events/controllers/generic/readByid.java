package com.riwi.events.controllers.generic;
import org.springframework.http.ResponseEntity;

public interface readByid<Entity, ID> {
    public ResponseEntity<Entity> readById(ID id);
}