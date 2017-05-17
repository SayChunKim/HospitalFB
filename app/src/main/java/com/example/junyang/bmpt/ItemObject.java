package com.example.junyang.bmpt;

/**
 * Created by Jun Yang on 18/04/2017.
 */

public class ItemObject {
    String name;
    int photo;

    public ItemObject(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}