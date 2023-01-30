package com.minhaj.hms.DTM;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteMessage {

    private String delMessage;

    public DeleteMessage(String delMessage) {
        this.delMessage = delMessage;
    }
}
