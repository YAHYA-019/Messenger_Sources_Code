package X;

import java.util.BitSet;

/* renamed from: X.Atc, reason: case insensitive filesystem */
/* loaded from: Atc.class */
public final class C1803Atc extends C1rs {
    public 1Iw A00;
    public B0M A01;
    public final BitSet A02;
    public final String[] A03;

    public C1803Atc(1Iw r302, B0M b0m) {
        super(b0m, r302, 0, 0);
        this.A03 = new String[]{"accountLoginSSOComponentSpecListener", "fbUserSession", "migColorScheme", "ssoAccountModel"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = b0m;
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
