package X;

import java.util.BitSet;

/* renamed from: X.Gk6, reason: case insensitive filesystem */
/* loaded from: Gk6.class */
public final class C2652Gk6 extends C1rs {
    public 1Iw A00;
    public 8mY A01;
    public final BitSet A02;
    public final String[] A03;

    public C2652Gk6(1Iw r302, 8mY r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"bucket", "isInHighlightsFeed", "isViewerInLongPressMode", "storyCard"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A02(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
