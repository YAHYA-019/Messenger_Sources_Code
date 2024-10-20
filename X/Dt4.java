package X;

import java.util.BitSet;

/* loaded from: Dt4.class */
public final class Dt4 extends C1rs {
    public 1Iw A00;
    public DxI A01;
    public final BitSet A02;
    public final String[] A03;

    public Dt4(1Iw r302, DxI dxI) {
        super(dxI, r302, 0, 0);
        this.A03 = new String[]{"isContentTopAligned", "isInFullDrawer", "isSharing", "presenter"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = dxI;
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
