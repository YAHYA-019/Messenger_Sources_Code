package X;

import java.util.BitSet;

/* renamed from: X.893, reason: invalid class name */
/* loaded from: 893.class */
public final class AnonymousClass893 extends C1rs {
    public 1Iw A00;
    public AnonymousClass892 A01;
    public final BitSet A02;
    public final String[] A03;

    public AnonymousClass893(1Iw r302, AnonymousClass892 anonymousClass892) {
        super(anonymousClass892, r302, 0, 0);
        this.A03 = new String[]{"item", "messageStickerListener", "params"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = anonymousClass892;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
