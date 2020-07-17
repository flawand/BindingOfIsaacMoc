package com.game.development.core;

import com.game.development.utilities.StandardFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MainMenu {

    private JLabel mainMenuLabel;
    private JButton closeGameButton;
    private JButton newGameButton;
    private JPanel mainMenuPanel;

    public static final String title = "Destiny Nor Glory";

    private JFrame frame;

    public MainMenu() {
        frame = new JFrame(title);
        addNewGameButtonLogic();
        addCloseGameButtonLogic();
        frame.add(mainMenuPanel, BorderLayout.CENTER);
        customizeJFrame(frame);

    }


    public void addNewGameButtonLogic() {
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newGameButtonLogic(frame);
            }
        });
    }

    public void newGameButtonLogic(JFrame frame) {
        HomePlayGround homePlayGround = new HomePlayGround();
        frame.dispose();
    }

    public void addCloseGameButtonLogic() {
        closeGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        } );
    }

    public void customizeJFrame(JFrame frame) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }
}
