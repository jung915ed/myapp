package com.jung.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class CarParking {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;

    public CarParking(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    public void leave() {
        leave = LocalDateTime.now();
    }

    public long getDuration() {
        Duration duration = Duration.between(enter, leave);
        return duration.toMinutes();
    }

    public void setLeave(LocalDateTime leave) {
        if (leave.isAfter(enter)) {
            this.leave = leave;
        }
    }
}
