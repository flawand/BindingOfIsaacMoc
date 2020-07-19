package com.game.development.utilities;

import com.game.development.physics.engine.GameListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.BevelBorder;


public class StandardFrame extends JFrame{

    private StandardPanel standardPanel;

    public StandardFrame() {
        initComponents();
    }

    private void initComponents() {
        initPanel();
        initFrame();
    }

    public void initPanel() {
        this.standardPanel = new StandardPanel();
        this.standardPanel.setBackground(new java.awt.Color(255, 255, 255));
        this.standardPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        GameListener gameListener = new GameListener(standardPanel);

    }

    public void initFrame() {
        this.add(standardPanel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        this.setVisible(true);
    }


    public JPanel getStandardPanel() {
        return standardPanel;
    }

    public void setStandardPanel(StandardPanel standardPanel) {
        this.standardPanel = standardPanel;
    }

}
