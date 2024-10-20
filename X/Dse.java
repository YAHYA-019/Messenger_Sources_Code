package X;

import java.util.BitSet;

/* loaded from: Dse.class */
public final class Dse extends C1rs {
    public 1Iw A00;
    public Dxa A01;
    public final BitSet A02;
    public final String[] A03;

    public Dse(1Iw r302, Dxa dxa) {
        super(dxa, r302, 0, 0);
        this.A03 = new String[]{"clickListener", "colorScheme", "data", "renderState", "surfaceVisibilityListener"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = dxa;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
