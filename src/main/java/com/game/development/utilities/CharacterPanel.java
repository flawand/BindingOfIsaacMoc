package com.game.development.utilities;

import javax.swing.*;
import java.awt.*;


public class CharacterPanel extends JPanel {

    int x, y, width, height, windowWidth, windowHeight;

    CharacterPanel(int x, int y, int width, int height, int windowWidth, int windowHeight) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        setPreferredSize(new Dimension(this.windowWidth,this.windowHeight));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(this.x, this.y, this.width, this.height);
        g.drawOval(this.x+this.width, this.y+this.height, this.width/5, this.height/5);

    }
}