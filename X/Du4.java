package X;

import java.util.BitSet;

/* loaded from: Du4.class */
public final class Du4 extends C1rs {
    public 1Iw A00;
    public Dyx A01;
    public final BitSet A02;
    public final String[] A03;

    public Du4(1Iw r302, Dyx dyx, int i) {
        super(dyx, r302, 0, i);
        this.A03 = new String[]{"message"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = dyx;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
