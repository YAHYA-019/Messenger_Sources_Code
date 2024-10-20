package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ja, reason: invalid class name */
/* loaded from: 8ja.class */
public final class C8ja extends C1rj {
    public C1u7 A00;
    public MigColorScheme A01;
    public 2KE A02;
    public String A03;

    public C8ja() {
        super("AdditionalSnippetTextComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A01, this.A00, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A01;
        String str = this.A03;
        2KE r0 = this.A02;
        C1u7 c1u7 = this.A00;
        11T.A0F(r302, 0);
        7zT.A1W(migColorScheme, str, r0, c1u7);
        2KD A0f = 7zR.A0f(r302, 0Pz.A0W(" · ", str), false);
        A0f.A2y(r0);
        A0f.A2w(c1u7);
        return 7zN.A0Z(migColorScheme, A0f);
    }
}
