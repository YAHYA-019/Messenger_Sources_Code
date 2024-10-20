package X;

import java.util.BitSet;

/* loaded from: Dsk.class */
public final class Dsk extends C1rs {
    public 1Iw A00;
    public Dwv A01;
    public final BitSet A02;
    public final String[] A03;

    public Dsk(1Iw r302, Dwv dwv) {
        super(dwv, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "fbUserSession", "listener", "profileList", "screenResources", "syncedFields"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = dwv;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
