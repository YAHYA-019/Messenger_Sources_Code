package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8ax, reason: invalid class name */
/* loaded from: 8ax.class */
public final class C8ax extends 1LH {
    public final C00m A00;
    public final C00m A01;
    public final int A02;
    public final MigColorScheme A03;
    public final CharSequence A04;

    public C8ax(MigColorScheme migColorScheme, CharSequence charSequence, C00m c00m, C00m c00m2, int i) {
        11T.A0F(migColorScheme, 2);
        this.A04 = charSequence;
        this.A03 = migColorScheme;
        this.A02 = i;
        this.A01 = c00m;
        this.A00 = c00m2;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        Function1 A01 = 4FN.A01(c2k5, AVB.A01(this, 47));
        Function1 A012 = 4FN.A01(c2k5, AVB.A01(this, 46));
        2lQ r0 = 2lO.A02;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(this.A02), 1));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r02 = A0L.A00;
        C83f A00 = C2hd.A00(r02);
        A00.A2Z(0);
        MigColorScheme migColorScheme = this.A03;
        A00.A2Y(migColorScheme.Atp());
        A00.A2X(0.5f);
        2KD A12 = 7zM.A12(A00.A2V(), r02, A0L, 0);
        A12.A2X();
        7zR.A1L(migColorScheme, A12, this.A04);
        A12.A30(true);
        A12.A2Q(true);
        long doubleToRawLongBits = Double.doubleToRawLongBits(21.0d);
        long A0D = 7zP.A0D();
        long doubleToRawLongBits2 = Double.doubleToRawLongBits(22.0d);
        Integer num = 0S2.A04;
        C5z7.A00(A12, 7zT.A0R(4YV.A0K((2lO) null, num, doubleToRawLongBits2), doubleToRawLongBits, A0D));
        7zN.A1Q(A0L, A12);
        2lO A0V = 7zT.A0V((2lO) null, 7zL.A0i(num, 7zP.A0A()), 7zP.A0F());
        C2sn A0U = 7zQ.A0U(r02);
        8TZ A002 = C8nr.A00(A0U.A00);
        A002.A2Y(2131960171);
        A002.A2a(migColorScheme);
        7zS.A1L(A002, 7zR.A0R((2lO) null, A012, 1), 0S2.A0Y, A01);
        7zQ.A1E(A002.A2W(), A0U, A0L, A0V);
        return C2so.A02(A0L, c2k5, A0g);
    }
}
