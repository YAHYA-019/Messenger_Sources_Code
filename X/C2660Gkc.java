package X;

import java.util.BitSet;

/* renamed from: X.Gkc, reason: case insensitive filesystem */
/* loaded from: Gkc.class */
public final class C2660Gkc extends C1rs {
    public 1Iw A00;
    public C2693Glf A01;
    public final BitSet A02;
    public final String[] A03;

    public C2660Gkc(1Iw r302, C2693Glf c2693Glf) {
        super(c2693Glf, r302, 0, 0);
        this.A03 = new String[]{"boundRichVideoPlayerEventBus", "logTag", "playerOrigin", "playerType", "pluginPacks", "richVideoPlayerParams", "videoPlaybackStatusProvider", "videoState"};
        BitSet A18 = 1BK.A18(8);
        this.A02 = A18;
        this.A01 = c2693Glf;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A17(this, this.A02, this.A03);
        return this.A01;
    }
}
