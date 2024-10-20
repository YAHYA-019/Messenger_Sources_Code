package X;

import java.util.BitSet;

/* renamed from: X.Av6, reason: case insensitive filesystem */
/* loaded from: Av6.class */
public final class C1869Av6 extends C1rs {
    public 1Iw A00;
    public C2004Ayx A01;
    public final BitSet A02;
    public final String[] A03;

    public C1869Av6(1Iw r302, C2004Ayx c2004Ayx) {
        super(c2004Ayx, r302, 0, 0);
        this.A03 = new String[]{"items"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = c2004Ayx;
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
