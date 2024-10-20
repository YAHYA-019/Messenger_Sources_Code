package X;

import java.util.BitSet;

/* renamed from: X.2ze, reason: invalid class name */
/* loaded from: 2ze.class */
public final class C2ze extends C1rs {
    public 1Iw A00;
    public 2hU A01;
    public final BitSet A02;
    public final String[] A03;

    public C2ze(1Iw r302, 2hU r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"colorScheme"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    public 2hU A2W() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(2Yl r302) {
        this.A01.A04 = r302;
    }

    public void A2Y(2hS r302) {
        this.A01.A08 = r302;
        this.A02.set(0);
    }
}
