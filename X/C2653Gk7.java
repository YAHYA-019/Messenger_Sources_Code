package X;

import java.util.BitSet;

/* renamed from: X.Gk7, reason: case insensitive filesystem */
/* loaded from: Gk7.class */
public final class C2653Gk7 extends C1rs {
    public 1Iw A00;
    public DyM A01;
    public final BitSet A02;
    public final String[] A03;

    public C2653Gk7(1Iw r302, DyM dyM) {
        super(dyM, r302, 0, 0);
        this.A03 = new String[]{"appNavigationDelegate", "fbUserSession", "owner", "storyCard", "storyCardOverlay", "viewerSessionId"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = dyM;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
