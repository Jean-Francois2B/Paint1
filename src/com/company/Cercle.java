package com.company;

import java.awt.*;

public class Cercle extends Ellipse{
    public Cercle(int c) {
        super(c, c);
    }

    public Cercle(int x, int y, Color color){
        super(x,y,color);

    }
    public void setLargeur(int cote){
        super.grandaxe= cote;
        super.petitaxe = cote;
    }

    public void setLongueur(int cote){
        super.grandaxe = cote;
        super.petitaxe = cote;
    }

    @Override
    public void setBoundingBox(int length, int width) {
        this.petitaxe = length;
        this.grandaxe = width;
    }
}
