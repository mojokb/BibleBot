package com.example.demo.domain;

/**
 * @author Myouhgwhan Lee on 2017. 2. 17..
 */
public class MessageButton {

    String label; // 링크버튼의 타이틀
    String url; // 링크버튼의 연결 링크 주소

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "MessageButton{" +
                "label='" + label + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
