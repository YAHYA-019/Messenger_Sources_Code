package X;

import com.facebook.dsp.core.ColorData;

/* renamed from: X.3tB, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3tB.class */
public abstract class AbstractC01883tB {
    public static InterfaceC01893tD A00 = new Object();

    public static final float A00(2KO r301) {
        if (r301 instanceof 2KN) {
            return 1.0f;
        }
        if (r301 instanceof FdD) {
            return ((FdD) r301).A00;
        }
        throw new RuntimeException();
    }

    public static final int A01(MfW mfW, boolean z) {
        11T.A0F(mfW, 0);
        ELy BF0 = A00.BF0();
        11T.A0F(BF0, 0);
        ColorData AGd = F0X.A01(BF0).AGd(mfW);
        return z ? AGd.A00 : AGd.A01;
    }

    public static final 2KP A02(Integer num) {
        ELy BF0 = A00.BF0();
        11T.A0F(BF0, 0);
        return F0X.A01(BF0).D5S(num);
    }
}
