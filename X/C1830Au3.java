package X;

import java.util.BitSet;

/* renamed from: X.Au3, reason: case insensitive filesystem */
/* loaded from: Au3.class */
public final class C1830Au3 extends C1rs {
    public 1Iw A00;
    public AzA A01;
    public final BitSet A02;
    public final String[] A03;

    public C1830Au3(1Iw r302, AzA azA) {
        super(azA, r302, 0, 0);
        this.A03 = new String[]{"loggingSurface", "secureContextHelper", "showLock", "textColor"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = azA;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A02(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
