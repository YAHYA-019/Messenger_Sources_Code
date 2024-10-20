package X;

import java.util.BitSet;

/* renamed from: X.Aue, reason: case insensitive filesystem */
/* loaded from: Aue.class */
public final class C1841Aue extends C1rs {
    public 1Iw A00;
    public C1997Ayq A01;
    public final BitSet A02;
    public final String[] A03;

    public C1841Aue(1Iw r302, C1997Ayq c1997Ayq) {
        super(c1997Ayq, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "headerButtonText", "headerListener", "headerTitleText", "initGroupName", "isFinishButtonEnabled", "selectedUsers", "textInputListener"};
        BitSet A18 = 1BK.A18(8);
        this.A02 = A18;
        this.A01 = c1997Ayq;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A17(this, this.A02, this.A03);
        return this.A01;
    }
}
