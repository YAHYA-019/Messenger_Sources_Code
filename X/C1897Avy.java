package X;

import java.util.BitSet;

/* renamed from: X.Avy, reason: case insensitive filesystem */
/* loaded from: Avy.class */
public final class C1897Avy extends C1rs {
    public 1Iw A00;
    public C1986Ayf A01;
    public final BitSet A02;
    public final String[] A03;

    public C1897Avy(1Iw r302, C1986Ayf c1986Ayf) {
        super(c1986Ayf, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "settingsBuilder", "showPendingBanner", "subtitle", "title", "upListener"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = c1986Ayf;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
