package X;

import java.util.BitSet;

/* loaded from: Dtk.class */
public final class Dtk extends C1rs {
    public 1Iw A00;
    public DzG A01;
    public final BitSet A02;
    public final String[] A03;

    public Dtk(1Iw r302, DzG dzG) {
        super(dzG, r302, 0, 0);
        this.A03 = DKD.A1b();
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = dzG;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A00(this.A02, this.A03);
        DzG dzG = this.A01;
        C2ko c2ko = dzG.A00;
        if (c2ko == null) {
            c2ko = 1LI.A0D(dzG, this.A00, -1738163875);
        }
        dzG.A00 = c2ko;
        A0J();
        return dzG;
    }
}
