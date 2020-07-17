package com.game.development.core;

import com.game.development.utilities.StandardFrame;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class HomePlayGround extends StandardFrame {


    private HomePlayGroundPanel homePlayGroundPanel;

    @Override
    public void initPanel() {
        homePlayGroundPanel = new HomePlayGroundPanel();
        setStandardPanel(homePlayGroundPanel);
    }


}
