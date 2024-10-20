package X;

import java.util.BitSet;

/* loaded from: Due.class */
public final class Due extends C1rs {
    public 1Iw A00;
    public Dxr A01;
    public final BitSet A02;
    public final String[] A03;

    public Due(1Iw r302, Dxr dxr) {
        super(dxr, r302, 0, 0);
        this.A03 = new String[]{"bloksContext"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = dxr;
        this.A00 = r302;
        A18.clear();
    }

    public static Due A06(1Iw r301) {
        return new Due(r301, new Dxr());
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
