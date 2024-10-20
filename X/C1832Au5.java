package X;

import java.util.BitSet;

/* renamed from: X.Au5, reason: case insensitive filesystem */
/* loaded from: Au5.class */
public final class C1832Au5 extends C1rs {
    public 1Iw A00;
    public AyU A01;
    public final BitSet A02;
    public final String[] A03;

    public C1832Au5(1Iw r302, AyU ayU) {
        super(ayU, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "nicknamesList"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = ayU;
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
