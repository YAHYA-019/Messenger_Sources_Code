package X;

import java.util.BitSet;

/* renamed from: X.Atv, reason: case insensitive filesystem */
/* loaded from: Atv.class */
public final class C1822Atv extends C1rs {
    public 1Iw A00;
    public AzZ A01;
    public final BitSet A02;
    public final String[] A03;

    public C1822Atv(1Iw r302, AzZ azZ) {
        super(azZ, r302, 0, 0);
        this.A03 = new String[]{"callerContext", "categoryOrganizationUiModel", "colorScheme", "fbUserSession", "fragmentManager", "listener", "titleRes", "upListener"};
        BitSet A18 = 1BK.A18(8);
        this.A02 = A18;
        this.A01 = azZ;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A17(this, this.A02, this.A03);
        return this.A01;
    }
}
