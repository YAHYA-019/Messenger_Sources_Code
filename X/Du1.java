package X;

import java.util.BitSet;

/* loaded from: Du1.class */
public final class Du1 extends C1rs {
    public 1Iw A00;
    public 8oY A01;
    public final BitSet A02;
    public final String[] A03;

    public Du1(1Iw r302, 8oY r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"callback", "isLandscapeOrientation"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = r303;
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