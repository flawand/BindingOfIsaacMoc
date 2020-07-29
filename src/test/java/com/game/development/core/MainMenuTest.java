package com.game.development.core;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;



class MainMenuTest {

    MainMenu mainMenu;

    @Test
    void customizeJFrame() throws InterruptedException {
        mainMenu = new MainMenu();
        JFrame jFrame = new JFrame("testing");
        mainMenu.customizeJFrame(jFrame);
        sleep(10000);
    }

    @Test
    void newGameButtonLogic() throws InterruptedException {
        mainMenu = new MainMenu();
        mainMenu.newGameButtonLogic(mainMenu.getFrame());
        sleep(10000);
    }
}