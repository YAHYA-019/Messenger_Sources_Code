package X;

import java.util.BitSet;

/* loaded from: Dt7.class */
public final class Dt7 extends C1rs {
    public 1Iw A00;
    public Dwn A01;
    public final BitSet A02;
    public final String[] A03;

    public Dt7(1Iw r302, Dwn dwn) {
        super(dwn, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "fbUserSession", "videoState"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = dwn;
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
