package X;

import java.util.BitSet;

/* renamed from: X.Ati, reason: case insensitive filesystem */
/* loaded from: Ati.class */
public final class C1809Ati extends C1rs {
    public 1Iw A00;
    public B0q A01;
    public final BitSet A02;
    public final String[] A03;

    public C1809Ati(1Iw r302, B0q b0q) {
        super(b0q, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "model"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = b0q;
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
