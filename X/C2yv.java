package X;

import java.util.BitSet;

/* renamed from: X.2yv, reason: invalid class name */
/* loaded from: 2yv.class */
public final class C2yv extends C1rs {
    public 1Iw A00;
    public 2KF A01;
    public final BitSet A02;
    public final String[] A03;

    public C2yv(1Iw r302, 2KF r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"text", "textColor"};
        BitSet bitSet = new BitSet(2);
        this.A02 = bitSet;
        this.A01 = r303;
        this.A00 = r302;
        bitSet.clear();
    }

    public 2KF A2W() {
        C1rs.A05(this.A02, this.A03, 2);
        A0J();
        return this.A01;
    }

    public void A2X(int i) {
        this.A01.A0B = i;
        this.A02.set(1);
    }

    public void A2Y(CharSequence charSequence) {
        this.A01.A0N = charSequence;
        this.A02.set(0);
    }
}
