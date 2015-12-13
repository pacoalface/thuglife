package com.franciscoalfacemartin.thuglife.model;

public class Video {
    public String pathImage = "";
    public String name = "";
    public String url = "";

    public Video( String name,String path,String url) {
        this.pathImage = path;
        this.name = name;
        this.url = url;
    }
}
