package X;

import java.util.BitSet;

/* renamed from: X.Gk9, reason: case insensitive filesystem */
/* loaded from: Gk9.class */
public final class C2655Gk9 extends C1rs {
    public 1Iw A00;
    public Glb A01;
    public final BitSet A02;
    public final String[] A03;

    public C2655Gk9(1Iw r302, Glb glb) {
        super(glb, r302, 0, 0);
        this.A03 = new String[]{"isCurrentlyConfirmingReply", "navigationDelegate"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = glb;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
