package X;

import java.util.BitSet;

/* loaded from: Dsi.class */
public final class Dsi extends C1rs {
    public 1Iw A00;
    public Dxs A01;
    public final BitSet A02;
    public final String[] A03;

    public Dsi(1Iw r302, Dxs dxs) {
        super(dxs, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "fbUserSession", "listener", "migBottomSheetDialogFragment", "profiles"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = dxs;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
