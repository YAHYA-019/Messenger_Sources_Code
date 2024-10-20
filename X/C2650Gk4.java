package X;

import java.util.BitSet;

/* renamed from: X.Gk4, reason: case insensitive filesystem */
/* loaded from: Gk4.class */
public final class C2650Gk4 extends C1rs {
    public 1Iw A00;
    public GlB A01;
    public final BitSet A02;
    public final String[] A03;

    public C2650Gk4(1Iw r302, GlB glB) {
        super(glB, r302, 0, 0);
        this.A03 = new String[]{"autoPlayDirect", "countDownStartedListener", "eventType", "inPipOrChicletMode", "livingRoomId", "playerHeight", "playerWidth", "richVideoPlayerEventBus", "timeToAutoPlay", "video"};
        BitSet A18 = 1BK.A18(10);
        this.A02 = A18;
        this.A01 = glB;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A19(this, this.A02, this.A03);
        return this.A01;
    }
}
