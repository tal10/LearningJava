package com.learning;

public class Rectangle {
    private Point upperLeft;
    private Point buttomRight;

    public Rectangle(Point upperLeft, Point buttomRight) {
        this.upperLeft = upperLeft;
        this.buttomRight = buttomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getButtomRight() {
        return buttomRight;
    }

    public void setButtomRight(Point buttomRight) {
        this.buttomRight = buttomRight;
    }

    @Override
    public String toString() {
        return "upperLeft: " + upperLeft + ", buttomRight: " + buttomRight;
    }
}
