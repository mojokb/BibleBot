package com.example.demo.domain;

import java.util.List;

/**
 * @author Myouhgwhan Lee on 2017. 2. 14..
 */
public class ResultMessage {

    Message message;
    Keyboard keyboard;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "ResultMessage{" +
                "message=" + message +
                ", keyboard=" + keyboard +
                '}';
    }
}
