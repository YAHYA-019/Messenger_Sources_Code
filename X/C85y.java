package X;

import java.util.BitSet;
import java.util.List;

/* renamed from: X.85y, reason: invalid class name */
/* loaded from: 85y.class */
public final class C85y extends C1rs {
    public 1Iw A00;
    public C85x A01;
    public final BitSet A02;
    public final String[] A03;

    public C85y(1Iw r302, C85x c85x) {
        super(c85x, r302, 0, 0);
        this.A03 = new String[]{"items"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = c85x;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C85x A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(float f) {
        this.A01.A00 = 7zL.A04(this, f);
    }

    public void A2Y(float f) {
        this.A01.A01 = 7zL.A04(this, f);
    }

    public void A2Z(float f) {
        this.A01.A02 = 7zL.A04(this, f);
    }

    public void A2a(List list) {
        this.A01.A04 = list;
        this.A02.set(0);
    }
}
