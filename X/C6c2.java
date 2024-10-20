package X;

import java.util.BitSet;

/* renamed from: X.6c2, reason: invalid class name */
/* loaded from: 6c2.class */
public final class C6c2 extends C1rs {
    public C6c1 A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public C6c2(C6c1 c6c1, 1Iw r303) {
        super(c6c1, r303, 0, 0);
        this.A03 = new String[]{"color", "diameter"};
        BitSet bitSet = new BitSet(2);
        this.A02 = bitSet;
        this.A00 = c6c1;
        this.A01 = r303;
        bitSet.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C6c1 A2V() {
        C1rs.A05(this.A02, this.A03, 2);
        A0J();
        return this.A00;
    }

    public void A2X(float f) {
        this.A00.A01 = super.A02.A02(f);
    }

    public void A2Y(float f) {
        this.A00.A03 = super.A02.A02(f);
        this.A02.set(1);
    }

    public void A2Z(int i) {
        this.A00.A02 = i;
        this.A02.set(0);
    }

    public void A2a(int i) {
        this.A00.A02 = super.A02.A04(i);
        this.A02.set(0);
    }

    public void A2b(int i) {
        this.A00.A03 = super.A02.A06(i);
        this.A02.set(1);
    }
}
