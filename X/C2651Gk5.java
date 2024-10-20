package X;

import java.util.BitSet;

/* renamed from: X.Gk5, reason: case insensitive filesystem */
/* loaded from: Gk5.class */
public final class C2651Gk5 extends C1rs {
    public 1Iw A00;
    public C8mt A01;
    public final BitSet A02;
    public final String[] A03;

    public C2651Gk5(1Iw r302, C8mt c8mt) {
        super(c8mt, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "titleText"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = c8mt;
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
