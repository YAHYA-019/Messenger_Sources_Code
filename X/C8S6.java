package X;

import java.util.BitSet;

/* renamed from: X.8S6, reason: invalid class name */
/* loaded from: 8S6.class */
public final class C8S6 extends C1rs {
    public 1Iw A00;
    public C8k6 A01;
    public final BitSet A02;
    public final String[] A03;

    public C8S6(1Iw r302, C8k6 c8k6) {
        super(c8k6, r302, 0, 0);
        this.A03 = new String[]{"resId"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = c8k6;
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
