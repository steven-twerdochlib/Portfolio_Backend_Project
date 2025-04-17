package org.example.model;

import javax.persistence.*;
import java.util.List;

import com.vladmihalcea.hibernate.type.array.StringArrayType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Entity
@Table(name = "\"Projects\"") // match Supabase table name
@TypeDef(name = "string-array", typeClass = StringArrayType.class)
public class Project {
    @Id
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "date_created")
    private java.sql.Date dateCreated;
    @Type(type = "string-array")
    @Column(name = "links", columnDefinition = "text[]")
    private String[] links;
}
