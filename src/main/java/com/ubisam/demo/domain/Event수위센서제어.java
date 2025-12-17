package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event수위센서제어 {

    @Id
    private Long timestamp;
    private boolean isOn; // On/Off 여부
    private Event수위 수위이벤트; // 수위값
    private boolean isManual; // true(수동) / false(자동)
    
}
