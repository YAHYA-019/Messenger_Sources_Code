package X;

import java.util.BitSet;

/* renamed from: X.84k, reason: invalid class name */
/* loaded from: 84k.class */
public final class C84k extends C1rs {
    public 1Iw A00;
    public 7Ed A01;
    public final BitSet A02;
    public final String[] A03;

    public C84k(1Iw r302, 7Ed r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"drawableRes", "iconColor"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = r303;
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
