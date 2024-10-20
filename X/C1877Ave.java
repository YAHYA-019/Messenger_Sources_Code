package X;

import java.util.BitSet;

/* renamed from: X.Ave, reason: case insensitive filesystem */
/* loaded from: Ave.class */
public final class C1877Ave extends C1rs {
    public 1Iw A00;
    public AzI A01;
    public final BitSet A02;
    public final String[] A03;

    public C1877Ave(1Iw r302, AzI azI) {
        super(azI, r302, 0, 0);
        this.A03 = new String[]{"broadcastFlowEnvironment", "broadcastFlowModel", "buttonBackgroundColor", "colorScheme", "environment", "fbUserSession"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = azI;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
