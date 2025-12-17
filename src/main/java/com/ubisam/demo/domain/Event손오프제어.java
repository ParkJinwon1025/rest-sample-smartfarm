package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event손오프제어 {

    @Id
    private Long timestamp;
    private Object손오프 손오프;
    private boolean isOn; // On/Off 여부
    private Event조도센서 조도이벤트; // 조도값
    private boolean isManual; // true(수동) / false(자동)
    
}
