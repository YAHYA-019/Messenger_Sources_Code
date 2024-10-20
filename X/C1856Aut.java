package X;

import java.util.BitSet;

/* renamed from: X.Aut, reason: case insensitive filesystem */
/* loaded from: Aut.class */
public final class C1856Aut extends C1rs {
    public 1Iw A00;
    public AyW A01;
    public final BitSet A02;
    public final String[] A03;

    public C1856Aut(1Iw r302, AyW ayW) {
        super(ayW, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "title"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = ayW;
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
