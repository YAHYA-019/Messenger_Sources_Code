package X;

import java.util.BitSet;

/* renamed from: X.86m, reason: invalid class name */
/* loaded from: 86m.class */
public final class C86m extends C1rs {
    public 1Iw A00;
    public C86n A01;
    public final BitSet A02;
    public final String[] A03;

    public C86m(1Iw r302, C86n c86n) {
        super(c86n, r302, 0, 0);
        this.A03 = new String[]{"componentCreator", "delegate", "favoriteStickerFetcher", "favoriteStickerGating", "renderableMessage", "vaultContext"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = c86n;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
