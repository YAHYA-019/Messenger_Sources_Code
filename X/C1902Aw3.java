package X;

import java.util.BitSet;

/* renamed from: X.Aw3, reason: case insensitive filesystem */
/* loaded from: Aw3.class */
public final class C1902Aw3 extends C1rs {
    public 1Iw A00;
    public C1994Ayn A01;
    public final BitSet A02;
    public final String[] A03;

    public C1902Aw3(1Iw r302, C1994Ayn c1994Ayn) {
        super(c1994Ayn, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "subtitleTextColor", "subtitleTextStyle", "title", "titleTextColor", "titleTextStyle"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = c1994Ayn;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}