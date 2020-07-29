package com.game.development.utilities;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

class StandardPanelTest {

    @org.junit.jupiter.api.Test
    void paintComponent() {
    }

    @org.junit.jupiter.api.Test
    void draw() throws InterruptedException {
        JFrame jFrame = new JFrame("testing");
        BufferedImage bi = new BufferedImage(100,100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bi.createGraphics();
        StandardPanel standardPanel = new StandardPanel();
        standardPanel.draw(g2);
        jFrame.add(standardPanel);
        jFrame.setVisible(true);
        jFrame.pack();
        sleep(10000);
    }
}