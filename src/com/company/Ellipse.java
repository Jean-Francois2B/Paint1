package com.company;

import java.awt.*;

public class Ellipse extends Figure{
    protected int grandaxe;
    protected int petitaxe;

    public Ellipse(Point p) {
        super(p);
        this.grandaxe = 0;
        this.petitaxe = 0;
    }

    public Ellipse(int ga, int pa){
        super(new Point());
        grandaxe = ga;
        petitaxe = pa;
    }

    public Ellipse(int x, int y, Color color) {
        super(new Point(x, y),color);
        this.grandaxe = 0;
        this.petitaxe = 0;
    }

    public int getPerimeter(){
        return (int) (2*Math.PI*Math.sqrt(((petitaxe*2)+(grandaxe*2))/2));

    }

    public int getSurface() {
        return (int) (Math.PI*grandaxe*petitaxe/4);
    }

    public int getGrandaxe() {
        return grandaxe;
    }

    public int getPetitaxe() {
        return petitaxe;
    }

    public void draw(Graphics graphics){

        graphics.setColor(this.color);
        graphics.fillOval(origine.getX(), origine.getY(), this.grandaxe, this.petitaxe);
    }

    @Override
    public void setBoundingBox(int length, int width) {
        this.petitaxe = length;
        this.grandaxe = width;
    }

}
