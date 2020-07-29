package com.game.development.core;

import com.game.development.utilities.StandardPanel;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

class HomePlayGroundPanelTest {

    @Test
    void drawOptionalObject() throws InterruptedException {
        JFrame jFrame = new JFrame("testing");
        BufferedImage bi = new BufferedImage(100,100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bi.createGraphics();
        HomePlayGroundPanel homePlayGroundPanel = new HomePlayGroundPanel();
        homePlayGroundPanel.draw(g2);
        jFrame.add(homePlayGroundPanel);
        jFrame.setVisible(true);
        jFrame.pack();
        sleep(10000);
    }
}