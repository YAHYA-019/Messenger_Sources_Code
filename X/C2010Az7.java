package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Az7, reason: case insensitive filesystem */
/* loaded from: Az7.class */
public final class C2010Az7 extends C1rj {
    public DFy A00;
    public MigColorScheme A01;

    public C2010Az7() {
        super("BroadcastFlowCreateGroupButtonComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        DFy dFy = this.A00;
        MigColorScheme migColorScheme = this.A01;
        AwU A01 = B11.A01(r302);
        B11 b11 = A01.A01;
        b11.A05 = true;
        b11.A04 = 7zL.A12(A01, 2131955227);
        A01.A02.set(2);
        A01.A2X(1LI.A0C(r302, C2010Az7.class, "BroadcastFlowCreateGroupButtonComponent", new Object[]{dFy}, 126697298));
        A01.A2Y(migColorScheme);
        A01.A0S();
        return A01.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 126697298) {
            return null;
        }
        ((DFy) r302.A03[0]).CVf(false);
        return null;
    }
}
