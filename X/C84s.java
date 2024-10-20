package X;

import java.util.BitSet;

/* renamed from: X.84s, reason: invalid class name */
/* loaded from: 84s.class */
public final class C84s extends C1rs {
    public 1Iw A00;
    public 7F1 A01;
    public final BitSet A02;
    public final String[] A03;

    public C84s(1Iw r302, 7F1 r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"dispatchKeyTrigger", "getTextTrigger", "isExpanded", "replaceTextTrigger", "requestFocusTrigger", "setSelectionTrigger", "setTextTrigger"};
        BitSet A18 = 1BK.A18(7);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public 7F1 A2V() {
        C1rs.A05(this.A02, this.A03, 7);
        7F1 r0 = this.A01;
        C2ko c2ko = r0.A0Z;
        if (c2ko == null) {
            c2ko = 1LI.A0D(r0, this.A00, -18567104);
        }
        r0.A0Z = c2ko;
        C2ko c2ko2 = r0.A0P;
        if (c2ko2 == null) {
            c2ko2 = 1LI.A0D(r0, this.A00, -1835636235);
        }
        r0.A0P = c2ko2;
        A0J();
        return r0;
    }
}
