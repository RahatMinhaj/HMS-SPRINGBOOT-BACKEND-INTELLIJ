package com.minhaj.hms.DTM;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Messages {
    private String message;

    public Messages(String message) {
        this.message = message;
    }
}
