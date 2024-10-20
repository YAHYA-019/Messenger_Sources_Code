package X;

import java.util.BitSet;

/* renamed from: X.88e, reason: invalid class name */
/* loaded from: 88e.class */
public final class C88e extends C1rs {
    public 1Iw A00;
    public 7XK A01;
    public final BitSet A02;
    public final String[] A03;

    public C88e(1Iw r302, 7XK r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"capabilities", "contextItems", "folderName", "fragmentManager", "isMessageRequestThread", "otherUser", "threadKey", "threadSummary", "threadTileViewData", "threadViewTheme", "title"};
        BitSet A18 = 1BK.A18(11);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A1A(this, this.A02, this.A03);
        return this.A01;
    }
}
