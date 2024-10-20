package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.91g, reason: invalid class name */
/* loaded from: 91g.class */
public final class C91g extends C3Yn {
    public MigColorScheme A00;
    public C91j A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.91g, X.3Yn] */
    public static C91g create(Jtt jtt, C91j c91j) {
        ?? c3Yn = new C3Yn();
        c3Yn.A01 = c91j;
        c3Yn.A00 = c91j.A00;
        return c3Yn;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C3Yn
    public /* bridge */ /* synthetic */ 2Yv A02() {
        return new Object();
    }

    @Override // X.C3Yn
    public void A06(2Yv r302, 2Yv r303) {
        ((C8os) r303).A00 = ((C8os) r302).A00;
    }

    @Override // X.C3Yn
    public void A08(Jtt jtt) {
        C8os c8os = (C8os) super.A01;
        Object A0A = 1Bn.A0A(50179);
        if (A0A != null) {
            c8os.A00 = (C6tg) A0A;
        }
    }

    @Override // X.C3Yn
    public boolean A0B() {
        return true;
    }

    @Override // X.C3Yn
    public 1LI A0C(Jtt jtt) {
        MigColorScheme migColorScheme = this.A00;
        11T.A0F(migColorScheme, 1);
        C1rq A00 = C1rg.A00(jtt);
        7zP.A13(A00);
        A00.A2b();
        A00.A2c();
        8Tj A002 = C8m4.A00(jtt);
        A002.A2X(36.0f);
        A002.A2Z(migColorScheme);
        return 7zL.A0c(A002, A00);
    }

    @Override // X.C3Yn
    public /* bridge */ /* synthetic */ 1LI A0D(Jtt jtt, Object obj) {
        EAE eae = (EAE) obj;
        MigColorScheme migColorScheme = this.A00;
        7zR.A1N(eae, migColorScheme);
        if (((4kO) eae).A03 != null) {
            return new 8Vh(migColorScheme, eae);
        }
        C1rq A00 = C1rg.A00(jtt);
        7zP.A13(A00);
        A00.A2b();
        A00.A2c();
        8Tj A002 = C8m4.A00(jtt);
        A002.A2X(36.0f);
        A002.A2Z(migColorScheme);
        return 7zL.A0c(A002, A00);
    }
}
