package X;

import java.util.BitSet;

/* renamed from: X.Aca, reason: case insensitive filesystem */
/* loaded from: Aca.class */
public final class C1272Aca extends C1rs {
    public 1Iw A00;
    public 7WT A01;
    public final BitSet A02;
    public final String[] A03;

    public C1272Aca(1Iw r302, 7WT r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "item", "listener", "reactions", "theme", "threadCapabilities"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
