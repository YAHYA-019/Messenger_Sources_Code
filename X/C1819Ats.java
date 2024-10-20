package X;

import java.util.BitSet;

/* renamed from: X.Ats, reason: case insensitive filesystem */
/* loaded from: Ats.class */
public final class C1819Ats extends C1rs {
    public 1Iw A00;
    public C7fx A01;
    public final BitSet A02;
    public final String[] A03;

    public C1819Ats(1Iw r302, C7fx c7fx) {
        super(c7fx, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "description", "primaryButtonTitle", "title"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = c7fx;
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
