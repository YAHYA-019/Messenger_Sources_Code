package X;

import java.util.BitSet;

/* renamed from: X.Aup, reason: case insensitive filesystem */
/* loaded from: Aup.class */
public final class C1852Aup extends C1rs {
    public 1Iw A00;
    public C2015Azc A01;
    public final BitSet A02;
    public final String[] A03;

    public C1852Aup(1Iw r302, C2015Azc c2015Azc) {
        super(c2015Azc, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "defaultSelectedOption", "optionsData", "pauseDialogOptionListener"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = c2015Azc;
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
