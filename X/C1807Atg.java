package X;

import java.util.BitSet;

/* renamed from: X.Atg, reason: case insensitive filesystem */
/* loaded from: Atg.class */
public final class C1807Atg extends C1rs {
    public 1Iw A00;
    public B19 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1807Atg(1Iw r302, B19 b19) {
        super(b19, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "fbUserSession", "loginStyle", "showMultiSsoWithRichContext"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = b19;
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
