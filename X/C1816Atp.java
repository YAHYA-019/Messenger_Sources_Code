package X;

import java.util.BitSet;

/* renamed from: X.Atp, reason: case insensitive filesystem */
/* loaded from: Atp.class */
public final class C1816Atp extends C1rs {
    public 1Iw A00;
    public B0A A01;
    public final BitSet A02;
    public final String[] A03;

    public C1816Atp(1Iw r302, B0A b0a) {
        super(b0a, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "itemClickListener", "migColorScheme", "replyEntry", "suggestionLogger"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = b0a;
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
