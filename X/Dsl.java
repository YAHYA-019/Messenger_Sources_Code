package X;

import java.util.BitSet;

/* loaded from: Dsl.class */
public final class Dsl extends C1rs {
    public 1Iw A00;
    public Dww A01;
    public final BitSet A02;
    public final String[] A03;

    public Dsl(1Iw r302, Dww dww) {
        super(dww, r302, 0, 0);
        this.A03 = new String[]{"bodyText", "buttonText", "colorScheme", "fbUserSession", "hasNoLinkAccount", "listener", "profileList"};
        BitSet A18 = 1BK.A18(7);
        this.A02 = A18;
        this.A01 = dww;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A16(this, this.A02, this.A03);
        return this.A01;
    }
}
