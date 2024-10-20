package X;

import java.util.BitSet;

/* renamed from: X.85d, reason: invalid class name */
/* loaded from: 85d.class */
public final class C85d extends C1rs {
    public 1Iw A00;
    public 7Gw A01;
    public final BitSet A02;
    public final String[] A03;

    public C85d(1Iw r302, 7Gw r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"corners", "renderedMessage"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public 7Gw A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(1LI r302) {
        this.A01.A00 = 7zQ.A0T(r302);
        this.A02.set(1);
    }

    public void A2Y(float[] fArr) {
        this.A01.A01 = fArr;
        this.A02.set(0);
    }
}
