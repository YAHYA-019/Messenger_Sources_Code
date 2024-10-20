package X;

import java.util.BitSet;

/* renamed from: X.Avd, reason: case insensitive filesystem */
/* loaded from: Avd.class */
public final class C1876Avd extends C1rs {
    public 1Iw A00;
    public C2010Az7 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1876Avd(1Iw r302, C2010Az7 c2010Az7) {
        super(c2010Az7, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "groupsEnvironment"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = c2010Az7;
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
