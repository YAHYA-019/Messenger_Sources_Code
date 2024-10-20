package X;

import java.util.BitSet;

/* renamed from: X.89w, reason: invalid class name */
/* loaded from: 89w.class */
public final class C89w extends C1rs {
    public 1Iw A00;
    public GRq A01;
    public final BitSet A02;
    public final String[] A03;

    public C89w(1Iw r302, GRq gRq) {
        super(gRq, r302, 0, 0);
        this.A03 = new String[]{"audioMessageContainer", "bubbleViewModel", "clickListener", "fbUserSession", "item", "renderListener", "theme"};
        BitSet A18 = 1BK.A18(7);
        this.A02 = A18;
        this.A01 = gRq;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A16(this, this.A02, this.A03);
        return this.A01;
    }
}
