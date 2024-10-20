package X;

import java.util.BitSet;

/* renamed from: X.Atj, reason: case insensitive filesystem */
/* loaded from: Atj.class */
public final class C1810Atj extends C1rs {
    public 1Iw A00;
    public B0d A01;
    public final BitSet A02;
    public final String[] A03;

    public C1810Atj(1Iw r302, B0d b0d) {
        super(b0d, r302, 0, 0);
        this.A03 = new String[]{"listEventsController", "listItems"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = b0d;
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
