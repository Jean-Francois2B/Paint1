package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World !");
	    Point p1 = new Point(14,3);
        System.out.println("p1 est aux coordonnées : (" +p1.getX()+ ", " +p1.getY()+ ")\n");

        Rectangle r1 = new Rectangle(p1);
        Rectangle r2 = new Rectangle(6, 12);
        System.out.println(r2);
        System.out.println("Le périmètre de R2 vaut : " +r2.getPerimeter()+ " et sa surface vaut : " +r2.getSurface()+ ".");

        Square c1 = new Square(10);
        System.out.println("Le périmètre de C1 vaut : " +c1.getPerimeter()+ " et sa surface vaut : " +c1.getSurface()+ ".");

        Ellipse e1 = new Ellipse(2, 4);
        System.out.println("Le périmètre de e1 vaut : " +e1.getPerimeter()+ " et sa surface vaut : " +e1.getSurface()+ ".");

        Cercle ce1 = new Cercle(3);
        System.out.println("Le périmètre de ce1 vaut : " +ce1.getPerimeter()+ " et sa surface vaut : " +ce1.getSurface()+ ".");

    }
}
