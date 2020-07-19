package com.game.development.physics.engine;

import com.game.development.utilities.StandardPanel;
import com.sun.org.glassfish.gmbal.GmbalException;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameListener implements KeyListener {

    private StandardPanel standardPanel;
    private boolean keyPressed = false;
    private boolean keyReleased = false;

    public GameListener(StandardPanel standardPanel) {
        this.standardPanel = standardPanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                keyPressed = true;
                while(!keyReleased) {
                    standardPanel.setCharacterHeadX(standardPanel.getCharacterHeadX() - 1);
//                    keyReleased(e);
                }
            case KeyEvent.VK_RIGHT:
                keyPressed = true;
                while(!keyReleased) {
                    standardPanel.setCharacterHeadX(standardPanel.getCharacterHeadX() + 1);
//                    keyReleased(e);
                }
        case KeyEvent.VK_UP:
                keyPressed = true;
                while(!keyReleased) {
                    standardPanel.setCharacterHeadY(standardPanel.getCharacterHeadY() - 1);
//                    keyReleased(e);
                }
            case KeyEvent.VK_DOWN:
                keyPressed = true;
                while(!keyReleased) {
                    standardPanel.setCharacterHeadY(standardPanel.getCharacterHeadY() + 1);
//                    keyReleased(e);
                }
    }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT
        || e.getKeyCode() == KeyEvent.VK_RIGHT
        || e.getKeyCode() == KeyEvent.VK_UP
        || e.getKeyCode() == KeyEvent.VK_DOWN) {
            keyReleased = true;
        }
    }
}
