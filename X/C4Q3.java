package X;

import java.util.BitSet;

/* renamed from: X.4Q3, reason: invalid class name */
/* loaded from: 4Q3.class */
public final class C4Q3 extends C1rs {
    public 1Iw A00;
    public 3wR A01;
    public final BitSet A02;
    public final String[] A03;

    public C4Q3(1Iw r302, 3wR r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "isSelected", "title"};
        BitSet bitSet = new BitSet(3);
        this.A02 = bitSet;
        this.A01 = r303;
        this.A00 = r302;
        bitSet.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
