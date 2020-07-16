package com.game.development.utilities;

import javax.swing.*;
import java.awt.*;


public class StandardPanel<pad> extends JPanel {

    private int characterHeadWidth;
    private int characterHeadHeight;
    private int doorWidth;
    private int doorHeight;
    private int windowWidth;
    private int windowHeight;
    private final int padding = 5;


    public StandardPanel() {
        doorWidth = 150;
        doorHeight = 75;
        windowWidth = 1000;
        windowHeight = 500;
        characterHeadWidth = 75;
        characterHeadHeight = 75;
        setPreferredSize(new Dimension(windowWidth, windowHeight));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }

    public void draw(Graphics g) {
        g.drawRect(windowWidth/2 - doorWidth/2, windowHeight - doorHeight, doorWidth, doorHeight); //entrance
        g.drawRect(windowWidth/2 - doorWidth/2, 0, doorWidth, doorHeight); //exit
        g.fillOval(windowWidth/2, windowHeight/2, characterHeadWidth, characterHeadHeight);
        g.fillOval(windowWidth/2 + characterHeadWidth/2, windowHeight/2 + characterHeadHeight - padding, 25, 35);
    }



    public void setDoorWidth(int doorWidth) {
        this.doorWidth = doorWidth;
    }

    public void setDoorHeight(int doorHeight) {
        this.doorHeight = doorHeight;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

}