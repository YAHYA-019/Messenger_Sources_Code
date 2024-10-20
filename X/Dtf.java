package X;

import java.util.BitSet;

/* loaded from: Dtf.class */
public final class Dtf extends C1rs {
    public 1Iw A00;
    public AyM A01;
    public final BitSet A02;
    public final String[] A03;

    public Dtf(1Iw r302, AyM ayM) {
        super(ayM, r302, 0, 0);
        this.A03 = new String[]{"template"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = ayM;
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
