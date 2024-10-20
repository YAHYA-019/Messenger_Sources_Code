package com.facebook.smartcapture.diagnostic;

import X.1BL;
import android.graphics.Point;

/* loaded from: PointAnnotation.class */
public final class PointAnnotation {
    public final Color color;
    public final Point point;
    public final int radius;

    public PointAnnotation(Point point, Color color, int i) {
        1BL.A1F(point, color);
        this.point = point;
        this.color = color;
        this.radius = i;
    }

    public final Color getColor() {
        return this.color;
    }

    public final Point getPoint() {
        return this.point;
    }

    public final int getRadius() {
        return this.radius;
    }
}
