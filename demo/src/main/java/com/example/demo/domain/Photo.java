package com.example.demo.domain;

/**
 * @author Myouhgwhan Lee on 2017. 2. 14..
 *
 * 720x630
 * jpg,png  / 500kb
 */
public class Photo {

    String url;
    int width;
    int height;

    @Override
    public String toString() {
        return "Photo{" +
                "url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
