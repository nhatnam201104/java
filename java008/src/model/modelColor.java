package model;

import java.awt.Color;

public class modelColor {
    private Color foreground;
    private Color background;
    private boolean opaque;

    public modelColor() {
        this.foreground = Color.BLACK;
        this.background = Color.white;
        this.opaque = true;
    }

    public Color getForeground() {
        return foreground;
    }

    public void setForeground(String foreground) {
        this.foreground = Color.getColor(foreground);
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(String background) {
      
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }
}