package com.game.development.core;

import java.awt.*;
import javax.swing.*;


public class MainMenu {


    public static void createWindow() {
        JFrame frame = new JFrame("Main menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMainMenuLlabel(frame);
        addnewGameLabel(frame);
        addcloseGameLabel(frame);

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    public static void addMainMenuLlabel(JFrame frame) {
        JLabel mainMenuLabel = new JLabel("Main Menu",SwingConstants.CENTER);
        mainMenuLabel.setPreferredSize(new Dimension(200, 50));
        frame.getContentPane().add(mainMenuLabel, BorderLayout.PAGE_START);
    }

    public static void addnewGameLabel(JFrame frame) {
        JLabel newGameLabel = new JLabel("New Game",SwingConstants.CENTER);
        newGameLabel.setPreferredSize(new Dimension(200, 50));
        frame.getContentPane().add(newGameLabel, BorderLayout.CENTER);
    }

    public static void addcloseGameLabel(JFrame frame) {
        JLabel closeGameLabel = new JLabel("Close Game",SwingConstants.CENTER);
        closeGameLabel.setPreferredSize(new Dimension(200, 50));
        frame.getContentPane().add(closeGameLabel, BorderLayout.PAGE_END);
    }



}
