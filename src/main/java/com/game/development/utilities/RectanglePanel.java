package com.game.development.utilities;

import javax.swing.*;
import java.awt.*;


public class RectanglePanel extends JPanel {

    int x, y, width, height, windowWidth, windowHeight;

    RectanglePanel(int x, int y, int width, int height, int windowWidth, int windowHeight) {
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
        g.drawRect(this.x, this.y, this.width, this.height);
    }
}