package X;

import java.util.BitSet;

/* renamed from: X.Ath, reason: case insensitive filesystem */
/* loaded from: Ath.class */
public final class C1808Ath extends C1rs {
    public 1Iw A00;
    public B0f A01;
    public final BitSet A02;
    public final String[] A03;

    public C1808Ath(1Iw r302, B0f b0f) {
        super(b0f, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "controller", "headerVisible", "initialCurrentPassword", "initialNewPassword", "initialPasswordVisible", "initialRetypedPassword", "initialSaveButtonEnabled", "update"};
        BitSet A18 = 1BK.A18(9);
        this.A02 = A18;
        this.A01 = b0f;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A18(this, this.A02, this.A03);
        return this.A01;
    }
}
