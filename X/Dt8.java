package X;

import java.util.BitSet;

/* loaded from: Dt8.class */
public final class Dt8 extends C1rs {
    public 1Iw A00;
    public Dwg A01;
    public final BitSet A02;
    public final String[] A03;

    public Dt8(1Iw r302, Dwg dwg) {
        super(dwg, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "isLive"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = dwg;
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
