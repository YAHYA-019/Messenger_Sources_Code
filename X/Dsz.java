package X;

import java.util.BitSet;

/* loaded from: Dsz.class */
public final class Dsz extends C1rs {
    public 1Iw A00;
    public DzY A01;
    public final BitSet A02;
    public final String[] A03;

    public Dsz(1Iw r302, DzY dzY) {
        super(dzY, r302, 0, 0);
        this.A03 = new String[]{"buyerFirstName", "carriers", "fbUserSession", "navigationHandler", "shouldUpdateThreadLabel", "threadIds"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = dzY;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
