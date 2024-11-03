// resource: https://stackoverflow.com/questions/423950/rounded-swing-jbutton-using-java

package com.pbo.gui;

import java.awt.*;

public class RoundedBorder implements javax.swing.border.Border {

    private final int radius;

    RoundedBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}