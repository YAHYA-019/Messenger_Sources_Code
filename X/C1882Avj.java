package X;

import java.util.BitSet;

/* renamed from: X.Avj, reason: case insensitive filesystem */
/* loaded from: Avj.class */
public final class C1882Avj extends C1rs {
    public 1Iw A00;
    public B0V A01;
    public final BitSet A02;
    public final String[] A03;

    public C1882Avj(1Iw r302, B0V b0v) {
        super(b0v, r302, 0, 0);
        this.A03 = new String[]{"broadcastFlowEnvironment", "fbUserSession", "forwardLimitChecker", "mnetLoggingItem", "searchEnvironment", "sectionTag", "sendButtonState", "sendButtonStateEnvironment", "threadTileViewData", "userItem", "viewForMessageDisplay"};
        BitSet A18 = 1BK.A18(11);
        this.A02 = A18;
        this.A01 = b0v;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A1A(this, this.A02, this.A03);
        return this.A01;
    }
}
