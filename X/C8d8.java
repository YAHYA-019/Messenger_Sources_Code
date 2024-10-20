package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8d8, reason: invalid class name */
/* loaded from: 8d8.class */
public final class C8d8 extends 1LH {
    public final int A00;
    public final int A01;
    public final 1LI A02;
    public final MigColorScheme A03;
    public final 5vW A04;
    public final AYx A05;
    public final boolean A06;

    public C8d8(1LI r302, MigColorScheme migColorScheme, 5vW r304, AYx aYx, int i, int i2, boolean z) {
        this.A02 = r302;
        this.A04 = r304;
        this.A06 = z;
        this.A03 = migColorScheme;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = aYx;
    }

    public 1LI A0s(C2k5 c2k5) {
        2lO A0L = 7zT.A0L(7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, C1ro.STRETCH, 7zL.A1W(c2k5) ? 1 : 0)), 12.0d);
        final 5vW r0 = this.A04;
        C5fu A16 = 7zM.A16(r0);
        float f = 0.0f;
        if (A16.A0H) {
            f = 1.0f;
        }
        2lO A0R = 7zS.A0R(A0L, f);
        C2sn A0L2 = 7zR.A0L(c2k5);
        final String str = A16.A09;
        final boolean z = this.A06;
        final MigColorScheme migColorScheme = this.A03;
        final AYx aYx = this.A05;
        final int i = this.A01;
        final int i2 = this.A00;
        final 75O r2 = null;
        A0L2.A00(new 1LH(migColorScheme, r2, r0, aYx, str, i, i2, z) { // from class: X.8dd
            public final 75O A00;
            public final 5vW A01;
            public final AYx A02;
            public final int A03;
            public final int A04;
            public final MigColorScheme A05;
            public final String A06;
            public final boolean A07;

            {
                7zT.A1T(r0, str, migColorScheme);
                this.A01 = r0;
                this.A06 = str;
                this.A07 = z;
                this.A05 = migColorScheme;
                this.A02 = aYx;
                this.A00 = r2;
                this.A04 = i;
                this.A03 = i2;
            }

            public 1LI A0s(C2k5 c2k52) {
                Duc A00 = Dyp.A00(7zL.A0X(c2k52));
                A00.A0S();
                boolean z2 = this.A07;
                A00.A2Y(z2);
                A00.A2X(this.A05);
                7zR.A1A(A00, new ARD(this, this.A06, 0, !z2));
                ((C1rs) A00).A00.A0v().A0U(true);
                A00.A2A(C26z.TOP, this.A04);
                A00.A2A(C26z.BOTTOM, this.A03);
                return A00.A2W();
            }
        });
        A0L2.A00(this.A02);
        return C2so.A0Q(A0L2, c2k5, A0R);
    }
}
