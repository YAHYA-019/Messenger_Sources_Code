package X;

import java.util.BitSet;

/* loaded from: Drt.class */
public final class Drt extends C1rs {
    public DyE A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public Drt(DyE dyE, 1Iw r303) {
        super(dyE, r303, 0, 0);
        this.A03 = new String[]{"checkedDrawable", "uncheckedDrawable"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A00 = dyE;
        this.A01 = r303;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A00;
    }
}