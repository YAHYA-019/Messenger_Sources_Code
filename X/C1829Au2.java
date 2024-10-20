package X;

import java.util.BitSet;

/* renamed from: X.Au2, reason: case insensitive filesystem */
/* loaded from: Au2.class */
public final class C1829Au2 extends C1rs {
    public 1Iw A00;
    public B0J A01;
    public final BitSet A02;
    public final String[] A03;

    public C1829Au2(1Iw r302, B0J b0j) {
        super(b0j, r302, 0, 0);
        this.A03 = new String[]{"appFragment", "coplayCTAButtonState", "difficulty", "fbUserSession", "genre", "ineligiblePlayers", "maxPlayerCount", "minPlayerCount", "minRoundLength"};
        BitSet A18 = 1BK.A18(9);
        this.A02 = A18;
        this.A01 = b0j;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A18(this, this.A02, this.A03);
        return this.A01;
    }
}
