package X;

import java.util.BitSet;

/* loaded from: Dt3.class */
public final class Dt3 extends C1rs {
    public 1Iw A00;
    public C8jh A01;
    public final BitSet A02;
    public final String[] A03;

    public Dt3(1Iw r302, C8jh c8jh) {
        super(c8jh, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "fbUserSession", "listener", "reactions", "selectedReaction"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = c8jh;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
