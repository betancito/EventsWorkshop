package com.riwi.events.controllers.interfaces;

import com.riwi.events.controllers.generic.create;
import com.riwi.events.controllers.generic.delete;
import com.riwi.events.controllers.generic.readAll;
import com.riwi.events.controllers.generic.readByid;
import com.riwi.events.entities.event;
import org.springframework.stereotype.Repository;

@Repository
public interface iEvent extends
        create<event>,
        readAll<event>,
        readByid<event, String>,
        delete<String> {
}
