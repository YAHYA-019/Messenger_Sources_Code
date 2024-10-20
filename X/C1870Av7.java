package X;

import java.util.BitSet;

/* renamed from: X.Av7, reason: case insensitive filesystem */
/* loaded from: Av7.class */
public final class C1870Av7 extends C1rs {
    public 1Iw A00;
    public AyL A01;
    public final BitSet A02;
    public final String[] A03;

    public C1870Av7(1Iw r302, AyL ayL) {
        super(ayL, r302, 0, 0);
        this.A03 = new String[]{"item"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = ayL;
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
