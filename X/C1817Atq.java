package X;

import java.util.BitSet;

/* renamed from: X.Atq, reason: case insensitive filesystem */
/* loaded from: Atq.class */
public final class C1817Atq extends C1rs {
    public 1Iw A00;
    public B17 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1817Atq(1Iw r302, B17 b17) {
        super(b17, r302, 0, 0);
        this.A03 = new String[]{"model"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = b17;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}