package X;

import java.util.BitSet;

/* loaded from: Dsg.class */
public final class Dsg extends C1rs {
    public 1Iw A00;
    public DyA A01;
    public final BitSet A02;
    public final String[] A03;

    public Dsg(1Iw r302, DyA dyA) {
        super(dyA, r302, 0, 0);
        this.A03 = new String[]{"controllerCallback", "endPositionPx", "fbUserSession", "mediaInfo", "shouldShowAnimation", "startPositionPx"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = dyA;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
