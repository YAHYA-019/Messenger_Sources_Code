package X;

import java.util.BitSet;

/* loaded from: Dst.class */
public final class Dst extends C1rs {
    public 1Iw A00;
    public Dyb A01;
    public final BitSet A02;
    public final String[] A03;

    public Dst(1Iw r302, Dyb dyb) {
        super(dyb, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "data", "fbUserSession", "listener"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = dyb;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A02(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
