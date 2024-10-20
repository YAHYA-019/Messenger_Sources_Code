package X;

import java.util.BitSet;

/* renamed from: X.Avz, reason: case insensitive filesystem */
/* loaded from: Avz.class */
public final class C1898Avz extends C1rs {
    public 1Iw A00;
    public C2038Azz A01;
    public final BitSet A02;
    public final String[] A03;

    public C1898Avz(1Iw r302, C2038Azz c2038Azz) {
        super(c2038Azz, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "listener", "loadingState", "reachabilitySettingsData", "upListener"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = c2038Azz;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
