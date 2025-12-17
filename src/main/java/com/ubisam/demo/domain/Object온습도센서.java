package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Object온습도센서 {

    @Id
    private UUID id;
    private String name;
    private String location;
    
}
