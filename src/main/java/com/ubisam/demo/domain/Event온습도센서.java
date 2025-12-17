package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event온습도센서 {

    @Id
    private Long timestamp;
    private Object온습도센서 온습도센서;
    private Long temperature; // 온도
    private Long humidity; // 습도
    
}
