package com.minhaj.hms.DTM;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentChangeMessage {

    private String message;

    public AppointmentChangeMessage(String message) {
        this.message = message;
    }
}
