package X;

import java.util.BitSet;

/* renamed from: X.GkZ, reason: case insensitive filesystem */
/* loaded from: GkZ.class */
public final class C2657GkZ extends C1rs {
    public 1Iw A00;
    public Glj A01;
    public final BitSet A02;
    public final String[] A03;

    public C2657GkZ(1Iw r302, Glj glj) {
        super(glj, r302, 0, 0);
        this.A03 = new String[]{"boundRichVideoPlayerEventBus", "defaultVideoState", "playbackController", "playerOrigin", "playerType", "richVideoPlayerParams"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = glj;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
