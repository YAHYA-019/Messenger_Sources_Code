package X;

import java.util.BitSet;

/* renamed from: X.Avu, reason: case insensitive filesystem */
/* loaded from: Avu.class */
public final class C1893Avu extends C1rs {
    public 1Iw A00;
    public QK8 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1893Avu(1Iw r302, QK8 qk8) {
        super(qk8, r302, 0, 0);
        this.A03 = new String[]{"clickListener", "colorScheme", "description", "leftButtonLabel", "rightButtonLabel", "title"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = qk8;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
