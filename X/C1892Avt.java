package X;

import java.util.BitSet;

/* renamed from: X.Avt, reason: case insensitive filesystem */
/* loaded from: Avt.class */
public final class C1892Avt extends C1rs {
    public 1Iw A00;
    public QJ4 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1892Avt(1Iw r302, QJ4 qj4) {
        super(qj4, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "memberList", "title"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = qj4;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
