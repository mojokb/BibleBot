package com.example.demo.domain;

/**
 * @author Myouhgwhan Lee on 2017. 2. 14..
 */
public class Message {

    String text; // the message to send to user.(max 100)
    Photo photo; // Image's info in ballon.( jpg|png )
    MessageButton message_button; //linkbutton info

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", photo=" + photo +
                ", message_button=" + message_button +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public MessageButton getMessage_button() {
        return message_button;
    }

    public void setMessage_button(MessageButton message_button) {
        this.message_button = message_button;
    }
}
