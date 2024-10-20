package X;

import java.util.BitSet;

/* loaded from: Dt9.class */
public final class Dt9 extends C1rs {
    public 1Iw A00;
    public DyK A01;
    public final BitSet A02;
    public final String[] A03;

    public Dt9(1Iw r302, DyK dyK) {
        super(dyK, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "grootPlayerEventBus"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = dyK;
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
