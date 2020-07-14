package com.game.development.utilities;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class JavaPaintUI extends JFrame {

    private JPanel door;
    private JPanel bed;

    public JavaPaintUI() {
        initComponents();
    }

    private void initComponents() {
        door = new RectanglePanel(100, 300, 200, 100, 400, 400);
        door.setBackground(new java.awt.Color(255, 255, 255));
        door.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(door, BorderLayout.SOUTH);

        bed = new RectanglePanel(250, 100, 150, 75, 400, 400);
        bed.setBackground(new java.awt.Color(255, 255, 255));
        bed.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(bed, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        this.setVisible(true);
    }




}