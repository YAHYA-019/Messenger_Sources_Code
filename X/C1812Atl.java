package X;

import java.util.BitSet;

/* renamed from: X.Atl, reason: case insensitive filesystem */
/* loaded from: Atl.class */
public final class C1812Atl extends C1rs {
    public 1Iw A00;
    public AyS A01;
    public final BitSet A02;
    public final String[] A03;

    public C1812Atl(1Iw r302, AyS ayS) {
        super(ayS, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "darkModePreferenceString", "listener"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = ayS;
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
