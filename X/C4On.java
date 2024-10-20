package X;

import java.util.BitSet;

/* renamed from: X.4On, reason: invalid class name */
/* loaded from: 4On.class */
public final class C4On extends C1rs {
    public 1Iw A00;
    public C03473y5 A01;
    public final BitSet A02;
    public final String[] A03;

    public C4On(1Iw r302, C03473y5 c03473y5) {
        super(c03473y5, r302, 0, 0);
        this.A03 = new String[]{"badgeColor", "badgeText", "borderColor", "colorScheme", "textColor"};
        BitSet bitSet = new BitSet(5);
        this.A02 = bitSet;
        this.A01 = c03473y5;
        this.A00 = r302;
        bitSet.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
