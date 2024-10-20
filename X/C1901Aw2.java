package X;

import java.util.BitSet;

/* renamed from: X.Aw2, reason: case insensitive filesystem */
/* loaded from: Aw2.class */
public final class C1901Aw2 extends C1rs {
    public 1Iw A00;
    public C8j2 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1901Aw2(1Iw r302, C8j2 c8j2) {
        super(c8j2, r302, 0, 0);
        this.A03 = new String[]{"text"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = c8j2;
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
