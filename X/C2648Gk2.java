package X;

import java.util.BitSet;

/* renamed from: X.Gk2, reason: case insensitive filesystem */
/* loaded from: Gk2.class */
public final class C2648Gk2 extends C1rs {
    public 1Iw A00;
    public GlN A01;
    public final BitSet A02;
    public final String[] A03;

    public C2648Gk2(1Iw r302, GlN glN) {
        super(glN, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "eventBus", "fbUserSession", "playbackController", "playerOrigin", "playerType", "richVideoPlayerParams", "videoState"};
        BitSet A18 = 1BK.A18(8);
        this.A02 = A18;
        this.A01 = glN;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A17(this, this.A02, this.A03);
        return this.A01;
    }
}