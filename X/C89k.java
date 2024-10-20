package X;

import java.util.BitSet;

/* renamed from: X.89k, reason: invalid class name */
/* loaded from: 89k.class */
public final class C89k extends C1rs {
    public C89j A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public C89k(C89j c89j, 1Iw r303) {
        super(c89j, r303, 0, 0);
        this.A03 = new String[]{"colors"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A00 = c89j;
        this.A01 = r303;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C89j A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A00;
    }

    public void A2X(int[] iArr) {
        this.A00.A02 = iArr;
        this.A02.set(0);
    }
}
