package X;

import java.util.BitSet;

/* renamed from: X.Au7, reason: case insensitive filesystem */
/* loaded from: Au7.class */
public final class C1834Au7 extends C1rs {
    public 1Iw A00;
    public Dz8 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1834Au7(1Iw r302, Dz8 dz8) {
        super(dz8, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "emoji", "isSelected", "listener"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = dz8;
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
