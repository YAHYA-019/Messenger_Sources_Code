package X;

import java.util.BitSet;

/* renamed from: X.Aty, reason: case insensitive filesystem */
/* loaded from: Aty.class */
public final class C1825Aty extends C1rs {
    public 1Iw A00;
    public B06 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1825Aty(1Iw r302, B06 b06) {
        super(b06, r302, 0, 0);
        this.A03 = new String[]{"appBarActionButtonEnabled", "colorScheme", "contactRowClickListener", "contentViewManager", "dummySearchBarListener", "fragmentManager", "groupMembersComponentListener", "messengerContactRowMenuHelper", "participantList", "selectedTabIndex", "shouldAddLoadingItem", "shouldAddTitleBar", "threadKey", "upListener"};
        BitSet A18 = 1BK.A18(14);
        this.A02 = A18;
        this.A01 = b06;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        AbM.A1L(this, this.A02, this.A03);
        return this.A01;
    }
}
