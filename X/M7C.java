package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M7C.class */
public final class M7C extends C00q implements Function2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7C(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2);
        this.A00 = i3;
        this.A05 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A03 = obj4;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                MLv A0N = JQz.A0N(obj, obj2);
                C00m c00m = (C00m) this.A03;
                KUA.A00((Kzz) this.A06, A0N, (MLj) this.A05, c00m, (Function2) this.A04, Kv9.A00(this.A01), this.A02);
                break;
            case 1:
                Kx8.A00(JQz.A0N(obj, obj2), (MBn) this.A05, (Kr9) this.A06, (C00m) this.A04, (Function2) this.A03, Kv9.A00(this.A01), this.A02);
                break;
            case 2:
                MLv A0N2 = JQz.A0N(obj, obj2);
                MCI mci = (MCI) this.A05;
                KWe.A00(A0N2, (MLj) this.A04, (Jt6) this.A03, mci, (C2q1) this.A06, Kv9.A00(this.A01), this.A02);
                break;
            case 3:
                MLv A0N3 = JQz.A0N(obj, obj2);
                MCI mci2 = (MCI) this.A05;
                C2q1 c2q1 = (C2q1) this.A06;
                L60.A00(A0N3, (MLj) this.A04, (Jt6) this.A03, mci2, c2q1, Kv9.A00(this.A01), this.A02);
                break;
            default:
                MLv A0N4 = JQz.A0N(obj, obj2);
                MCK mck = (MCK) this.A05;
                L63.A01(A0N4, (MLj) this.A04, (MCJ) this.A03, mck, (MCL) this.A06, Kv9.A00(this.A01), this.A02);
                break;
        }
        return 04S.A00;
    }
}
