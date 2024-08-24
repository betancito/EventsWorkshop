package com.riwi.events.entities;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
public class event {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate dateCreated;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private Integer capacity;

    //consctructor

    public event() {
    }

    public event(String name, LocalDate dateCreated, String location, Integer capacity) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.location = location;
        this.capacity = capacity;
    }

    //getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public String getLocation() {
        return location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    //setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    //toString

    @Override
    public String toString() {
        return "--event -" + "id='" + id + " -name='" + name + " -dateCreated=" + dateCreated + " -location='" + location + " -capacity=" + capacity + "--" + '\'';
    }
}
