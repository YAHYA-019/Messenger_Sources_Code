package X;

import java.util.BitSet;

/* renamed from: X.846, reason: invalid class name */
/* loaded from: 846.class */
public final class AnonymousClass846 extends C1rs {
    public 1Iw A00;
    public C6uf A01;
    public final BitSet A02;
    public final String[] A03;

    public AnonymousClass846(1Iw r302, C6uf c6uf) {
        super(c6uf, r302, 0, 0);
        this.A03 = new String[]{"capabilities", "colorScheme", "fbUserSession", "fragmentManager", "metadata", "otherThreadParticipants", "otherUserId", "otherUserShortName", "shouldCenterTitle", "threadKey", "threadTileViewData", "threadViewSource", "tintColor", "titleBarButtonListener", "upButtonConfig", "upListener"};
        BitSet A18 = 1BK.A18(16);
        this.A02 = A18;
        this.A01 = c6uf;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 16);
        A0J();
        return this.A01;
    }
}
