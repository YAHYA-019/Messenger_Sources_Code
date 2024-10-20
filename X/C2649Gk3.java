package X;

import java.util.BitSet;

/* renamed from: X.Gk3, reason: case insensitive filesystem */
/* loaded from: Gk3.class */
public final class C2649Gk3 extends C1rs {
    public 1Iw A00;
    public C2700Gln A01;
    public final BitSet A02;
    public final String[] A03;

    public C2649Gk3(1Iw r302, C2700Gln c2700Gln) {
        super(c2700Gln, r302, 0, 0);
        this.A03 = new String[]{"adBreakState", "colorScheme", "eventBus", "fbUserSession", "playbackController", "playerOrigin", "playerType", "richVideoPlayerParams", "videoState"};
        BitSet A18 = 1BK.A18(9);
        this.A02 = A18;
        this.A01 = c2700Gln;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A18(this, this.A02, this.A03);
        return this.A01;
    }
}
