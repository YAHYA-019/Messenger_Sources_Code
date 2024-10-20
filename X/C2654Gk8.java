package X;

import java.util.BitSet;

/* renamed from: X.Gk8, reason: case insensitive filesystem */
/* loaded from: Gk8.class */
public final class C2654Gk8 extends C1rs {
    public 1Iw A00;
    public C2687Gl5 A01;
    public final BitSet A02;
    public final String[] A03;

    public C2654Gk8(1Iw r302, C2687Gl5 c2687Gl5) {
        super(c2687Gl5, r302, 0, 0);
        this.A03 = new String[]{"appNavigationDelegate", "bucket", "bucketEvents", "delegate", "isCurrentlyConfirmingReply", "loggingDelegate", "navigationDelegate", "showNavigationArrows", "storyCard", "storyViewerContext"};
        BitSet A18 = 1BK.A18(10);
        this.A02 = A18;
        this.A01 = c2687Gl5;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A19(this, this.A02, this.A03);
        return this.A01;
    }
}
