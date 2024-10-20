package X;

import java.util.BitSet;

/* renamed from: X.Gkn, reason: case insensitive filesystem */
/* loaded from: Gkn.class */
public final class C2671Gkn extends C1rs {
    public 1Iw A00;
    public Az6 A01;
    public final BitSet A02;
    public final String[] A03;

    public C2671Gkn(1Iw r302, Az6 az6) {
        super(az6, r302, 0, 0);
        this.A03 = new String[]{"colorScheme"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = az6;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public Az6 A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
