package X;

import java.util.BitSet;

/* renamed from: X.Atd, reason: case insensitive filesystem */
/* loaded from: Atd.class */
public final class C1804Atd extends C1rs {
    public 1Iw A00;
    public B0N A01;
    public final BitSet A02;
    public final String[] A03;

    public C1804Atd(1Iw r302, B0N b0n) {
        super(b0n, r302, 0, 0);
        this.A03 = new String[]{"authCredentialCheckResult", "fbUserSession", "listener", "migColorScheme"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = b0n;
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
