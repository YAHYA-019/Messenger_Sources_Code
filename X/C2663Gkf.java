package X;

import java.util.BitSet;

/* renamed from: X.Gkf, reason: case insensitive filesystem */
/* loaded from: Gkf.class */
public final class C2663Gkf extends C1rs {
    public 1Iw A00;
    public GlY A01;
    public final BitSet A02;
    public final String[] A03;

    public C2663Gkf(1Iw r302, GlY glY) {
        super(glY, r302, 0, 0);
        this.A03 = new String[]{"maxTextSize", "secondsRemaining"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = glY;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A00(this.A02, this.A03);
        GlY glY = this.A01;
        glY.A04 = r0;
        C1rn[] c1rnArr = {glY.A02};
        A0J();
        return glY;
    }
}
