package X;

import java.util.BitSet;

/* renamed from: X.31g, reason: invalid class name */
/* loaded from: 31g.class */
public final class C31g extends C1rs {
    public 1Iw A00;
    public 7QE A01;
    public final BitSet A02;
    public final String[] A03;

    public C31g(1Iw r302, 7QE r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"badgeColor", "borderColor", "colorScheme", "content", "size"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    public void A2W(1LI r302) {
        this.A01.A04 = r302 == null ? null : r302.A0l();
        this.A02.set(3);
    }
}
