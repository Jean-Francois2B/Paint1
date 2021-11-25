package com.company;

import java.awt.*;

public abstract class Figure {
    protected Point origine;
    protected Color color;

    public Figure(Point p1){
        origine = p1;
    }


    public Figure(Point point, Color c) {
        this.origine = point;
        this.color = c;
    }

    public abstract void draw(Graphics graphics);
    public abstract void setBoundingBox(int length, int width);

    public abstract int getPerimeter();
    public abstract int getSurface();
}
