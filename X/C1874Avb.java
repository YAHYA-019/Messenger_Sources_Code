package X;

import java.util.BitSet;

/* renamed from: X.Avb, reason: case insensitive filesystem */
/* loaded from: Avb.class */
public final class C1874Avb extends C1rs {
    public 1Iw A00;
    public B18 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1874Avb(1Iw r302, B18 b18) {
        super(b18, r302, 0, 0);
        this.A03 = new String[]{"broadcastFlowEnvironment", "broadcastFlowModel", "colorScheme", "creationMode", "executorService", "fbUserSession", "selectedThreadKeyList", "viewForErrorDisplay"};
        BitSet A18 = 1BK.A18(8);
        this.A02 = A18;
        this.A01 = b18;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A17(this, this.A02, this.A03);
        return this.A01;
    }
}
