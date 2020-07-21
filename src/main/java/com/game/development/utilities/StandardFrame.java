package com.game.development.utilities;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.BevelBorder;


public class StandardFrame extends JFrame{

    private StandardPanel standardPanel;
    private GameListener gameListener;

    public StandardFrame() {
        initComponents();
    }

    private void initComponents() {
        initPanel();
        this.gameListener = new GameListener(standardPanel);
        addKeyListener(this.gameListener);
        setFocusable(true);
        initFrame();
    }

    public void initPanel() {
        this.standardPanel = new StandardPanel();
        this.standardPanel.setBackground(new java.awt.Color(255, 255, 255));
        this.standardPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
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
