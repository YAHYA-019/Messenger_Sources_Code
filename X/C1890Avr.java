package X;

import java.util.BitSet;

/* renamed from: X.Avr, reason: case insensitive filesystem */
/* loaded from: Avr.class */
public final class C1890Avr extends C1rs {
    public 1Iw A00;
    public C2003Ayw A01;
    public final BitSet A02;
    public final String[] A03;

    public C1890Avr(1Iw r302, C2003Ayw c2003Ayw) {
        super(c2003Ayw, r302, 0, 0);
        this.A03 = new String[]{"model"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = c2003Ayw;
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
