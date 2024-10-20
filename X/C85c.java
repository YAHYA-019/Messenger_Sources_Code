package X;

import java.util.BitSet;

/* renamed from: X.85c, reason: invalid class name */
/* loaded from: 85c.class */
public final class C85c extends C1rs {
    public 1Iw A00;
    public 7JK A01;
    public final BitSet A02;
    public final String[] A03;

    public C85c(1Iw r302, 7JK r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"corners"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = r303;
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
