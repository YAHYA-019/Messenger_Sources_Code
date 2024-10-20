package com.facebook.smartcapture.diagnostic;

import X.7zT;
import android.graphics.Point;

/* loaded from: TextAnnotation.class */
public final class TextAnnotation {
    public final Color backgroundColor;
    public final int fontSize;
    public final String text;
    public final Color textColor;
    public final Point topLeftPosition;

    public TextAnnotation(String str, Point point, Color color, Color color2, int i) {
        7zT.A1W(str, point, color, color2);
        this.text = str;
        this.topLeftPosition = point;
        this.textColor = color;
        this.backgroundColor = color2;
        this.fontSize = i;
    }

    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final String getText() {
        return this.text;
    }

    public final Color getTextColor() {
        return this.textColor;
    }

    public final Point getTopLeftPosition() {
        return this.topLeftPosition;
    }
}
