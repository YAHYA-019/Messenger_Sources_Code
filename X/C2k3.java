package X;

import java.util.BitSet;

/* renamed from: X.2k3, reason: invalid class name */
/* loaded from: 2k3.class */
public final class C2k3 extends C1rs {
    public 1Iw A00;
    public C2k2 A01;
    public final BitSet A02;
    public final String[] A03;

    public C2k3(1Iw r302, C2k2 c2k2) {
        super(c2k2, r302, 0, 0);
        this.A03 = new String[]{"color"};
        BitSet bitSet = new BitSet(1);
        this.A02 = bitSet;
        this.A01 = c2k2;
        this.A00 = r302;
        bitSet.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ C1rs A0B(float f) {
        this.A01.A00 = f;
        return this;
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C2k2 A2V() {
        C1rs.A05(this.A02, this.A03, 1);
        A0J();
        return this.A01;
    }

    public void A2X(int i) {
        this.A01.A01 = i;
        this.A02.set(0);
    }

    public void A2Y(int i) {
        this.A01.A01 = super.A02.A04(i);
        this.A02.set(0);
    }
}
