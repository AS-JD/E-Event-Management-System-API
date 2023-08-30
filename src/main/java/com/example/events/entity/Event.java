package com.example.events.entity;

import lombok.Data;

import javax.persistence.*;


import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    private String title;
    private String description;
//    private LocalDateTime eventDateTime;
//    private String location;
//    private String images;
//    private LocalDateTime registrationStart;
//    private LocalDateTime registrationEnd;
//    private String category;
//    private String socialMediaLinks;
//    private String status;
// List of tickets associated with this event
//    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
//    private List<Ticket> tickets;
}

