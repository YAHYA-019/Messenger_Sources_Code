package X;

import java.util.BitSet;

/* loaded from: Dsa.class */
public final class Dsa extends C1rs {
    public 1Iw A00;
    public DxG A01;
    public final BitSet A02;
    public final String[] A03;

    public Dsa(1Iw r302, DxG dxG) {
        super(dxG, r302, 0, 0);
        this.A03 = new String[]{"clickListener", "colorScheme", "data", "renderState"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = dxG;
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
