package X;

import java.util.BitSet;

/* renamed from: X.Aum, reason: case insensitive filesystem */
/* loaded from: Aum.class */
public final class C1849Aum extends C1rs {
    public 1Iw A00;
    public C2009Az4 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1849Aum(1Iw r302, C2009Az4 c2009Az4) {
        super(c2009Az4, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "item"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = c2009Az4;
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
