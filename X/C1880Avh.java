package X;

import java.util.BitSet;

/* renamed from: X.Avh, reason: case insensitive filesystem */
/* loaded from: Avh.class */
public final class C1880Avh extends C1rs {
    public 1Iw A00;
    public 8oL A01;
    public final BitSet A02;
    public final String[] A03;

    public C1880Avh(1Iw r302, 8oL r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"broadcastFlowEnvironment", "colorScheme", "previewBackgroundColor", "previewModel"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = r303;
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
