package X;

import java.util.BitSet;

/* loaded from: Dtn.class */
public final class Dtn extends C1rs {
    public 1Iw A00;
    public Dwo A01;
    public final BitSet A02;
    public final String[] A03;

    public Dtn(1Iw r302, Dwo dwo) {
        super(dwo, r302, 0, 0);
        this.A03 = new String[]{"bloksContext"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = dwo;
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
