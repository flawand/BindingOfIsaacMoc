package com.game.development.physics.engine;


import com.game.development.utilities.Character;
import com.game.development.utilities.StandardPanel;

import java.util.concurrent.locks.ReentrantLock;

public class MaintainBorderThread extends Thread {

    private Character character;
    private StandardPanel panel;
    private static ReentrantLock lock = new ReentrantLock();

    public MaintainBorderThread(StandardPanel panel) {
        this.character = panel.getMainCharacter();
        this.panel = panel;
    }

    public void run() {
        while(true)
            inBounds();
    }

    public void inBounds() {

        int characterBottomEdge = character.getCharacterBodyY() + character.getCharacterBodyHeight();
        int characterTopEdge = character.getCharacterHeadY();
        int characterLeftEdge = character.getCharacterHeadX();
        int characterRightEdge = character.getCharacterBodyX() + character.getCharacterBodyWidth();

        lock.lock();

            if(characterTopEdge <= 0)
                panel.setMoveUp(false);
            else
                panel.setMoveUp(true);

            if(characterLeftEdge <= 0)
                panel.setMoveLeft(false);
            else
                panel.setMoveLeft(true);

            if(characterBottomEdge >= panel.getWindowHeight())
                panel.setMoveDown(false);
            else
                panel.setMoveDown(true);

            if(characterRightEdge >= panel.getWindowWidth())
                panel.setMoveRight(false);
            else
                panel.setMoveRight(true);

        lock.unlock();

    }



}
