package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.6c0, reason: invalid class name */
/* loaded from: 6c0.class */
public final class C6c0 extends C1rj {
    public C2q1 A00;
    public MigColorScheme A01;

    public C6c0() {
        super("MigProfileImagePlaceholder");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2q1 c2q1 = this.A00;
        MigColorScheme migColorScheme = this.A01;
        C6c2 A00 = C6c1.A00(r302);
        A00.A2Z(migColorScheme.AmV());
        float f = c2q1.A06;
        A00.A2Y(f);
        A00.A0z(f);
        A00.A0l(f);
        return A00.A2V();
    }
}
