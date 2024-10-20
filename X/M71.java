package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M71.class */
public final class M71 extends C00q implements Function2 {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M71(int i, int i2, Object obj) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        MLv A0N;
        JY7 jy7;
        switch (this.A00) {
            case 0:
                ((9Yw) this.A02).A00(JQz.A0N(obj, obj2), Kv9.A00(this.A01));
                break;
            case 1:
                LCh.A02(JQz.A0N(obj, obj2), (MLj) this.A02, Kv9.A00(this.A01));
                break;
            case 2:
                MLv mLv = (MLv) obj;
                if ((AnonymousClass001.A03(obj2) & 3) != 2 || !mLv.BBC()) {
                    LN9 ln9 = (LN9) this.A02;
                    LNC lnc = ln9.A01;
                    int i = this.A01;
                    KiQ A01 = lnc.A00.A01(i);
                    ((LNE) A01.A02).A02.invoke(ln9.A00, Integer.valueOf(i - A01.A01), mLv, 4YU.A0k());
                    break;
                } else {
                    mLv.D0o();
                    break;
                }
                break;
            case 3:
                KUC.A00(JQz.A0N(obj, obj2), (C0Bd) this.A02, Kv9.A00(this.A01));
                break;
            case 4:
                ((L2I) this.A02).A01(JQz.A0N(obj, obj2), Kv9.A00(this.A01));
                break;
            case 5:
                A0N = JQz.A0N(obj, obj2);
                jy7 = (JY7) this.A02;
                jy7.A04(A0N, Kv9.A00(this.A01));
                break;
            case 6:
                A0N = JQz.A0N(obj, obj2);
                jy7 = (JY7) this.A02;
                jy7.A04(A0N, Kv9.A00(this.A01));
                break;
            case 7:
                KWo.A00(JQz.A0N(obj, obj2), (MRN) this.A02, Kv9.A00(this.A01));
                break;
            case 8:
            case 9:
            default:
                KWq.A00(JQz.A0N(obj, obj2), (MRN) this.A02, Kv9.A00(this.A01));
                break;
            case 10:
                ((LWa) this.A02).A3M(JQz.A0N(obj, obj2), Kv9.A00(this.A01));
                break;
            case 11:
                11T.A0H(obj, obj2);
                C0Bd c0Bd = (C0Bd) this.A02;
                if (c0Bd != null) {
                    c0Bd.invoke(obj, obj2, Integer.valueOf(this.A01));
                    break;
                }
                break;
        }
        return 04S.A00;
    }
}
