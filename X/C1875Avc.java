package X;

import java.util.BitSet;

/* renamed from: X.Avc, reason: case insensitive filesystem */
/* loaded from: Avc.class */
public final class C1875Avc extends C1rs {
    public 1Iw A00;
    public B0b A01;
    public final BitSet A02;
    public final String[] A03;

    public C1875Avc(1Iw r302, B0b b0b) {
        super(b0b, r302, 0, 0);
        this.A03 = new String[]{"captionComposerEnvironment", "preFillCaptionText"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = b0b;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
