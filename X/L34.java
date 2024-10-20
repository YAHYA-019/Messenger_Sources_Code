package X;

import android.graphics.PointF;

/* loaded from: L34.class */
public class L34 {
    public LBU A00;
    public Object A01;
    public final Klj A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.Klj] */
    public L34() {
        this.A02 = new Object();
        this.A01 = null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.Klj] */
    public L34(Object obj) {
        this.A02 = new Object();
        this.A01 = obj;
    }

    private Object A00(Klj klj) {
        if (!(this instanceof C3131Jk2)) {
            if (!(this instanceof C3130Jk1)) {
                return this instanceof C3129Jk0 ? ((C3129Jk0) this).A01.BIi(klj) : this.A01;
            }
            Number number = (Number) ((C3130Jk1) this).A01.A00(klj);
            if (number == null) {
                return null;
            }
            return Float.valueOf(number.floatValue() * 2.55f);
        }
        C3131Jk2 c3131Jk2 = (C3131Jk2) this;
        Klj klj2 = c3131Jk2.A02;
        float f = klj.A04;
        float f2 = klj.A00;
        String str = ((Kqs) klj.A06).A0B;
        String str2 = ((Kqs) klj.A05).A0B;
        float f3 = klj.A02;
        float f4 = klj.A01;
        float f5 = klj.A03;
        klj2.A04 = f;
        klj2.A00 = f2;
        klj2.A06 = str;
        klj2.A05 = str2;
        klj2.A02 = f3;
        klj2.A01 = f4;
        klj2.A03 = f5;
        String str3 = (String) c3131Jk2.A03.A00(klj2);
        Kqs kqs = (Kqs) (klj.A01 == 1.0f ? klj.A05 : klj.A06);
        Kqs kqs2 = c3131Jk2.A01;
        String str4 = kqs.A0A;
        float f6 = kqs.A02;
        Integer num = kqs.A09;
        int i = kqs.A06;
        float f7 = kqs.A01;
        float f8 = kqs.A00;
        int i2 = kqs.A04;
        int i3 = kqs.A05;
        float f9 = kqs.A03;
        boolean z = kqs.A0C;
        PointF pointF = kqs.A07;
        PointF pointF2 = kqs.A08;
        kqs2.A0B = str3;
        kqs2.A0A = str4;
        kqs2.A02 = f6;
        kqs2.A09 = num;
        kqs2.A06 = i;
        kqs2.A01 = f7;
        kqs2.A00 = f8;
        kqs2.A04 = i2;
        kqs2.A05 = i3;
        kqs2.A03 = f9;
        kqs2.A0C = z;
        kqs2.A07 = pointF;
        kqs2.A08 = pointF2;
        return kqs2;
    }

    public final Object A01(Object obj, Object obj2, float f, float f2, float f3, float f4, float f5) {
        Klj klj = this.A02;
        klj.A04 = f;
        klj.A00 = f2;
        klj.A06 = obj;
        klj.A05 = obj2;
        klj.A02 = f3;
        klj.A01 = f4;
        klj.A03 = f5;
        return A00(klj);
    }
}
