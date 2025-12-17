package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event조도센서 {

    @Id
    private Long timestamp;
    private Object조도센서 조도센서;
    private Long value;
    
}
