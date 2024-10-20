package X;

import java.util.BitSet;

/* loaded from: Du2.class */
public final class Du2 extends C1rs {
    public 1Iw A00;
    public C8nw A01;
    public final BitSet A02;
    public final String[] A03;

    public Du2(1Iw r302, C8nw c8nw) {
        super(c8nw, r302, 0, 0);
        this.A03 = new String[]{"callback", "canShowShareIcon", "communityHudContentDescription", "gameExitString", "gameShareString", "isLandscapeOrientation", "showScreenshotIcon"};
        BitSet A18 = 1BK.A18(7);
        this.A02 = A18;
        this.A01 = c8nw;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A16(this, this.A02, this.A03);
        return this.A01;
    }
}
