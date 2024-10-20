package X;

import java.util.BitSet;

/* renamed from: X.Atr, reason: case insensitive filesystem */
/* loaded from: Atr.class */
public final class C1818Atr extends C1rs {
    public 1Iw A00;
    public Az2 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1818Atr(1Iw r302, Az2 az2) {
        super(az2, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "listener"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = az2;
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
