package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame implements ActionListener{

    static protected Drawing dessin = new Drawing();

    public Window(String Title, int x, int y){
        super(Title);
        this.setSize(1000,1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creation de la bare de navigation
        JMenuBar m = new JMenuBar();

        JMenu menu1 = new JMenu("File");

        JMenuItem Open = new JMenuItem("Open");
        JMenuItem New = new JMenuItem("New");
        JMenuItem Save = new JMenuItem("Save");
        JMenuItem Quit = new JMenuItem("Quit");

        JMenu menu2 = new JMenu("About");

        JMenuItem Authors = new JMenuItem("Authors");


        menu1.add(Open);
        menu1.add(New);
        menu1.add(Save);
        menu1.add(Quit);

        menu2.add(Authors);

        m.add(menu1);
        m.add(menu2);

        Open.addActionListener(this);
        New.addActionListener(this);
        Save.addActionListener(this);
        Quit.addActionListener(this);
        Authors.addActionListener(this);

        Container contentPanel = this.getContentPane();

        JPanel panneau1 = new JPanel();

        JButton button1 = new JButton("Black");
        button1.setBackground(Color.black);
        JButton button2 = new JButton("Red");
        button2.setBackground(Color.red);
        JButton button3 = new JButton("Green");
        button3.setBackground(Color.green);
        JButton button4 = new JButton("Blue");
        button4.setBackground(Color.blue);
        JButton button5 = new JButton("Yellow");
        button5.setBackground(Color.yellow);
        JButton button6 = new JButton("Pink");
        button6.setBackground(Color.pink);
        JButton button7 = new JButton("Magenta");
        button7.setBackground(Color.magenta);
        JButton button8 = new JButton("Orange");
        button8.setBackground(Color.orange);


        panneau1.setLayout(new GridLayout(2,4));
        panneau1.add(button1);
        panneau1.add(button2);
        panneau1.add(button3);
        panneau1.add(button4);
        panneau1.add(button5);
        panneau1.add(button6);
        panneau1.add(button7);
        panneau1.add(button8);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);

        JPanel panneau2 = new JPanel();
        JButton buttonEllipse = new JButton("Ellipse");
        JButton buttonCircle = new JButton("Circle");
        JButton buttonSquare = new JButton("Square");
        JButton buttonRectangle = new JButton("Rectangle");

        panneau2.setLayout(new GridLayout(2,2));
        panneau2.add(buttonEllipse);
        panneau2.add(buttonCircle);
        panneau2.add(buttonSquare);
        panneau2.add(buttonRectangle);
        buttonEllipse.addActionListener(this);
        buttonCircle.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonRectangle.addActionListener(this);

        JPanel panneau3 = new JPanel();
        panneau3.setLayout(new GridLayout(1,2));
        panneau3.add(panneau1);
        panneau3.add(panneau2);

        setJMenuBar(m);
        contentPanel.add(new JTextArea(""),"Center");
        contentPanel.add(dessin, "Center");
        contentPanel.add(panneau3, "South");

        /*JButton OkButton = new JButton("Evviva u Niolu! NZL !!!");
        contentPanel.add(OkButton);
        OkButton.addActionListener(this);
        JButton OkButton1 = new JButton("Evviva u Niolu! NZL !!!");
        contentPanel.add(OkButton1);
        OkButton1.addActionListener(this);

        this.setVisible(true);
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1,2));
        southPanel.add(OkButton);
        contentPanel.add(southPanel,"South");*/

    }
    public static void main (String args[]){
        Window win = new Window("Jeff's paint",800, 600);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        switch (cmd){
            case "Red" : dessin.setColor(Color.red);
                break;
            case "Green" : dessin.setColor(Color.green);
                break;
            case "Black" : dessin.setColor(Color.black);
                break;
            case "Blue" : dessin.setColor(Color.blue);
                break;
            case "Yellow" : dessin.setColor(Color.yellow);
                break;
            case "Pink" : dessin.setColor(Color.pink);
                break;
            case "Magenta" : dessin.setColor(Color.magenta);
                break;
            case "Orange" : dessin.setColor(Color.orange);
                break;
            case "Rectangle" : dessin.setNameFigure("Rectangle");
                break;
            case "Ellipse" : dessin.setNameFigure("Ellipse");
                break;
            case "Square" : dessin.setNameFigure("Square");
                break;
            case "Circle" : dessin.setNameFigure("Circle");
                break;
            case "New" : dessin.reset();
                break;
            case "Save" :  dessin.save();
                JOptionPane save = new JOptionPane();
                save.showInternalMessageDialog(save, "Votre oeuvre a bien été enregistré et prète à être exposée au Louvres !!");
                break;
            case "Authors" : JOptionPane info = new JOptionPane();
                info.showInternalMessageDialog(info, "Authors : Jean-François Castellani", "Une petite oeuvre bien sympatique",JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Quit" : System.exit(0);
                break;
            default : System.out.println("Action : " + cmd);
                break;

        }

    }
}
