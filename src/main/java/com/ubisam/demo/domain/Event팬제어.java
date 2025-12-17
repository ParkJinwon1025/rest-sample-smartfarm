package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event팬제어 {
    
    @Id
    private Long timestamp;
    private boolean isOn; // On/Off 여부
    private Long speed; // 팬 속도
    private Long direction; // 회전 방향
    private boolean isManual; // true(수동) / false(자동)
}
