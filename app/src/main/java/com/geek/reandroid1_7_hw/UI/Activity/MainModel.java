package com.geek.reandroid1_7_hw.UI.Activity;

import java.io.Serializable;

public class MainModel implements Serializable {

    private int image;
    private String name, secName;

    public MainModel(){}

    public MainModel(int image, String name, String secName) {
        this.image = image;
        this.name = name;
        this.secName = secName;
    }

    public MainModel(String name, String secName) {
        this.name = name;
        this.secName = secName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }
}
