package X;

import java.util.BitSet;

/* renamed from: X.Auv, reason: case insensitive filesystem */
/* loaded from: Auv.class */
public final class C1858Auv extends C1rs {
    public 1Iw A00;
    public C2031Azs A01;
    public final BitSet A02;
    public final String[] A03;

    public C1858Auv(1Iw r302, C2031Azs c2031Azs) {
        super(c2031Azs, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "items"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = c2031Azs;
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
