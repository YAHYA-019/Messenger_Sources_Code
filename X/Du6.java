package X;

import java.util.BitSet;

/* loaded from: Du6.class */
public final class Du6 extends C1rs {
    public 1Iw A00;
    public DzA A01;
    public final BitSet A02;
    public final String[] A03;

    public Du6(1Iw r302, DzA dzA) {
        super(dzA, r302, 0, 0);
        this.A03 = new String[]{"isGroot", "isLowLatencyEnabled", "richVideoPlayerEventBus"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = dzA;
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
