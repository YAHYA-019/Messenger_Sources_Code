package X;

import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.8in, reason: invalid class name */
/* loaded from: 8in.class */
public final class C8in extends 2Kb {
    public static final long A04 = Double.doubleToRawLongBits(160.0d);
    public static final long A05 = Double.doubleToRawLongBits(128.0d);
    public final LifecycleOwner A00;
    public final 96E A01;
    public final 8DP A02;
    public final 95T A03;

    public C8in(LifecycleOwner lifecycleOwner, 96E r303, 95T r304, 8DP r305) {
        1BL.A1F(r305, lifecycleOwner);
        this.A02 = r305;
        this.A00 = lifecycleOwner;
        this.A01 = r303;
        this.A03 = r304;
    }

    public C2lt A0s(2lX r302) {
        long j;
        Object A00 = 2rO.A00(r302, new AQX(this, 17), 7zL.A1Z(r302));
        A2l a2l = A2l.A00;
        C2ll A0r = 7zQ.A0r(r302, 7zQ.A0s(A2S.A00, true), new GBp(A00, this, 41));
        2lQ r0 = 2lO.A02;
        C1ro c1ro = C1ro.CENTER;
        Integer num = 0S2.A00;
        2lO A0X = 7zQ.A0X(4YV.A0L((2lO) null, num, c1ro, 0), 0S2.A0Y, 1.0f);
        int ordinal = this.A03.ordinal();
        if (ordinal == 0) {
            j = A05;
        } else {
            if (ordinal != 1) {
                throw 1BK.A1F();
            }
            j = A04;
        }
        Integer num2 = 0S2.A01;
        return new C2lt(7zQ.A0Z(7zQ.A0Z(4YV.A0L(4YV.A0K(A0X, num2, j), 0S2.A0D, "SpeechIndicatorView", 1), num, AV1.A00(A00, 33)), num2, AV1.A00(A00, 34)), a2l, A0r);
    }
}
