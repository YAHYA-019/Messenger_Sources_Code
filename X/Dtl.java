package X;

import java.util.BitSet;

/* loaded from: Dtl.class */
public final class Dtl extends C1rs {
    public 1Iw A00;
    public Dxo A01;
    public final BitSet A02;
    public final String[] A03;

    public Dtl(1Iw r302, Dxo dxo) {
        super(dxo, r302, 0, 0);
        this.A03 = new String[]{"initialTemplateContext", "template"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = dxo;
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
