package X;

import java.util.BitSet;

/* loaded from: Dty.class */
public final class Dty extends C1rs {
    public 1Iw A00;
    public Dyj A01;
    public final BitSet A02;
    public final String[] A03;

    public Dty(1Iw r302, Dyj dyj) {
        super(dyj, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "view"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = dyj;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
