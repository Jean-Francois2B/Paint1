package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener {

    protected ArrayList<Figure> list;
    protected Color color;
    protected String nameFigure;
    protected int x;
    protected int y;

    public Drawing() {
        super();
        this.color = Color.black;
        this.nameFigure = "Rectangle";
        this.list = new ArrayList<Figure>();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.setBackground(Color.white);
        for (Figure figure : list) {
            figure.draw(graphics);
        }
    }


    public void setColor(Color cl) {
        this.color = cl;
    }

    public void setNameFigure(String nFig) {
        this.nameFigure = nFig;
    }

    public void setList(ArrayList<Figure> list) {
        this.list = list;
    }

    public ArrayList<Figure> getList() {
        return list;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        switch (nameFigure) {
            case "Rectangle":
                list.add(new Rectangle(x, y, color));
                break;
            case "Ellipse":
                list.add(new Ellipse(x, y, color));
                break;
            case "Circle":
                list.add(new Cercle(x, y, color));
                break;
            case "Square":
                list.add(new Square(x, y, color));
                break;
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        list.get(list.size() - 1).setBoundingBox(e.getX() - x, e.getY() - y);
        paintComponent(this.getGraphics());
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        list.get(list.size() - 1).setBoundingBox(e.getX() - x, e.getY() - y);
        paintComponent(this.getGraphics());
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public void reset() {
        list.clear();
        super.paintComponent(this.getGraphics());
    }

    public void open(){
        JFileChooser file = new JFileChooser();
        if (file.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            file.getSelectedFile().getAbsolutePath();
        }
        try {
            FileInputStream fis = new FileInputStream(file.getSelectedFile().getAbsolutePath());
            ObjectInputStream ois = new ObjectInputStream(fis);
            this.list.clear();
            paintComponent((this.getGraphics()));
            list = (ArrayList<Figure>) ois.readObject();
            repaint();
            ois.close();
        }
        catch (Exception e){
            System.out.println("Problème !");
        }
    }

    public void save() {
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            file.getSelectedFile().getAbsolutePath();}
        try{
            FileOutputStream fos = new FileOutputStream(file.getSelectedFile().getAbsolutePath());
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
        }
        catch(Exception e){
            System.out.println("Problème !");
        }
    }
}


