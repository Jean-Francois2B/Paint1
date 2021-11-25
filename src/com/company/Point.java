package com.company;

public class Point {
    private int X;
    private int Y;

    public Point(int a, int b) {
        X = a;
        Y = b;
    }

    public Point() {
        int X = 0;
        int Y = 0;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    @Override
    public String toString() {
        return ("Point("+X+","+Y+")");
    }
}
