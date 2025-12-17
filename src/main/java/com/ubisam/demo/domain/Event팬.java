package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event팬 {

    @Id
    private Long timestamp;
    private Object팬 팬;
    private boolean isOn; // On/Off 여부
    private Long speed;
    private Long direction; // 회전 방향
    
}
