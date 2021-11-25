package com.company;

import java.awt.*;

public class Rectangle extends Figure{
    protected int longueur;
    protected int largeur;

    public Rectangle(Point p) {
        super(p);
        this.largeur = 0;
        this.longueur = 0;
    }

    public Rectangle(int L, int l){
        super(new Point());
        this.longueur = L;
        this.largeur = l;
    }

    public Rectangle(int x, int y, Color color) {
        super(new Point(x,y), color);
        this.longueur= 0;
        this.largeur=0;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillRect(origine.getX(), origine.getY(), this.longueur, this.largeur);
    }

    @Override
    public void setBoundingBox(int length, int width) {
        this.longueur = length;
        this.largeur = width;
    }

    public int getPerimeter(){
        return 2*(longueur+largeur);
    }

    public int getSurface(){
        return (longueur*largeur);
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }


}
