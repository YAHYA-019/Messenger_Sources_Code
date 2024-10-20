package X;

import java.util.BitSet;

/* renamed from: X.855, reason: invalid class name */
/* loaded from: 855.class */
public final class AnonymousClass855 extends C1rs {
    public 1Iw A00;
    public AnonymousClass649 A01;
    public final BitSet A02;
    public final String[] A03;

    public AnonymousClass855(1Iw r302, AnonymousClass649 anonymousClass649) {
        super(anonymousClass649, r302, 0, 0);
        this.A03 = new String[]{"capabilities", "coreBindings", "fbUserSession", "fragmentManager", "item", "listener", "messageComponentViewTags", "rowViewType", "textContentProvider", "textSpannableProvider", "theme", "threadViewSurface"};
        BitSet bitSet = new BitSet(12);
        this.A02 = bitSet;
        this.A01 = anonymousClass649;
        this.A00 = r302;
        bitSet.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 12);
        A0J();
        return this.A01;
    }
}
