package com.game.development.utilities;

import com.game.development.core.HomePlayGround;
import com.game.development.core.HomePlayGroundPanel;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;


//TODO create an instance of the frame and ensure GUI matches requiremnts

class StandardFrameTest {

    @Test
    void initPanel() throws InterruptedException {
        StandardFrame standardFrame = new StandardFrame();
        sleep(10000);
    }

    @Test
    void initFrame() {
    }
}