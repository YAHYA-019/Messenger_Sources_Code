package X;

import java.util.BitSet;

/* renamed from: X.8S0, reason: invalid class name */
/* loaded from: 8S0.class */
public final class C8S0 extends C1rs {
    public 1Iw A00;
    public C8lb A01;
    public final BitSet A02;
    public final String[] A03;

    public C8S0(1Iw r302, C8lb c8lb) {
        super(c8lb, r302, 0, 0);
        this.A03 = new String[]{"animatorListener", "colorStrategy", "drawableFactory", "hasViewerReacted", "reactionToAnimate"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = c8lb;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
