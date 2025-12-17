package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event수위센서 {

    @Id
    private Long timestamp;
    private Object수위센서 수위센서;
    private Long value;
    
}
