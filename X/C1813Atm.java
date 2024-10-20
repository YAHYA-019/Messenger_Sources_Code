package X;

import java.util.BitSet;

/* renamed from: X.Atm, reason: case insensitive filesystem */
/* loaded from: Atm.class */
public final class C1813Atm extends C1rs {
    public 1Iw A00;
    public C2014Azb A01;
    public final BitSet A02;
    public final String[] A03;

    public C1813Atm(1Iw r302, C2014Azb c2014Azb) {
        super(c2014Azb, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "ctaButtonClickListener", "platformLandingPageCTARow"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = c2014Azb;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
