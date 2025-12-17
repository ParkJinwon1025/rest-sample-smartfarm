package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event온습도 {

    @Id
    private Long timestamp;
    private Long temperature; // 온도
    private Long humidity; // 습도
    
}
