package X;

import java.util.BitSet;

/* renamed from: X.89x, reason: invalid class name */
/* loaded from: 89x.class */
public final class C89x extends C1rs {
    public 1Iw A00;
    public C89y A01;
    public final BitSet A02;
    public final String[] A03;

    public C89x(1Iw r302, C89y c89y) {
        super(c89y, r302, 0, 0);
        this.A03 = new String[]{"capabilities", "item", "theme"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = c89y;
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
