package X;

import java.util.BitSet;

/* loaded from: Dsj.class */
public final class Dsj extends C1rs {
    public 1Iw A00;
    public Dwx A01;
    public final BitSet A02;
    public final String[] A03;

    public Dsj(1Iw r302, Dwx dwx) {
        super(dwx, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "fbUserSession", "fragmentManager", "profiles", "screenResources", "syncedFields", "targetId", "toggleOffListener", "toggleOnBottomsheetListener"};
        BitSet A18 = 1BK.A18(9);
        this.A02 = A18;
        this.A01 = dwx;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A18(this, this.A02, this.A03);
        return this.A01;
    }
}
