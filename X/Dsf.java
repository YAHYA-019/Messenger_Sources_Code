package X;

import java.util.BitSet;

/* loaded from: Dsf.class */
public final class Dsf extends C1rs {
    public 1Iw A00;
    public 8kV A01;
    public final BitSet A02;
    public final String[] A03;

    public Dsf(1Iw r302, 8kV r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"businessColor", "migColorScheme", "text"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
