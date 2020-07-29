package com.game.development.utilities;

import com.game.development.physics.engine.GameListener;
import com.game.development.physics.engine.MaintainBorderThread;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.BevelBorder;


public class StandardFrame extends JFrame{

    private StandardPanel standardPanel;
    private GameListener gameListener;
    private Thread thread;

    public StandardFrame() {
        initComponents();
    }

    private void initComponents() {
        initPanel();
        this.gameListener = new GameListener(standardPanel);
        addKeyListener(this.gameListener);
        setFocusable(true);
        initFrame();
        this.thread = new MaintainBorderThread(this.standardPanel);
        thread.start();
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
