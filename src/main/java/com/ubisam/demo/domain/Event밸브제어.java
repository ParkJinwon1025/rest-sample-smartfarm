package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event밸브제어 {
    
    @Id
    private Long timestamp;
    private Object밸브 밸브;
    private boolean isOn; // On/Off 여부
    private boolean isManual; // true(수동) / false(자동)
}
