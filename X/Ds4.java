package X;

import java.util.BitSet;

/* loaded from: Ds4.class */
public final class Ds4 extends C1rs {
    public DyD A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public Ds4(DyD dyD, 1Iw r303) {
        super(dyD, r303, 0, 0);
        this.A03 = new String[]{"bodyText", "bottomAddOn", "elevationStyle", "fdsContext", "headlineText", "leftAddOn", "secondaryBottomAddOn", "showCloseButton"};
        BitSet A18 = 1BK.A18(8);
        this.A02 = A18;
        this.A00 = dyD;
        this.A01 = r303;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 8);
        A0J();
        return this.A00;
    }
}
