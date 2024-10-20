package X;

import java.util.BitSet;

/* loaded from: Du7.class */
public final class Du7 extends C1rs {
    public 1Iw A00;
    public 2Kd A01;
    public final BitSet A02;
    public final String[] A03;

    public Du7(1Iw r302, 2Kd r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"fullName", "textColor", "textSize"};
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
