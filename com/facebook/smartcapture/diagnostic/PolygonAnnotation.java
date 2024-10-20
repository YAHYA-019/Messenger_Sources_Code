package com.facebook.smartcapture.diagnostic;

import X.7zT;
import android.graphics.Point;

/* loaded from: PolygonAnnotation.class */
public final class PolygonAnnotation {
    public final Color borderColor;
    public final int borderWidth;
    public final Color fillColor;
    public final Point[] points;

    public PolygonAnnotation(Point[] pointArr, Color color, int i, Color color2) {
        7zT.A1T(pointArr, color, color2);
        this.points = pointArr;
        this.borderColor = color;
        this.borderWidth = i;
        this.fillColor = color2;
    }

    public final Color getBorderColor() {
        return this.borderColor;
    }

    public final int getBorderWidth() {
        return this.borderWidth;
    }

    public final Color getFillColor() {
        return this.fillColor;
    }

    public final Point[] getPoints() {
        return this.points;
    }
}
