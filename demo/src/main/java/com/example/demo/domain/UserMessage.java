package com.example.demo.domain;

import java.util.Arrays;

/**
 * @author Myouhgwhan Lee on 2017. 2. 14..
 */
public class UserMessage {

    String user_key; // required, rencryptedUserKey
    String type; //  required, [text|photo]
    String content; //  required, user's mesage | media file uri

    public String getUser_key() {
        return user_key;
    }

    public void setUser_key(String user_key) {
        this.user_key = user_key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "UserMessage{" +
                "user_key='" + user_key + '\'' +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
