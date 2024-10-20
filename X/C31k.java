package X;

import java.util.BitSet;

/* renamed from: X.31k, reason: invalid class name */
/* loaded from: 31k.class */
public final class C31k extends C1rs {
    public 1Iw A00;
    public C03463y4 A01;
    public final BitSet A02;
    public final String[] A03;

    public C31k(1Iw r302, C03463y4 c03463y4) {
        super(c03463y4, r302, 0, 0);
        this.A03 = new String[]{"badgeColor", "badgeText", "borderColor", "colorScheme", "content", "size", "textColor"};
        BitSet A18 = 1BK.A18(7);
        this.A02 = A18;
        this.A01 = c03463y4;
        this.A00 = r302;
        A18.clear();
    }

    public void A2W(1LI r302) {
        this.A01.A02 = r302 == null ? null : r302.A0l();
        this.A02.set(4);
    }
}
