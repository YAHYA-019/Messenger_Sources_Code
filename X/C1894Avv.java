package X;

import java.util.BitSet;

/* renamed from: X.Avv, reason: case insensitive filesystem */
/* loaded from: Avv.class */
public final class C1894Avv extends C1rs {
    public 1Iw A00;
    public AzF A01;
    public final BitSet A02;
    public final String[] A03;

    public C1894Avv(1Iw r302, AzF azF) {
        super(azF, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "migIconResolver", "onUpListener", "viewModel"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = azF;
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
