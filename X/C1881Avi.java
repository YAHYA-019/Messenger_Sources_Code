package X;

import java.util.BitSet;

/* renamed from: X.Avi, reason: case insensitive filesystem */
/* loaded from: Avi.class */
public final class C1881Avi extends C1rs {
    public 1Iw A00;
    public B0U A01;
    public final BitSet A02;
    public final String[] A03;

    public C1881Avi(1Iw r302, B0U b0u) {
        super(b0u, r302, 0, 0);
        this.A03 = new String[]{"broadcastFlowEnvironment", "fbUserSession", "forwardLimitChecker", "indexInList", "mnetLoggingItem", "searchEnvironment", "sectionTag", "sendButtonState", "sendButtonStateEnvironment", "threadItem", "threadTileViewData", "viewForMessageDisplay"};
        BitSet A18 = 1BK.A18(12);
        this.A02 = A18;
        this.A01 = b0u;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 12);
        A0J();
        return this.A01;
    }
}
