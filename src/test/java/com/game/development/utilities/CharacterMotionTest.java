package com.game.development.utilities;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import static java.lang.Thread.sleep;

public class CharacterMotionTest {

    @org.junit.jupiter.api.Test
    boolean leftMotion(int sourceX, int sourceY) throws InterruptedException {
        JFrame jFrame = new JFrame("testing");
        BufferedImage bi = new BufferedImage(100,100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bi.createGraphics();
        StandardPanel standardPanel = new StandardPanel();
        standardPanel.draw(g2);
        jFrame.add(standardPanel);
        jFrame.pack();
        jFrame.setVisible(true);
        try {
//            Motion.moveLeft();
        } catch (Exception e) {
            sleep(10000);
            return false;
        }

        return false;
    }

    @org.junit.jupiter.api.Test
    boolean rightMotion(int sourceX, int sourceY) throws InterruptedException{
        JFrame jFrame = new JFrame("testing");
        BufferedImage bi = new BufferedImage(100,100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bi.createGraphics();
        StandardPanel standardPanel = new StandardPanel();
        standardPanel.draw(g2);
        jFrame.add(standardPanel);
        jFrame.pack();
        jFrame.setVisible(true);
        try {
//            Motion.moveRight();
        } catch (Exception e) {
            return false;
        }
        sleep(10000);
        return false;
    }

    @org.junit.jupiter.api.Test
    boolean upMotion(int sourceX, int sourceY) throws InterruptedException{
        JFrame jFrame = new JFrame("testing");
        BufferedImage bi = new BufferedImage(100,100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bi.createGraphics();
        StandardPanel standardPanel = new StandardPanel();
        standardPanel.draw(g2);
        jFrame.add(standardPanel);
        jFrame.pack();
        jFrame.setVisible(true);
        try {
//            Motion.moveUp();
        } catch (Exception e) {
            return false;
        }
        sleep(10000);
        return false;
    }

    @org.junit.jupiter.api.Test
    boolean bottomMotion(int sourceX, int sourceY) throws InterruptedException{
        JFrame jFrame = new JFrame("testing");
        BufferedImage bi = new BufferedImage(100,100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bi.createGraphics();
        StandardPanel standardPanel = new StandardPanel();
        standardPanel.draw(g2);
        jFrame.add(standardPanel);
        jFrame.pack();
        jFrame.setVisible(true);
        try {
//            Motion.moveDown();
        } catch (Exception e) {
            return false;
        }
        sleep(10000);
        return false;
    }
}
