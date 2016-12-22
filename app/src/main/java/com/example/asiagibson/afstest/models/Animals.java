package com.example.asiagibson.afstest.models;

/**
 * Created by asiagibson on 12/21/16.
 */

public class Animals {

    private String textColor;

    private String background;

    private String name;

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassPojo [textColor = " + textColor + ", background = " + background + ", name = " + name + "]";
    }
}

