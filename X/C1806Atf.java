package X;

import java.util.BitSet;

/* renamed from: X.Atf, reason: case insensitive filesystem */
/* loaded from: Atf.class */
public final class C1806Atf extends C1rs {
    public 1Iw A00;
    public B0G A01;
    public final BitSet A02;
    public final String[] A03;

    public C1806Atf(1Iw r302, B0G b0g) {
        super(b0g, r302, 0, 0);
        this.A03 = new String[]{"accountName", "colorScheme", "fbUserSession", "isFromOauth", "userId"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = b0g;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
