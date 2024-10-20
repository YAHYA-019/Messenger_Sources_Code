package X;

import java.util.BitSet;

/* renamed from: X.4Q2, reason: invalid class name */
/* loaded from: 4Q2.class */
public final class C4Q2 extends C1rs {
    public 1Iw A00;
    public 3wT A01;
    public final BitSet A02;
    public final String[] A03;

    public C4Q2(1Iw r302, 3wT r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "initialSelectedTab", "initialTabComponents", "recyclerConfiguration", "recyclerInset", "tabRenderer", "tabSpacing", "tabs"};
        BitSet bitSet = new BitSet(8);
        this.A02 = bitSet;
        this.A01 = r303;
        this.A00 = r302;
        bitSet.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 8);
        3wT r0 = this.A01;
        C2ko c2ko = r0.A04;
        if (c2ko == null) {
            c2ko = 1LI.A0D(r0, this.A00, -1676137196);
        }
        r0.A04 = c2ko;
        A0J();
        return r0;
    }
}
