package X;

import java.util.BitSet;

/* renamed from: X.Aci, reason: case insensitive filesystem */
/* loaded from: Aci.class */
public final class C1278Aci extends C1rs {
    public 1Iw A00;
    public C1276Acg A01;
    public final BitSet A02;
    public final String[] A03;

    public C1278Aci(1Iw r302, C1276Acg c1276Acg) {
        super(c1276Acg, r302, 0, 0);
        this.A03 = new String[]{"adminListener", "capabilities", "item", "theme"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = c1276Acg;
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
