package X;

import java.util.BitSet;

/* renamed from: X.Avl, reason: case insensitive filesystem */
/* loaded from: Avl.class */
public final class C1884Avl extends C1rs {
    public 1Iw A00;
    public AzH A01;
    public final BitSet A02;
    public final String[] A03;

    public C1884Avl(1Iw r302, AzH azH) {
        super(azH, r302, 0, 0);
        this.A03 = new String[]{"callback", "colorScheme", "headerTitle", "inboxUnitThreadItems", "mainTitle", "threadSummary"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = azH;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
