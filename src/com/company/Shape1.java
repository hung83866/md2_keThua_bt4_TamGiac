package com.company;

public class Shape1 {
    private String color ;
    private boolean fills;

    public Shape1() {
    }

    public Shape1(String color, boolean fills) {
        this.color = color;
        this.fills = fills;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFills() {
        return fills;
    }

    public void setFills(boolean fills) {
        this.fills = fills;
    }
}
