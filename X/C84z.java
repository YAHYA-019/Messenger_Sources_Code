package X;

import java.util.BitSet;

/* renamed from: X.84z, reason: invalid class name */
/* loaded from: 84z.class */
public final class C84z extends C1rs {
    public 1Iw A00;
    public 7GJ A01;
    public final BitSet A02;
    public final String[] A03;

    public C84z(1Iw r302, 7GJ r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "customBackgroundColor", "threadKey", "threadTileViewData", "tintColor", "upListener"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
