package X;

import java.util.BitSet;

/* renamed from: X.88d, reason: invalid class name */
/* loaded from: 88d.class */
public final class C88d extends C1rs {
    public 1Iw A00;
    public 7XI A01;
    public final BitSet A02;
    public final String[] A03;

    public C88d(1Iw r302, 7XI r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"capabilities", "contextItems", "folderName", "fragmentManager", "otherUser", "threadKey", "threadNameViewData", "threadSummary", "threadTileViewData", "threadViewTheme"};
        BitSet A18 = 1BK.A18(10);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A19(this, this.A02, this.A03);
        return this.A01;
    }
}
