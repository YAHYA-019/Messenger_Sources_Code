package X;

import android.graphics.drawable.Drawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8hy, reason: invalid class name */
/* loaded from: 8hy.class */
public final class C8hy extends 1LH {
    public final 9Aj A00;
    public final MigColorScheme A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final long A05;
    public final C2lu A06;
    public final boolean A07;
    public final boolean A08;
    public static final long A09 = 7zQ.A08();
    public static final long A0B = 7zP.A07();
    public static final long A0A = Double.doubleToRawLongBits(56.0d);

    public C8hy(9Aj r302, MigColorScheme migColorScheme, C2lu c2lu, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        1BL.A1F(str, migColorScheme);
        7zP.A1M(r302, 6, str2);
        this.A03 = str;
        this.A01 = migColorScheme;
        this.A05 = j;
        this.A04 = z;
        this.A07 = z2;
        this.A00 = r302;
        this.A08 = z3;
        this.A06 = c2lu;
        this.A02 = str2;
    }

    private final C8mf A01(1LI r302, 1Iw r303, C2k6 c2k6) {
        8Tm A00 = C8mf.A00(r303);
        A00.A2c((int) (7zO.A06(c2k6, A0B) / 2.0f));
        A00.A2X();
        MigColorScheme migColorScheme = this.A01;
        A00.A2a(migColorScheme.BDl());
        A00.A2g(r302);
        A00.A00.A00 = migColorScheme.Atp();
        A00.A2Y(1.0f);
        return A00.A2W();
    }

    public 1LI A0s(C2k5 c2k5) {
        MigColorScheme migColorScheme;
        1LI A2W;
        C2iw c2iw = (C2iw) 2rO.A00(c2k5, SHW.A00, 7zL.A1Z(c2k5));
        C2lh A0e = 7zL.A0e(c2k5, SHV.A00);
        long j = this.A05;
        C2lu c2lu = this.A06;
        2lO A0b = 7zT.A0b((2lO) null, 7zL.A0i(0S2.A0E, j), c2lu != null ? c2lu.A00 : A09);
        boolean z = this.A08;
        long j2 = !z ? A0B : A0A;
        Integer num = 0S2.A01;
        2lO A0X = 7zQ.A0X(4YV.A0K(A0b, num, j2), num, 1.0f);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r0 = A0L.A00;
        if (z) {
            3vS A0U = 7zO.A0U(new AR2(A0e, 41));
            2lO A0X2 = 7zQ.A0X((2lO) null, num, 1.0f);
            migColorScheme = this.A01;
            2hV A0U2 = 7zP.A0U(migColorScheme);
            Integer num2 = 0S2.A00;
            2lO A0R = 7zR.A0R(4YV.A0L(A0X2, num2, A0U2, 1), new AR2(this, 40), 1);
            C1ro c1ro = C1ro.SPACE_BETWEEN;
            C2sn A0U3 = 7zQ.A0U(A0L.AeS());
            A0U3.A00(new C8cu(A0U, c2iw, migColorScheme, num2, this.A02, new J9u(this, 2)));
            A0U3.A00(new 8Zc(c2iw, migColorScheme, new AW4(this, 38), 7zP.A1V(A0e)));
            A2W = C2so.A0R(A0U3, A0L, A0R, c1ro);
        } else {
            boolean z2 = this.A04;
            migColorScheme = this.A01;
            Drawable A0j = 7zL.A0j(z2 ? migColorScheme.BEi() : migColorScheme.BDl());
            C1u7 c1u7 = z2 ? C1u7.A0D : C1u7.A0A;
            2KD A0a = 7zO.A0a(A0L, 0);
            7zS.A1M(A0a, (2lO) null, 0S2.A1G, new AR2(this, 39), 1);
            A0a.A2x(migColorScheme);
            A0a.A0j(1.0f);
            A0a.A0V();
            A0a.A2q(1);
            A0a.A25(C26z.START, 16.0f);
            C26z c26z = C26z.END;
            A0a.A25(c26z, 16.0f);
            A0a.A24(c26z, 4.0f);
            A0a.A2l();
            A0a.A2w(c1u7);
            A0a.A2r(2131964653);
            A0a.A0D(A0j);
            A0a.A2v(2K4.A03);
            A0a.A31(false);
            A2W = A0a.A2W();
        }
        A0L.A00(A01(A2W, r0, A0L));
        if (this.A07) {
            MigColorScheme migColorScheme2 = migColorScheme;
            A0L.A00(A01(new 8gZ(this.A00, migColorScheme2, 0S2.A00, this.A03, this.A04), r0, A0L));
        }
        return C2so.A0P(A0L, c2k5, A0X);
    }
}
