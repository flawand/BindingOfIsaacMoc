package com.game.development.core;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MainMenu {

    public static final String title = "Destiny Nor Glory";
    public static final int width = 200;
    public static final int height = 50;
    private static JFrame frame;

    public static void createWindow() {
        frame = new JFrame(title);
        addMainMenuLlabel();
        addNewGameButton();
        addCloseGameButton();
        customizeJFrame();
    }


    public static void addMainMenuLlabel() {
        JLabel mainMenuLabel = new JLabel("Main Menu",SwingConstants.CENTER);
        mainMenuLabel.setPreferredSize(new Dimension(width, height));
        frame.getContentPane().add(mainMenuLabel, BorderLayout.PAGE_START);
    }

    public static void addNewGameButton() {
        JButton newGameButton = new JButton("New Game");
        newGameButton.setPreferredSize(new Dimension(width, height));
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomePlayGround.createWindow();
                frame.dispose();
            }
        } );
        frame.getContentPane().add(newGameButton, BorderLayout.CENTER);
    }

    public static void addCloseGameButton() {
        JButton closeGameButton = new JButton("Close Game");
        closeGameButton.setPreferredSize(new Dimension(width, height));
        closeGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        } );
        frame.getContentPane().add(closeGameButton, BorderLayout.PAGE_END);
    }

    public static void customizeJFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }


}
