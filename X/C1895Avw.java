package X;

import java.util.BitSet;

/* renamed from: X.Avw, reason: case insensitive filesystem */
/* loaded from: Avw.class */
public final class C1895Avw extends C1rs {
    public 1Iw A00;
    public C1990Ayj A01;
    public final BitSet A02;
    public final String[] A03;

    public C1895Avw(1Iw r302, C1990Ayj c1990Ayj) {
        super(c1990Ayj, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "onUpListener", "title"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = c1990Ayj;
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
