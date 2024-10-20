package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Awi, reason: case insensitive filesystem */
/* loaded from: Awi.class */
public final class C1917Awi extends 1LH {
    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        Context context = r0.A0D;
        C67Q c67q = (C67Q) 7zN.A0k(context, 49963);
        if (!c67q.A07() || !1BL.A0Q().AZk(36323814027971830L)) {
            return null;
        }
        C1u2 A0I = 4YV.A0I();
        MigColorScheme migColorScheme = (MigColorScheme) 7zN.A0k(context, 16979);
        2lQ r02 = 2lO.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(4.0d);
        2lO A0Y = 7zT.A0Y((2lO) null, new C02963wp(0S2.A04, doubleToRawLongBits), Double.doubleToRawLongBits(8.0d));
        C2sn A0U = 7zQ.A0U(r0);
        8TV A00 = C8ns.A00(A0U.A00);
        A00.A2X(2131955861);
        int A03 = A0I.A03(C1u3.A0C);
        C8ns c8ns = A00.A01;
        c8ns.A02 = A00.A02.A0B(A03);
        A00.A2Y(migColorScheme);
        A00.A0Q();
        c8ns.A03 = new FXt(21, A0U, c67q, this);
        A0U.A00(A00.A2W());
        return C2so.A0I(A0U, c2k5, A0Y);
    }
}
