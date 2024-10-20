package X;

import java.util.BitSet;

/* renamed from: X.Av9, reason: case insensitive filesystem */
/* loaded from: Av9.class */
public final class C1872Av9 extends C1rs {
    public 1Iw A00;
    public B0Y A01;
    public final BitSet A02;
    public final String[] A03;

    public C1872Av9(1Iw r302, B0Y b0y) {
        super(b0y, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "mode"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = b0y;
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
