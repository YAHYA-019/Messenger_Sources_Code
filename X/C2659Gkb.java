package X;

import java.util.BitSet;

/* renamed from: X.Gkb, reason: case insensitive filesystem */
/* loaded from: Gkb.class */
public final class C2659Gkb extends C1rs {
    public 1Iw A00;
    public Gla A01;
    public final BitSet A02;
    public final String[] A03;

    public C2659Gkb(1Iw r302, Gla gla) {
        super(gla, r302, 0, 0);
        this.A03 = new String[]{"boundRichVideoPlayerEventBus", "playbackController", "playerOrigin", "playerType", "richVideoPlayerParams", "videoPlaybackStatusProvider"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = gla;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
