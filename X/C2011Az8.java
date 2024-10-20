package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Az8, reason: case insensitive filesystem */
/* loaded from: Az8.class */
public final class C2011Az8 extends C1rj {
    public Bhj A00;
    public MigColorScheme A01;

    public C2011Az8() {
        super("BroadcastFlowSeeMoreButtonComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A01;
        Bhj bhj = this.A00;
        AwU A01 = B11.A01(r302);
        B11 b11 = A01.A01;
        b11.A05 = true;
        b11.A04 = 7zL.A12(A01, 2131965592);
        A01.A02.set(2);
        A01.A2X(1LI.A0C(r302, C2011Az8.class, "BroadcastFlowSeeMoreButtonComponent", new Object[]{bhj}, -1982534067));
        A01.A2Y(migColorScheme);
        A01.A0S();
        return A01.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1982534067) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1pH r0 = ((Bhj) r302.A03[0]).A00.A07;
        if (!r0.BVa()) {
            return null;
        }
        r0.Czz(new Q4k(), 0S2.A0Y, "BroadcastFlowSeeMoreFragment");
        return null;
    }
}
