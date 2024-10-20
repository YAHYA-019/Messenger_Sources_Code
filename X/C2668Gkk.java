package X;

import java.util.BitSet;

/* renamed from: X.Gkk, reason: case insensitive filesystem */
/* loaded from: Gkk.class */
public final class C2668Gkk extends C1rs {
    public 1Iw A00;
    public C2684Gl2 A01;
    public final BitSet A02;
    public final String[] A03;

    public C2668Gkk(1Iw r302, C2684Gl2 c2684Gl2) {
        super(c2684Gl2, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "iconColor", "onClick", "useIconOnlySendButton"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = c2684Gl2;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A02(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
