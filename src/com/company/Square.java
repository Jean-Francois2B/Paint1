package com.company;

import java.awt.*;

public class Square extends Rectangle{

    public Square(int c) {
        super(c, c);
    }

    public Square (int x, int y, Color color){
        super(x,y,color);
    }
    @Override
    public void setLargeur(int cote) {
        super.longueur = cote;
        super.largeur = cote;
    }

    @Override
    public void setLongueur(int cote) {
        super.longueur = cote;
        super.largeur = cote;
    }

    @Override
    public void setBoundingBox(int length, int width) {
        this.longueur = length;
        this.largeur = width;
    }
}
