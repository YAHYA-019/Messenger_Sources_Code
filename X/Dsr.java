package X;

import java.util.BitSet;

/* loaded from: Dsr.class */
public final class Dsr extends C1rs {
    public 1Iw A00;
    public Dws A01;
    public final BitSet A02;
    public final String[] A03;

    public Dsr(1Iw r302, Dws dws) {
        super(dws, r302, 0, 0);
        this.A03 = new String[]{"accountType", "colorScheme", "data", "fbUserSession", "listener"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = dws;
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
