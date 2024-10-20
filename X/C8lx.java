package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.8lx, reason: invalid class name */
/* loaded from: 8lx.class */
public final class C8lx extends C1rj {
    public static final MigColorScheme A02 = LightColorScheme.A00();
    public MigColorScheme A00;
    public boolean A01;

    public C8lx() {
        super("M4SwipeDeleteButton");
        this.A00 = A02;
        this.A01 = true;
    }

    public final Object[] A0k() {
        return 7zN.A1b(this.A00, this.A01);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        boolean z = this.A01;
        MigColorScheme migColorScheme = this.A00;
        C1u2 A0R = 7zP.A0R();
        2zB A00 = 2cP.A00(r302);
        A00.A2a(migColorScheme);
        A00.A2X(36.0f);
        A00.A2b(z);
        A00.A2Y(A0R.A01(2MQ.A3E));
        C1ut c1ut = C1ut.A04;
        2cP r0 = A00.A01;
        r0.A04 = c1ut;
        r0.A05 = C1td.A0A;
        r0.A06 = 2cQ.A07;
        r0.A08 = 7zL.A12(A00, 2131958847);
        return A00.A2W();
    }
}
