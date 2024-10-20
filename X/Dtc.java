package X;

import java.util.BitSet;

/* loaded from: Dtc.class */
public final class Dtc extends C1rs {
    public 1Iw A00;
    public Dx6 A01;
    public final BitSet A02;
    public final String[] A03;

    public Dtc(1Iw r302, Dx6 dx6) {
        super(dx6, r302, 0, 0);
        this.A03 = DKD.A1b();
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = dx6;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
