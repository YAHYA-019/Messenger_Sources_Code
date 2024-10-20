package X;

import java.util.BitSet;

/* loaded from: Dt6.class */
public final class Dt6 extends C1rs {
    public 1Iw A00;
    public DxA A01;
    public final BitSet A02;
    public final String[] A03;

    public Dt6(1Iw r302, DxA dxA) {
        super(dxA, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "gameName", "presenter"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = dxA;
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
