package com.game.development.utilities;

import javax.swing.*;
import java.awt.*;


public class StandardPanel extends JPanel{

    //TODO: add standard wall length

    private int doorWidth = 150;
    private int doorHeight = 50;
    private int windowWidth = Constants.WINDOWWIDTH;
    private int windowHeight = Constants.WINDOWHEIGHT;
    private final int padding = 5;
    private Character mainCharacter;
    private boolean moveUp;
    private boolean moveDown;
    private boolean moveRight;
    private boolean moveLeft;


    public StandardPanel() {
        this.moveRight = true;
        this.moveLeft = true;
        this.moveUp = true;
        this.moveDown = true;
        this.mainCharacter = new Character();
        setPreferredSize(new Dimension(windowWidth, windowHeight));
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        drawOptionalObject(g);
        drawExitDoor(g);
        mainCharacter.drawMainCharacter(g);
    }

    public void drawOptionalObject(Graphics g) {
        drawEntranceDoor(g);
    }

    public void drawEntranceDoor(Graphics g) {
        int entranceDoorX = windowWidth/2 - doorWidth/2;
        int entranceDoorY = 0;
        g.drawRect(entranceDoorX, entranceDoorY, doorWidth, doorHeight);
    }

    public void drawExitDoor(Graphics g) {
        int exitDoorX = windowWidth/2 - doorWidth/2;
        int exitDoorY = windowHeight - doorHeight;
        g.drawRect(exitDoorX, exitDoorY, doorWidth, doorHeight);
    }


    public void moveLeft() {
        if(moveLeft) {
            mainCharacter.setLeft(true);
            mainCharacter.setRight(false);
            mainCharacter.setCharacterHeadX(mainCharacter.getCharacterHeadX()-padding);
            mainCharacter.setCharacterBodyX(mainCharacter.getCharacterBodyX()-padding);
            mainCharacter.initEyes();
            repaint();
        }
    }

    public void moveUp() {
        if(moveUp) {
            mainCharacter.setLeft(false);
            mainCharacter.setRight(false);
            mainCharacter.setCharacterHeadY(mainCharacter.getCharacterHeadY()-padding);
            mainCharacter.setCharacterBodyY(mainCharacter.getCharacterBodyY()-padding);
            mainCharacter.initEyes();
            repaint();
        }
    }

    public void moveRight() {
        if(moveRight) {
            mainCharacter.setLeft(false);
            mainCharacter.setRight(true);
            mainCharacter.setCharacterHeadX(mainCharacter.getCharacterHeadX()+padding);
            mainCharacter.setCharacterBodyX(mainCharacter.getCharacterBodyX()+padding);
            mainCharacter.initEyes();
            repaint();
        }
    }

    public void moveDown() {
        if(moveDown) {
            mainCharacter.setLeft(false);
            mainCharacter.setRight(false);
            mainCharacter.setCharacterHeadY(mainCharacter.getCharacterHeadY()+padding);
            mainCharacter.setCharacterBodyY(mainCharacter.getCharacterBodyY()+padding);
            mainCharacter.initEyes();
            repaint();
        }
    }

    public int getDoorWidth() {
        return doorWidth;
    }

    public int getDoorHeight() {
        return doorHeight;
    }

    public int getPadding() {
        return padding;
    }
    public int getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public boolean isMoveUp() {
        return moveUp;
    }

    public void setMoveUp(boolean moveUp) {
        this.moveUp = moveUp;
    }

    public boolean isMoveDown() {
        return moveDown;
    }

    public void setMoveDown(boolean moveDown) {
        this.moveDown = moveDown;
    }

    public boolean isMoveRight() {
        return moveRight;
    }

    public void setMoveRight(boolean moveRight) {
        this.moveRight = moveRight;
    }

    public boolean isMoveLeft() {
        return moveLeft;
    }

    public void setMoveLeft(boolean moveLeft) {
        this.moveLeft = moveLeft;
    }

    public Character getMainCharacter() {
        return mainCharacter;
    }
}