package com.game.development.utilities;

import com.game.development.utilities.StandardPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameListener implements KeyListener {

    private StandardPanel standardPanel;

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
                standardPanel.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                standardPanel.moveRight();
                break;
            case KeyEvent.VK_UP:
                standardPanel.moveUp();
                break;
            case KeyEvent.VK_DOWN:
                standardPanel.moveDown();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
