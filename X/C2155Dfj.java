package X;

import java.util.BitSet;

/* renamed from: X.Dfj, reason: case insensitive filesystem */
/* loaded from: Dfj.class */
public final class C2155Dfj extends AbstractC2178Dg6 {
    public float A00;
    public 3E4 A01;
    public Integer A02;
    public boolean A03;

    public C2155Dfj(1Iw r302) {
        super(r302);
        this.A01 = 3E4.A04;
        this.A02 = 0S2.A0N;
    }

    public static float A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 20.0f;
            case 2:
                return 24.0f;
            case 3:
                return 32.0f;
            case 4:
                return 48.0f;
            case 5:
                return 60.0f;
            case 6:
                return 72.0f;
            default:
                return 16.0f;
        }
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        11T.A0F(ezJ, 0);
        int i = (int) (this.A00 * 100.0f);
        boolean z = this.A03;
        1Iw r0 = this.A04;
        String A0E = z ? r0.A0E(2131956899, AnonymousClass001.A1a(i)) : r0.A0D(2131956900);
        C1rs qb5 = new QB5(new QL1(), r0);
        int A00 = ezJ.A00(this.A01.outline);
        QL1 ql1 = ((QB5) qb5).A00;
        ql1.A01 = A00;
        BitSet bitSet = ((QB5) qb5).A02;
        bitSet.set(1);
        ql1.A02 = ezJ.A00(this.A01.progress);
        bitSet.set(3);
        C1qo c1qo = this.A05;
        ql1.A03 = c1qo.A02(A00(this.A02));
        bitSet.set(4);
        ql1.A04 = c1qo.A02(2.0f);
        bitSet.set(5);
        ql1.A05 = this.A03;
        bitSet.set(0);
        ql1.A00 = this.A00;
        bitSet.set(2);
        qb5.A0l(A00(this.A02));
        qb5.A2Q(true);
        qb5.A2S(A0E);
        qb5.A0z(A00(this.A02));
        return qb5;
    }

    public C2155Dfj A0f(float f) {
        this.A00 = (float) Math.max(0.0d, Math.min(1.0d, f));
        return this;
    }
}
