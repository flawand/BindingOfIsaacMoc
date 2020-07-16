package com.game.development.utilities;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.BevelBorder;


public class StandardFrame extends JFrame{

    private JPanel standardPanel;

    public StandardFrame() {
        initComponents();
    }

    private void initComponents() {
        initPanel();
        initFrame();
    }

    private void initPanel() {
        standardPanel = new StandardPanel();
        standardPanel.setBackground(new java.awt.Color(255, 255, 255));
        standardPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    }

    private void initFrame() {
        this.add(standardPanel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        this.setVisible(true);
    }

}
