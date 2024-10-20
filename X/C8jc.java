package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8jc, reason: invalid class name */
/* loaded from: 8jc.class */
public final class C8jc extends C1rj {
    public C1u3 A00;
    public MigColorScheme A01;
    public CharSequence A02;
    public boolean A03;

    public C8jc() {
        super("MigSegmentedControlIconTabComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, this.A00, Boolean.valueOf(this.A03)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1u3 c1u3 = this.A00;
        MigColorScheme migColorScheme = this.A01;
        boolean z = this.A03;
        CharSequence charSequence = this.A02;
        11T.A0G(r302, 0, migColorScheme);
        C1u2 A0I = 4YV.A0I();
        int B9O = 7zS.A1Y() ? migColorScheme.B9O() : migColorScheme.AqM();
        C2cq A00 = C2cp.A00(r302, 0);
        if (z) {
            B9O = migColorScheme.B4h();
        }
        7zM.A1I(c1u3, A0I, A00, B9O);
        A00.A2S(charSequence);
        A00.A0l(28.0f);
        return A00.A2W();
    }
}
