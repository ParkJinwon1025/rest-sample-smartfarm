package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event수위 {

    @Id
    private Long timestamp;
    private Long value;
    
}
