package X;

import java.util.BitSet;

/* renamed from: X.Avn, reason: case insensitive filesystem */
/* loaded from: Avn.class */
public final class C1886Avn extends C1rs {
    public 1Iw A00;
    public C7fz A01;
    public final BitSet A02;
    public final String[] A03;

    public C1886Avn(1Iw r302, C7fz c7fz) {
        super(c7fz, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "isBanned", "listener", "userName"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = c7fz;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A02(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
