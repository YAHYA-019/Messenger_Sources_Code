package X;

import java.util.BitSet;

/* renamed from: X.2zk, reason: invalid class name */
/* loaded from: 2zk.class */
public final class C2zk extends C1rs {
    public 1Iw A00;
    public C2pg A01;
    public final BitSet A02;
    public final String[] A03;

    public C2zk(1Iw r302, C2pg c2pg) {
        super(c2pg, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "textColor", "textStyle", "timestampText"};
        BitSet bitSet = new BitSet(4);
        this.A02 = bitSet;
        this.A01 = c2pg;
        this.A00 = r302;
        bitSet.clear();
    }

    public C2pg A2W() {
        C1rs.A05(this.A02, this.A03, 4);
        A0J();
        return this.A01;
    }
}
