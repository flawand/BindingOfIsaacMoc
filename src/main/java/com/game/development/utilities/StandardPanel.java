package com.game.development.utilities;

import javax.swing.*;
import java.awt.*;


public class StandardPanel extends JPanel{

    //TODO: add standard wall length

    private int characterHeadWidth = 75;
    private int characterHeadHeight = 75;
    private int doorWidth = 150;
    private int doorHeight = 50;
    private int windowWidth = 1000;
    private int windowHeight = 500;
    private final int padding = 5;
    private int characterHeadX;
    private int characterHeadY;
    private int characterBodyX;
    private int characterBodyY;
    private int standardroomlengthwall = 75;
    private int leftEyeX;
    private int leftEyeY;
    private int rightEyeX;
    private int rightEyeY;
    private boolean left = false;
    private boolean right = false;
    private boolean upDown = true;


    public StandardPanel() {
        initHead();
        initEyes();
        setPreferredSize(new Dimension(windowWidth, windowHeight));
    }

    public void initHead() {
        this.characterHeadX = 3*windowWidth/4;
        this.characterHeadY = windowHeight/4;
        this.characterBodyX = 3*windowWidth/4 + characterHeadWidth/2 - padding;
        this.characterBodyY = windowHeight/4 + characterHeadHeight - padding;
    }

    public void initEyes() {
        this.leftEyeX = characterHeadX + characterHeadWidth/4;
        this.leftEyeY = characterHeadY + characterHeadHeight/4;
        this.rightEyeX = characterHeadX + 2*characterHeadWidth/3;
        this.rightEyeY = characterHeadY + characterHeadHeight/4;
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
        characterFace(g);
        characterBody(g);
    }

    public void characterFace(Graphics g) {
        g.fillOval(characterHeadX, characterHeadY, characterHeadWidth, characterHeadHeight);
        g.setColor(Color.red);
        drawEyes(g);
    }

    public void drawEyes(Graphics g) {
        if(left)
            drawLeftEye(g);
        else if(right)
            drawRightEye(g);
        else
            drawBothEyes(g);
    }

    public void drawBothEyes(Graphics g) {
        g.fillOval(leftEyeX, leftEyeY, characterHeadWidth/5, characterHeadHeight/5);
        g.fillOval(rightEyeX, rightEyeY, characterHeadWidth/5, characterHeadHeight/5);
    }

    public void drawLeftEye(Graphics g) {
        g.fillOval(leftEyeX, leftEyeY, characterHeadWidth/5, characterHeadHeight/5);
    }

    public void drawRightEye(Graphics g) {
        g.fillOval(rightEyeX, rightEyeY, characterHeadWidth/5, characterHeadHeight/5);
    }


    public void characterBody(Graphics g) {
        int characterBodyWidth = 25;
        int characterBodyHeight = 35;
        g.setColor(Color.black);
        g.fillOval(characterBodyX, characterBodyY, characterBodyWidth, characterBodyHeight);
    }

    public void moveLeft() {
        this.left = true;
        this.right = false;
        setCharacterHeadX(getCharacterHeadX()-padding);
        setCharacterBodyX(getCharacterBodyX()-padding);
        initEyes();
        repaint();
    }

    public void moveUp() {
        this.right = false;
        this.left = false;
        setCharacterHeadY(getCharacterHeadY()-padding);
        setCharacterBodyY(getCharacterBodyY()-padding);
        initEyes();
        repaint();
    }

    public void moveRight() {
        this.right = true;
        this.left = false;
        setCharacterHeadX(getCharacterHeadX()+padding);
        setCharacterBodyX(getCharacterBodyX()+padding);
        initEyes();
        repaint();
    }

    public void moveDown() {
        this.right = false;
        this.left = false;
        setCharacterHeadY(getCharacterHeadY()+padding);
        setCharacterBodyY(getCharacterBodyY()+padding);
        initEyes();
        repaint();
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

    public int getLeftEyeX() {
        return leftEyeX;
    }

    public void setLeftEyeX(int leftEyeX) {
        this.leftEyeX = leftEyeX;
    }

    public int getLeftEyeY() {
        return leftEyeY;
    }

    public void setLeftEyeY(int leftEyeY) {
        this.leftEyeY = leftEyeY;
    }

    public int getRightEyeX() {
        return rightEyeX;
    }

    public void setRightEyeX(int rightEyeX) {
        this.rightEyeX = rightEyeX;
    }

    public int getRightEyeY() {
        return rightEyeY;
    }

    public void setRightEyeY(int rightEyeY) {
        this.rightEyeY = rightEyeY;
    }


}