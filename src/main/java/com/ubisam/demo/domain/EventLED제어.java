package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class EventLED제어 {
    
    @Id
    private Long timestamp;
    private boolean isOn; // On/Off 여부
    private Long value; // 밝기값
    private Event조도 조도이벤트; // 조도값
    private boolean isManual; // true(수동) / false(자동)

}
