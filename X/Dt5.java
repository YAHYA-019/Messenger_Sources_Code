package X;

import java.util.BitSet;

/* loaded from: Dt5.class */
public final class Dt5 extends C1rs {
    public 1Iw A00;
    public Az5 A01;
    public final BitSet A02;
    public final String[] A03;

    public Dt5(1Iw r302, Az5 az5) {
        super(az5, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "listener"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = az5;
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
