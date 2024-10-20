package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M75.class */
public final class M75 extends C00q implements Function2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M75(Object obj, int i, Object obj2, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A02 = i;
        this.A03 = obj2;
        this.A01 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        MLv A0N = JQz.A0N(obj, obj2);
        switch (i) {
            case 0:
                ((LN9) this.A04).A3N(A0N, this.A03, this.A02, Kv9.A00(this.A01));
                break;
            case 1:
                L9I.A03(A0N, (MLj) this.A04, (MCJ) this.A03, Kv9.A00(this.A01), this.A02);
                break;
            case 2:
                L9I.A00(A0N, (MLj) this.A04, (Jtj) this.A03, Kv9.A00(this.A01), this.A02);
                break;
            case 3:
                L9I.A01(A0N, (MLj) this.A04, (Jti) this.A03, Kv9.A00(this.A01), this.A02);
                break;
            case 4:
                L9I.A02(A0N, (MLj) this.A04, (Jtk) this.A03, Kv9.A00(this.A01), this.A02);
                break;
            case 5:
                Kvt.A01(A0N, (MLj) this.A03, (MCK) this.A04, Kv9.A00(this.A01), this.A02);
                break;
            case 6:
                Kvt.A00(A0N, (MLj) this.A03, (Jtl) this.A04, Kv9.A00(this.A01), this.A02);
                break;
            case 7:
                Kvu.A00(A0N, (MLj) this.A03, (Jtm) this.A04, Kv9.A00(this.A01), this.A02);
                break;
            default:
                Kvu.A01(A0N, (MLj) this.A03, (MCL) this.A04, Kv9.A00(this.A01), this.A02);
                break;
        }
        return 04S.A00;
    }
}
