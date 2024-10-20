package X;

import java.util.BitSet;

/* loaded from: Dtz.class */
public final class Dtz extends C1rs {
    public 1Iw A00;
    public Dyr A01;
    public final BitSet A02;
    public final String[] A03;

    public Dtz(1Iw r302, Dyr dyr) {
        super(dyr, r302, 0, 0);
        this.A03 = new String[]{"messageEntities"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = dyr;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
