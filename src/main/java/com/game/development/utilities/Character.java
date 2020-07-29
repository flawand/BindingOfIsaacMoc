package com.game.development.utilities;

import java.awt.*;
import java.io.IOException;
import java.util.Properties;

public class Character {


    private int characterBodyWidth = 25;
    private int characterBodyHeight = 35;
    private int characterHeadWidth = 75;
    private int characterHeadHeight = 75;
    private boolean left = false;
    private boolean right = false;
    int characterHeadX;
    int characterHeadY;
    int characterBodyX;
    int characterBodyY;
    int leftEyeX;
    int leftEyeY;
    int rightEyeX;
    int rightEyeY;
    private Integer windowWidth;
    private Integer windowHeight;
    private Properties properties;
    private final int padding = 5;

    public Character() {
        this.windowWidth = Constants.WINDOWWIDTH;
        this.windowHeight = Constants.WINDOWHEIGHT;
        initHead();
        initEyes();

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


    public int getCharacterBodyWidth() {
        return characterBodyWidth;
    }

    public void setCharacterBodyWidth(int characterBodyWidth) {
        this.characterBodyWidth = characterBodyWidth;
    }

    public int getCharacterBodyHeight() {
        return characterBodyHeight;
    }

    public void setCharacterBodyHeight(int characterBodyHeight) {
        this.characterBodyHeight = characterBodyHeight;
    }

    public int getCharacterHeadWidth() {
        return characterHeadWidth;
    }

    public void setCharacterHeadWidth(int characterHeadWidth) {
        this.characterHeadWidth = characterHeadWidth;
    }

    public int getCharacterHeadHeight() {
        return characterHeadHeight;
    }

    public void setCharacterHeadHeight(int characterHeadHeight) {
        this.characterHeadHeight = characterHeadHeight;
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

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public int getCharacterHeadX() {
        return characterHeadX;
    }

    public void setCharacterHeadX(int characterHeadX) {
        this.characterHeadX = characterHeadX;
    }

    public int getCharacterHeadY() {
        return characterHeadY;
    }

    public void setCharacterHeadY(int characterHeadY) {
        this.characterHeadY = characterHeadY;
    }

    public int getCharacterBodyX() {
        return characterBodyX;
    }

    public void setCharacterBodyX(int characterBodyX) {
        this.characterBodyX = characterBodyX;
    }

    public int getCharacterBodyY() {
        return characterBodyY;
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

    public int getPadding() {
        return padding;
    }

}
