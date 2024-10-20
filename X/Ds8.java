package X;

import java.util.BitSet;

/* loaded from: Ds8.class */
public final class Ds8 extends C1rs {
    public C8j9 A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public Ds8(C8j9 c8j9, 1Iw r303) {
        super(c8j9, r303, 0, 0);
        this.A03 = DKD.A1b();
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A00 = c8j9;
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
