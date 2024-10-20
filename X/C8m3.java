package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8m3, reason: invalid class name */
/* loaded from: 8m3.class */
public final class C8m3 extends C1rj {
    public MigColorScheme A00;
    public String A01;
    public String A02;

    public C8m3() {
        super("SharedContentEmptyStateComponent");
    }

    public static 8TE A00(1Iw r301) {
        return new 8TE(r301, new C8m3());
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2K3 r303;
        String str = this.A02;
        String str2 = this.A01;
        MigColorScheme migColorScheme = this.A00;
        11T.A0F(r302, 0);
        1BK.A1J(str, 1, migColorScheme);
        2cM A00 = 2cK.A00(r302);
        A00.A2c();
        2KD A13 = 7zM.A13(r302, str, 0);
        A13.A2l();
        A13.A2d();
        A13.A2x(migColorScheme);
        A13.A0L();
        A13.A0S();
        A13.A16(36.0f);
        4YU.A1K(A00, A13);
        A00.A2N(true);
        if (str2 != null) {
            2KD A132 = 7zM.A13(r302, str2, 0);
            A132.A2l();
            A132.A2d();
            A132.A2Z();
            A132.A0L();
            A132.A2X();
            A132.A2x(migColorScheme);
            A132.A0T();
            A132.A16(36.0f);
            A132.A17(8.0f);
            r303 = A132.A2W();
        } else {
            r303 = null;
        }
        return 7zL.A0V(A00, r303);
    }
}
