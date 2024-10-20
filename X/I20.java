package X;

import android.graphics.PointF;
import android.graphics.Rect;
import java.util.List;

/* loaded from: I20.class */
public final class I20 {
    public PointF A00;
    public HTT A01;
    public final List A02 = AbF.A1F();

    public static void A00(PointF pointF, Rect rect, float f) {
        float f2 = pointF.x;
        int floor = (int) Math.floor(f2 - f);
        float f3 = pointF.y;
        rect.union(floor, (int) Math.floor(f3 - f), (int) Math.ceil(f2 + f), (int) Math.ceil(f3 + f));
    }

    public final void A01(PointF pointF) {
        PointF pointF2;
        GSj gSj;
        JK3 jk3;
        this.A02.add(pointF);
        HTT htt = this.A01;
        if (htt != null && (pointF2 = this.A00) != null && (jk3 = (gSj = htt.A00).A02) != null) {
            float BB4 = jk3.BB4();
            Rect rect = gSj.A05;
            A00(pointF2, rect, BB4);
            A00(pointF, rect, BB4);
            gSj.invalidateSelf();
        }
        this.A00 = pointF;
    }
}
