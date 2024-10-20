package X;

import java.util.BitSet;

/* renamed from: X.8S2, reason: invalid class name */
/* loaded from: 8S2.class */
public final class C8S2 extends C1rs {
    public 1Iw A00;
    public Dyg A01;
    public final BitSet A02;
    public final String[] A03;

    public C8S2(1Iw r302, Dyg dyg) {
        super(dyg, r302, 0, 0);
        this.A03 = new String[]{"textColor"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = dyg;
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
