package com.example.ploy.derplist.Model;

/**
 * Created by ploy on 5/10/17.
 * Java Representation of our Data tobe displayed int recyclerview
 */

public class ListItem {
   private String title;
   private  int imageResid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResid() {
        return imageResid;
    }

    public void setImageResid(int imageResid) {
        this.imageResid = imageResid;
    }
}
