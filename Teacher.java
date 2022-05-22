package com.example.REST.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Table(name="TEACHER")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Teacher {

    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;
    public UUID getId() {
        return id;
    }
    private String name;

    private String lastName;

    public Teacher(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
