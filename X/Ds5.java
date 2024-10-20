package X;

import java.util.BitSet;

/* loaded from: Ds5.class */
public final class Ds5 extends C1rs {
    public DzH A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public Ds5(DzH dzH, 1Iw r303) {
        super(dzH, r303, 0, 0);
        this.A03 = new String[]{"context", "isChecked", "isClickable", "isEnabled"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A00 = dzH;
        this.A01 = r303;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A02(this.A02, this.A03);
        A0J();
        return this.A00;
    }
}
