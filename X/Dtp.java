package X;

import java.util.BitSet;

/* loaded from: Dtp.class */
public final class Dtp extends C1rs {
    public 1Iw A00;
    public Dzd A01;
    public final BitSet A02;
    public final String[] A03;

    public Dtp(1Iw r302, Dzd dzd) {
        super(dzd, r302, 0, 0);
        this.A03 = new String[]{"eventHandler", "model", "pageId"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = dzd;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
