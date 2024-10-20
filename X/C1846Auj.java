package X;

import java.util.BitSet;

/* renamed from: X.Auj, reason: case insensitive filesystem */
/* loaded from: Auj.class */
public final class C1846Auj extends C1rs {
    public 1Iw A00;
    public B09 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1846Auj(1Iw r302, B09 b09) {
        super(b09, r302, 0, 0);
        this.A03 = new String[]{"initialSearchText", "searchBarListener", "showClearButton"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = b09;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
