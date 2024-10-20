package X;

import android.graphics.PointF;

/* renamed from: X.Jjh, reason: case insensitive filesystem */
/* loaded from: Jjh.class */
public final class C3110Jjh extends AbstractC3112Jjj {
    public static float A00(C3110Jjh c3110Jjh, LCv lCv, float f) {
        Object obj;
        Number number;
        Object obj2 = lCv.A0E;
        if (obj2 == null || (obj = lCv.A08) == null) {
            throw AnonymousClass001.A0N("Missing values for keyframe.");
        }
        L34 l34 = ((LBU) c3110Jjh).A03;
        if (l34 != null && (number = (Number) l34.A01(obj2, obj, lCv.A0A, lCv.A07.floatValue(), f, c3110Jjh.A06(), ((LBU) c3110Jjh).A02)) != null) {
            return number.floatValue();
        }
        float f2 = lCv.A02;
        if (f2 == -3987645.8f) {
            f2 = 7zM.A00(obj2);
            lCv.A02 = f2;
        }
        float f3 = lCv.A00;
        if (f3 == -3987645.8f) {
            f3 = 7zM.A00(lCv.A08);
            lCv.A00 = f3;
        }
        PointF pointF = L9W.A00;
        return JQx.A02(f3, f2, f);
    }

    public float A0C() {
        return A00(this, ((LBU) this).A06.Aff(), A05());
    }
}
