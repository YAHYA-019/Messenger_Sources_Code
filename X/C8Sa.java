package X;

import java.util.BitSet;

/* renamed from: X.8Sa, reason: invalid class name */
/* loaded from: 8Sa.class */
public final class C8Sa extends C1rs {
    public 1Iw A00;
    public C8m7 A01;
    public final BitSet A02;
    public final String[] A03;

    public C8Sa(1Iw r302, C8m7 c8m7) {
        super(c8m7, r302, 0, 0);
        this.A03 = new String[]{"glyph"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = c8m7;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2W(int i) {
        this.A01.A03 = super.A02.A00.getDrawable(i);
        this.A02.set(0);
    }
}
