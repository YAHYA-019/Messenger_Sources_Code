package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8f7, reason: invalid class name */
/* loaded from: 8f7.class */
public final class C8f7 extends 1LH {
    public final MigColorScheme A00;
    public final C00m A01;

    public C8f7() {
        this(null, SHo.A00);
    }

    public C8f7(MigColorScheme migColorScheme, C00m c00m) {
        this.A00 = migColorScheme;
        this.A01 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A00;
        MigColorScheme migColorScheme2 = migColorScheme;
        if (migColorScheme == null) {
            migColorScheme = C87z.A00(c2k5.AeS());
        }
        ColorDrawable A0D = 7zL.A0D(migColorScheme.BDl());
        Integer num = 0S2.A00;
        2lO A0K = 4YV.A0K(7zL.A0g((2lO) null, 7zL.A0u(num, A0D, 1)), 0S2.A06, 3yH.A01(c2k5));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        2KD A01 = 2K3.A01(AeS, A1W ? 1 : 0);
        Context context = AeS.A0D;
        A01.A2z(7zT.A0w(context, A0L, 2131959273));
        A01.A2b();
        7zL.A1N(A01);
        MigColorScheme migColorScheme3 = migColorScheme2;
        if (migColorScheme2 == null) {
            migColorScheme3 = C87z.A00(AeS);
        }
        A01.A2x(migColorScheme3);
        A01.A2Q(true);
        7zN.A1Q(A0L, A01);
        2lO A0Q = 7zR.A0Q((2lO) null, 0S2.A01, "android.widget.Button");
        MigColorScheme migColorScheme4 = migColorScheme2;
        if (migColorScheme2 == null) {
            migColorScheme4 = C87z.A00(AeS);
        }
        int B9I = migColorScheme4.B9I();
        MigColorScheme migColorScheme5 = migColorScheme2;
        if (migColorScheme2 == null) {
            migColorScheme5 = C87z.A00(AeS);
        }
        2lO A0R = 7zR.A0R(7zQ.A0X(7zT.A0P(4YV.A0K(4YV.A0L(A0Q, num, new 8Bc(B9I, migColorScheme5.B9I(), 15, context.getResources().getDimensionPixelSize(2132279314), A1W ? 1 : 0, A1W), 1), 0S2.A07, 3yH.A06(A0L, 2132279314)), 3yH.A06(A0L, 2132279314), 3yH.A06(A0L, 2132279313)), 0S2.A0C, 0.0f), AVF.A01(this, 29), 1);
        C2sn A0U = 7zQ.A0U(AeS);
        2KD A0r = 7zL.A0r(A0U, A1W ? 1 : 0);
        7zM.A1X(A0r, A0U, 2131959272);
        A0r.A2b();
        A0r.A2k();
        if (migColorScheme2 == null) {
            migColorScheme2 = C87z.A00(A0U.AeS());
        }
        A0r.A2x(migColorScheme2);
        A0r.A2q(1);
        A0r.A2v(2K4.A03);
        7zS.A1P(A0U, A0L, A0R, A0r);
        return C2so.A0P(A0L, c2k5, A0K);
    }
}
