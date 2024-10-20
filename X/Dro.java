package X;

import java.util.BitSet;

/* loaded from: Dro.class */
public final class Dro extends C1rs {
    public C8mr A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public Dro(C8mr c8mr, 1Iw r303) {
        super(c8mr, r303, 0, 0);
        this.A03 = new String[]{"colorScheme", "iconName", "iconSize"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A00 = c8mr;
        this.A01 = r303;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A00;
    }
}
