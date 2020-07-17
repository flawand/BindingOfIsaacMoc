package com.game.development.core;

import com.game.development.utilities.StandardPanel;

import java.awt.*;

public class HomePlayGroundPanel extends StandardPanel {

    @Override
    public void drawOptionalObject(Graphics g) {
        drawBed(g);
        drawPillow(g);
    }

    public void drawBed(Graphics g) {
        int bedX = getWindowWidth() - getDoorWidth() - getPadding();
        int bedY = getPadding();
        int bedWidth = getDoorWidth();
        int bedHeight = getDoorHeight();
        g.drawRect(bedX, bedY, bedWidth, bedHeight);
    }

    public void drawPillow(Graphics g) {
        int pillowX = getWindowWidth() - getDoorWidth() + 3*getDoorWidth()/4;
        int pillowY = 3*getPadding();
        int pillowWidth = getDoorHeight()/3;
        int pillowHeight = getDoorWidth()/3;
        g.drawRect(pillowX, pillowY, pillowWidth, pillowHeight);
    }


}
