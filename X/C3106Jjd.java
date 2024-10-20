package X;

import android.graphics.PointF;

/* renamed from: X.Jjd, reason: case insensitive filesystem */
/* loaded from: Jjd.class */
public final class C3106Jjd extends AbstractC3112Jjj {
    public static int A00(C3106Jjd c3106Jjd, LCv lCv, float f) {
        Object obj;
        Number number;
        Object obj2 = lCv.A0E;
        if (obj2 == null || (obj = lCv.A08) == null) {
            throw AnonymousClass001.A0N("Missing values for keyframe.");
        }
        L34 l34 = ((LBU) c3106Jjd).A03;
        if (l34 != null && (number = (Number) l34.A01(obj2, obj, lCv.A0A, lCv.A07.floatValue(), f, c3106Jjd.A06(), ((LBU) c3106Jjd).A02)) != null) {
            return number.intValue();
        }
        int i = lCv.A04;
        if (i == 784923401) {
            i = AnonymousClass001.A03(obj2);
            lCv.A04 = i;
        }
        int i2 = lCv.A03;
        if (i2 == 784923401) {
            i2 = AnonymousClass001.A03(lCv.A08);
            lCv.A03 = i2;
        }
        PointF pointF = L9W.A00;
        return (int) (i + (f * (i2 - i)));
    }
}
