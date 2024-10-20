package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.Jji, reason: case insensitive filesystem */
/* loaded from: Jji.class */
public final class C3111Jji extends AbstractC3112Jjj {
    public final PointF A00;

    public C3111Jji(List list) {
        super(list);
        this.A00 = new PointF();
    }

    public static PointF A00(C3111Jji c3111Jji, LCv lCv, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = lCv.A0E;
        if (obj2 == null || (obj = lCv.A08) == null) {
            throw AnonymousClass001.A0N("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        L34 l34 = ((LBU) c3111Jji).A03;
        if (l34 != null && (pointF = (PointF) l34.A01(pointF2, pointF3, lCv.A0A, lCv.A07.floatValue(), f, c3111Jji.A06(), ((LBU) c3111Jji).A02)) != null) {
            return pointF;
        }
        PointF pointF4 = c3111Jji.A00;
        pointF4.set(JQx.A02(pointF3.x, pointF2.x, f2), JQx.A02(pointF3.y, pointF2.y, f3));
        return pointF4;
    }
}
