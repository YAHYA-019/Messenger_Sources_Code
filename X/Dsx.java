package X;

import java.util.BitSet;

/* loaded from: Dsx.class */
public final class Dsx extends C1rs {
    public 1Iw A00;
    public Dz9 A01;
    public final BitSet A02;
    public final String[] A03;

    public Dsx(1Iw r302, Dz9 dz9) {
        super(dz9, r302, 0, 0);
        this.A03 = new String[]{"addLabelHandler", "dismissListener", "fbUserSession", "forSaleItemGraphQL", "fragmentManager", "initialStatusLabel", "messageThreadGraphQL", "sessionId", "threadSummary"};
        BitSet A18 = 1BK.A18(9);
        this.A02 = A18;
        this.A01 = dz9;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A18(this, this.A02, this.A03);
        return this.A01;
    }
}
