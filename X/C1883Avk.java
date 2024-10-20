package X;

import java.util.BitSet;

/* renamed from: X.Avk, reason: case insensitive filesystem */
/* loaded from: Avk.class */
public final class C1883Avk extends C1rs {
    public 1Iw A00;
    public B03 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1883Avk(1Iw r302, B03 b03) {
        super(b03, r302, 0, 0);
        this.A03 = new String[]{"broadcastFlowEnvironment", "buttonState", "fbUserSession", "model"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = b03;
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
