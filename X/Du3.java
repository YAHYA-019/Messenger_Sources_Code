package X;

import java.util.BitSet;

/* loaded from: Du3.class */
public final class Du3 extends C1rs {
    public 1Iw A00;
    public 8oB A01;
    public final BitSet A02;
    public final String[] A03;

    public Du3(1Iw r302, 8oB r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"callback", "isGameLoaded", "isLandscapeOrientation", "isSeparateProcess"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = r303;
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
