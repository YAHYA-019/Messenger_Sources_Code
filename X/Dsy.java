package X;

import java.util.BitSet;

/* loaded from: Dsy.class */
public final class Dsy extends C1rs {
    public 1Iw A00;
    public Dz1 A01;
    public final BitSet A02;
    public final String[] A03;

    public Dsy(1Iw r302, Dz1 dz1) {
        super(dz1, r302, 0, 0);
        this.A03 = new String[]{"buyerFirstName", "dismissListener", "fbUserSession", "messageThreadGraphQLId", "messageThreadId", "productItemId"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = dz1;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
