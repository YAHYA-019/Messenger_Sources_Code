package X;

import java.util.BitSet;

/* renamed from: X.88a, reason: invalid class name */
/* loaded from: 88a.class */
public final class C88a extends C1rs {
    public 1Iw A00;
    public C5qn A01;
    public final BitSet A02;
    public final String[] A03;

    public C88a(1Iw r302, C5qn c5qn) {
        super(c5qn, r302, 0, 0);
        this.A03 = new String[]{"progressBarSize", "rowHeight"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = c5qn;
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
