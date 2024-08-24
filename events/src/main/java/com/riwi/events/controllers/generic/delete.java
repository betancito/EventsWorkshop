package com.riwi.events.controllers.generic;
import org.springframework.http.ResponseEntity;

public interface delete<ID> {
    public ResponseEntity<Void>
    Delete(ID id);
}
