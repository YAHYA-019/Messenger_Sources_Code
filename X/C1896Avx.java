package X;

import java.util.BitSet;

/* renamed from: X.Avx, reason: case insensitive filesystem */
/* loaded from: Avx.class */
public final class C1896Avx extends C1rs {
    public 1Iw A00;
    public AzJ A01;
    public final BitSet A02;
    public final String[] A03;

    public C1896Avx(1Iw r302, AzJ azJ) {
        super(azJ, r302, 0, 0);
        this.A03 = new String[]{"bottomButtonText", "clickListener", "colorScheme", "description", "title", "topButtonText"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = azJ;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
