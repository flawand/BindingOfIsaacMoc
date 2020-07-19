package com.game.development.utilities;

import javax.swing.*;
import java.awt.*;


public class StandardPanel extends JPanel {


    //TODO: add a red dot to the head of the character
    //TODO: add standard wall length

    private int characterHeadWidth = 75;
    private int characterHeadHeight = 75;
    private int doorWidth = 150;
    private int doorHeight = 75;
    private int windowWidth = 1000;
    private int windowHeight = 500;
    private final int padding = 5;
    private int characterHeadX;
    private int characterHeadY;
    private int characterBodyX;
    private int characterBodyY;


    public StandardPanel() {
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
        drawMainCharacter(g);
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

    public void drawMainCharacter(Graphics g) {
        characterHead(g);
        characterBody(g);
    }

    public void characterHead(Graphics g) {
        characterHeadX = 3*windowWidth/4;
        characterHeadY = windowHeight/4;
        g.fillOval(characterHeadX, characterHeadY, characterHeadWidth, characterHeadHeight);
    }

    public void characterBody(Graphics g) {
        characterBodyX = 3*windowWidth/4 + characterHeadWidth/2 - padding;
        characterBodyY = windowHeight/4 + characterHeadHeight - padding;
        int characterBodyWidth = 25;
        int characterBodyHeight = 35;
        g.fillOval(characterBodyX, characterBodyY, characterBodyWidth, characterBodyHeight);
    }

    public int getCharacterHeadWidth() {
        return characterHeadWidth;
    }

    public int getCharacterHeadHeight() {
        return characterHeadHeight;
    }

    public int getDoorWidth() {
        return doorWidth;
    }

    public int getDoorHeight() {
        return doorHeight;
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public int getPadding() {
        return padding;
    }

    public void setDoorWidth(int doorWidth) {
        this.doorWidth = doorWidth;
    }

    public void setDoorHeight(int doorHeight) {
        this.doorHeight = doorHeight;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public void setCharacterHeadWidth(int characterHeadWidth) {
        this.characterHeadWidth = characterHeadWidth;
    }

    public void setCharacterHeadHeight(int characterHeadHeight) {
        this.characterHeadHeight = characterHeadHeight;
    }

    public int getCharacterHeadX() {
        return characterHeadX;
    }

    public int getCharacterHeadY() {
        return characterHeadY;
    }

    public int getCharacterBodyX() {
        return characterBodyX;
    }

    public int getCharacterBodyY() {
        return characterBodyY;
    }

    public void setCharacterHeadX(int characterHeadX) {
        this.characterHeadX = characterHeadX;
    }

    public void setCharacterHeadY(int characterHeadY) {
        this.characterHeadY = characterHeadY;
    }

    public void setCharacterBodyX(int characterBodyX) {
        this.characterBodyX = characterBodyX;
    }

    public void setCharacterBodyY(int characterBodyY) {
        this.characterBodyY = characterBodyY;
    }

}