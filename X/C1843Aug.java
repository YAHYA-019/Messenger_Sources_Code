package X;

import java.util.BitSet;

/* renamed from: X.Aug, reason: case insensitive filesystem */
/* loaded from: Aug.class */
public final class C1843Aug extends C1rs {
    public 1Iw A00;
    public B08 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1843Aug(1Iw r302, B08 b08) {
        super(b08, r302, 0, 0);
        this.A03 = new String[]{"listener"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = b08;
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
