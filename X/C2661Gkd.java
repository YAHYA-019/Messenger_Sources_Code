package X;

import java.util.BitSet;

/* renamed from: X.Gkd, reason: case insensitive filesystem */
/* loaded from: Gkd.class */
public final class C2661Gkd extends C1rs {
    public 1Iw A00;
    public GlX A01;
    public final BitSet A02;
    public final String[] A03;

    public C2661Gkd(1Iw r302, GlX glX) {
        super(glX, r302, 0, 0);
        this.A03 = new String[]{"richVideoPlayerParams", "videoPlayerEventBus", "videoPlayerStateListener"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = glX;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
