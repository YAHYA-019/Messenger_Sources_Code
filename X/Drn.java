package X;

import java.util.BitSet;

/* loaded from: Drn.class */
public final class Drn extends C1rs {
    public Dy8 A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public Drn(Dy8 dy8, 1Iw r303) {
        super(dy8, r303, 0, 0);
        this.A03 = new String[]{"childComponent", "trackingCode"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A00 = dy8;
        this.A01 = r303;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A00;
    }
}
