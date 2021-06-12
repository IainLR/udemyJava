package com.oop.iain.robertson;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
//       return Math.sqrt((this.x * this.x) + (this.y * this.y));
        return distance(0,0);
    }

    public double distance(int altX, int altY) {
        return Math.sqrt((altX - this.x) * (altX - this.x) + (altY - this.y) * (altY - this.y));
    }

    public double distance( Point thePoint) {
        return Math.sqrt((thePoint.getX() - this.x) * (thePoint.getX() - this.x) + (thePoint.y - this.y) * (thePoint.y - this.y));

    }
}
