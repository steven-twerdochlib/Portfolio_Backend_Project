package org.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Event {
    @Id
    private Long id;
    private String title;
    private String description;
    private Date dateCreated;
    private String[] links;
}
