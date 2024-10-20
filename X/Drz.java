package X;

import java.util.BitSet;

/* loaded from: Drz.class */
public final class Drz extends C1rs {
    public DyT A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public Drz(DyT dyT, 1Iw r303) {
        super(dyT, r303, 0, 0);
        this.A03 = DKD.A1b();
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A00 = dyT;
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
