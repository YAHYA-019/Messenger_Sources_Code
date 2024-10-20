package X;

import java.util.BitSet;

/* renamed from: X.84y, reason: invalid class name */
/* loaded from: 84y.class */
public final class C84y extends C1rs {
    public 1Iw A00;
    public C6bm A01;
    public final BitSet A02;
    public final String[] A03;

    public C84y(1Iw r302, C6bm c6bm) {
        super(c6bm, r302, 0, 0);
        this.A03 = new String[]{"animateSubtitle", "colorScheme", "shouldDisplayVerifiedBadge", "threadNameViewData", "threadTileViewData", "tintColor"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = c6bm;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
