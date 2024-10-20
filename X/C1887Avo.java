package X;

import java.util.BitSet;

/* renamed from: X.Avo, reason: case insensitive filesystem */
/* loaded from: Avo.class */
public final class C1887Avo extends C1rs {
    public 1Iw A00;
    public AzN A01;
    public final BitSet A02;
    public final String[] A03;

    public C1887Avo(1Iw r302, AzN azN) {
        super(azN, r302, 0, 0);
        this.A03 = new String[]{"adminTextDescription", "adminTextTitle", "colorScheme", "listener", "primaryButtonTitleResId"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = azN;
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
