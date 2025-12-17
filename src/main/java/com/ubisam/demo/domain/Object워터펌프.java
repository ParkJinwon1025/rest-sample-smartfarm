package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Object워터펌프 {

    @Id
    private UUID id;
    private String name;
    private String locaion;
    
}
