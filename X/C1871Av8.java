package X;

import java.util.BitSet;

/* renamed from: X.Av8, reason: case insensitive filesystem */
/* loaded from: Av8.class */
public final class C1871Av8 extends C1rs {
    public 1Iw A00;
    public B0R A01;
    public final BitSet A02;
    public final String[] A03;

    public C1871Av8(1Iw r302, B0R b0r) {
        super(b0r, r302, 0, 0);
        this.A03 = new String[]{"audience", "readyToSelectAudience", "screenType", "targetType", "userSession"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = b0r;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
