package com.example.REST.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Table(name="STUDENT")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Student {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    public UUID getId() {
        return id;
    }



    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Column(name="NAME")
    @NotBlank(message="Student name can not be blank")
    private String name;

    @Column(name="LAST_NAME")
    private String lastName;

}
