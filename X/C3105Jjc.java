package X;

import android.graphics.PointF;

/* renamed from: X.Jjc, reason: case insensitive filesystem */
/* loaded from: Jjc.class */
public final class C3105Jjc extends AbstractC3112Jjj {
    public static int A00(C3105Jjc c3105Jjc, LCv lCv, float f) {
        Object obj;
        Float f2;
        Number number;
        Object obj2 = lCv.A0E;
        if (obj2 == null || (obj = lCv.A08) == null) {
            throw AnonymousClass001.A0N("Missing values for keyframe.");
        }
        L34 l34 = ((LBU) c3105Jjc).A03;
        if (l34 != null && (f2 = lCv.A07) != null && (number = (Number) l34.A01(obj2, obj, lCv.A0A, f2.floatValue(), f, c3105Jjc.A06(), ((LBU) c3105Jjc).A02)) != null) {
            return number.intValue();
        }
        PointF pointF = L9W.A00;
        return L5v.A02(JQx.A03(1.0f, f, 0.0f), AnonymousClass001.A03(obj2), AnonymousClass001.A03(lCv.A08));
    }
}
