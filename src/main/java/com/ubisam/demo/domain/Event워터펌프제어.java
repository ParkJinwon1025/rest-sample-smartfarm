package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event워터펌프제어 {

    @Id
    private Long timestamp;
    private Object워터펌프 워터펌프;
    private boolean isOn; // On/Off 여부
    private boolean isManual; // true(수동) / false(자동)
    
}
