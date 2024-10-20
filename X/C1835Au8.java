package X;

import java.util.BitSet;

/* renamed from: X.Au8, reason: case insensitive filesystem */
/* loaded from: Au8.class */
public final class C1835Au8 extends C1rs {
    public 1Iw A00;
    public DxH A01;
    public final BitSet A02;
    public final String[] A03;

    public C1835Au8(1Iw r302, DxH dxH) {
        super(dxH, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "title", "titleContentDescription"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = dxH;
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
