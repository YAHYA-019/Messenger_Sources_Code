package X;

import com.facebook.rsys.call.gen.CallModel;

/* loaded from: GS1.class */
public abstract class GS1 {
    public static CallModel A00(C00i c00i) {
        return A02(((2JN) c00i.get()).A01());
    }

    public static CallModel A01(1Br r301) {
        return A02(((2JN) r301.A00.get()).A01());
    }

    public static final CallModel A02(2JS r301) {
        11T.A0F(r301, 0);
        return GOq.A0j(r301);
    }
}
