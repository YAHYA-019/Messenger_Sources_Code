package X;

import java.util.BitSet;

/* renamed from: X.Atk, reason: case insensitive filesystem */
/* loaded from: Atk.class */
public final class C1811Atk extends C1rs {
    public 1Iw A00;
    public B0O A01;
    public final BitSet A02;
    public final String[] A03;

    public C1811Atk(1Iw r302, B0O b0o) {
        super(b0o, r302, 0, 0);
        this.A03 = new String[]{"authIdentifyUserResult", "fbUserSession", "listener", "migColorScheme"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = b0o;
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
