package X;

import java.util.BitSet;

/* renamed from: X.Ava, reason: case insensitive filesystem */
/* loaded from: Ava.class */
public final class C1873Ava extends C1rs {
    public 1Iw A00;
    public C2036Azx A01;
    public final BitSet A02;
    public final String[] A03;

    public C1873Ava(1Iw r302, C2036Azx c2036Azx) {
        super(c2036Azx, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "text"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = c2036Azx;
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