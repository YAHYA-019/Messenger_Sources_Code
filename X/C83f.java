package X;

import java.util.BitSet;

/* renamed from: X.83f, reason: invalid class name */
/* loaded from: 83f.class */
public final class C83f extends C1rs {
    public C2hd A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public C83f(C2hd c2hd, 1Iw r303) {
        super(c2hd, r303, 0, 0);
        this.A03 = new String[]{"orientation"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A00 = c2hd;
        this.A01 = r303;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C2hd A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A00;
    }

    public void A2X(float f) {
        this.A00.A02 = 7zL.A04(this, f);
    }

    public void A2Y(int i) {
        this.A00.A00 = i;
    }

    public void A2Z(int i) {
        this.A00.A01 = i;
        this.A02.set(0);
    }
}
