package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.7ff, reason: invalid class name */
/* loaded from: 7ff.class */
public final class C7ff extends C1rj {
    public 55W A00;

    public C7ff() {
        super("LargeSectionHeaderLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        55W r0 = this.A00;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        4YU.A1L(A01, 2RH.A06);
        A01.A12(4YU.A00(2RH.A04));
        2KD A012 = 2K3.A01(r302, 0);
        A012.A32(false);
        MigColorScheme migColorScheme = r0.A00;
        A012.A2x(migColorScheme);
        A012.A2f();
        A012.A2b();
        A012.A2z(r0.A02);
        4YU.A1K(A01, A012);
        A01.A0e();
        CharSequence charSequence = r0.A01;
        if (!1JF.A0B(charSequence)) {
            2KD A013 = 2K3.A01(r302, 0);
            A013.A32(false);
            A013.A2x(migColorScheme);
            A013.A2i();
            A013.A2d();
            A013.A2z(charSequence);
            4YU.A1K(A01, A013);
        }
        return A01.A00;
    }
}
