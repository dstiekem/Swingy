package main.java.dstiekem.za.view;//package java.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//makes a window
//aggregates map and other visual shit
//abstarct
public class Testgui extends JFrame {
    JPanel p = new JPanel();
    JButton newGame = new JButton("NEW GAME");
    JButton oldGame = new JButton("LOAD GAME");
    JTextField t = new JTextField("like putstr editable");
    //add this to panel
    JTextArea a = new JTextArea("like\n putendl\n editable");
    //add this to panel
    JLabel l = new JLabel("uneditable");
    Color color = new Color(12,7,17);
    Testgui() {
        super("Swingy");
        setSize(600,600);
        p.setBackground(color);
        p.add(newGame);
        p.add(oldGame);
        p.add(t);
        p.add(a);
        add(p);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}