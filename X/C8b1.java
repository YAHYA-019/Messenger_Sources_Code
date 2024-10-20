package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8b1, reason: invalid class name */
/* loaded from: 8b1.class */
public final class C8b1 extends 1LH {
    public final View.OnClickListener A00;
    public final int A01;
    public final int A02;
    public final 2MQ A03;
    public final MigColorScheme A04;

    public C8b1(View.OnClickListener onClickListener, 2MQ r303, MigColorScheme migColorScheme, int i, int i2) {
        7zS.A17(1, r303, migColorScheme, onClickListener);
        this.A03 = r303;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = migColorScheme;
        this.A00 = onClickListener;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A0E, 7zP.A0G());
        Integer num = 0S2.A01;
        2lO A0K2 = 4YV.A0K(7zR.A0S(4YV.A0L(A0K, num, true, 1), C1ro.FLEX_START, A1W ? 1 : 0), 0S2.A0N, Double.doubleToRawLongBits(75.0d));
        AnonymousClass843 A00 = AnonymousClass843.A00(this, 31);
        Integer num2 = 0S2.A1G;
        2lO A0L = 4YV.A0L(A0K2, num2, A00, 1);
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        1Iw r0 = A0U.A00;
        C83g A002 = C02413v4.A00(r0);
        7zS.A1M(A002, 4YV.A0L((2lO) null, num, true, 1), num2, AnonymousClass843.A00(this, 32), 1);
        A002.A2Z(this.A03);
        A002.A2Y();
        MigColorScheme migColorScheme = this.A04;
        A002.A2e(migColorScheme);
        A002.A1J(this.A01);
        A0U.A00(A002.A2V());
        2KD A0Y = 7zN.A0Y(r0, A1W);
        4YU.A1N(A0Y, 2RH.A07);
        A0Y.A2r(this.A02);
        A0Y.A2x(migColorScheme);
        A0Y.A2i();
        A0Y.A2b();
        A0Y.A2q(2);
        7zN.A1Q(A0U, A0Y);
        return C2so.A03(A0U, c2k5, A0L);
    }
}
