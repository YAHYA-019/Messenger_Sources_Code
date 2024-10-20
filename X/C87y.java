package X;

import java.util.BitSet;

/* renamed from: X.87y, reason: invalid class name */
/* loaded from: 87y.class */
public final class C87y extends C1rs {
    public 1Iw A00;
    public 7Sk A01;
    public final BitSet A02;
    public final String[] A03;

    public C87y(1Iw r302, 7Sk r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"isActive"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public 7Sk A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(float f) {
        this.A01.A02 = 7zL.A04(this, f);
    }

    public void A2Y(boolean z) {
        this.A01.A05 = z;
        this.A02.set(0);
    }
}
