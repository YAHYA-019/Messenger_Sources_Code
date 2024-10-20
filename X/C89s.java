package X;

import java.util.BitSet;

/* renamed from: X.89s, reason: invalid class name */
/* loaded from: 89s.class */
public final class C89s extends C1rs {
    public 1Iw A00;
    public C89t A01;
    public final BitSet A02;
    public final String[] A03;

    public C89s(1Iw r302, C89t c89t) {
        super(c89t, r302, 0, 0);
        this.A03 = new String[]{"clickListener", "fbUserSession", "item", "renderListener", "theme", "visibilityListener"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = c89t;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
