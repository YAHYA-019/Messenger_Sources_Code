package X;

import java.util.BitSet;

/* loaded from: Dsm.class */
public final class Dsm extends C1rs {
    public 1Iw A00;
    public Dxt A01;
    public final BitSet A02;
    public final String[] A03;

    public Dsm(1Iw r302, Dxt dxt) {
        super(dxt, r302, 0, 0);
        this.A03 = new String[]{"allNullPhoto", "bottomSheetListener", "changeProfilePhotoListener", "colorScheme", "confirmButtonListener", "dismissButtonListener", "fbUserSession", "fragmentManager", "hasNullPhoto", "isToggle", "photoUpdateListener"};
        BitSet A18 = 1BK.A18(11);
        this.A02 = A18;
        this.A01 = dxt;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 11);
        A0J();
        return this.A01;
    }
}
