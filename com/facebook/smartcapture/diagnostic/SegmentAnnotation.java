package com.facebook.smartcapture.diagnostic;

import X.1BL;
import android.graphics.Point;

/* loaded from: SegmentAnnotation.class */
public final class SegmentAnnotation {
    public final Color color;
    public final Point firstPoint;
    public final int lineWidth;
    public final Point secondPoint;

    public SegmentAnnotation(Point point, Point point2, Color color, int i) {
        1BL.A1H(point, point2, color);
        this.firstPoint = point;
        this.secondPoint = point2;
        this.color = color;
        this.lineWidth = i;
    }

    public final Color getColor() {
        return this.color;
    }

    public final Point getFirstPoint() {
        return this.firstPoint;
    }

    public final int getLineWidth() {
        return this.lineWidth;
    }

    public final Point getSecondPoint() {
        return this.secondPoint;
    }
}
