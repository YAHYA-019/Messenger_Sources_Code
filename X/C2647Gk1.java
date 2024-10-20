package X;

import java.util.BitSet;

/* renamed from: X.Gk1, reason: case insensitive filesystem */
/* loaded from: Gk1.class */
public final class C2647Gk1 extends C1rs {
    public 1Iw A00;
    public GlR A01;
    public final BitSet A02;
    public final String[] A03;

    public C2647Gk1(1Iw r302, GlR glR) {
        super(glR, r302, 0, 0);
        this.A03 = new String[]{"defaultVideoState", "playbackController", "playerOrigin", "playerType", "richVideoPlayerEventBus", "richVideoPlayerParams", "videoPlaybackStatusProvider"};
        BitSet A18 = 1BK.A18(7);
        this.A02 = A18;
        this.A01 = glR;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A16(this, this.A02, this.A03);
        return this.A01;
    }
}
