package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AR1.class */
public final class AR1 extends C00q implements Function1 {
    public final int A00;
    public final boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AR1(boolean z, int i) {
        super(1);
        this.A00 = i;
        this.A01 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 2:
                JNi jNi = (JNi) obj;
                11T.A0F(jNi, 0);
                jNi.BkD(this.A01);
                break;
            case 3:
                JNi jNi2 = (JNi) obj;
                11T.A0F(jNi2, 0);
                jNi2.C3c(this.A01);
                break;
            case 4:
                JNi jNi3 = (JNi) obj;
                11T.A0F(jNi3, 0);
                jNi3.C3e(this.A01);
                break;
            case 5:
                F5R f5r = (F5R) obj;
                11T.A0F(f5r, 0);
                f5r.A01.A0a(f5r.A00, f5r.A02);
                f5r.A02.A0A(true);
                f5r.A02.A0B(this.A01);
                break;
            case 6:
                93P r0 = (93P) obj;
                11T.A0F(r0, 0);
                r0.A00 = this.A01;
                break;
            case 7:
                C6ym c6ym = (C6ym) obj;
                11T.A0F(c6ym, 0);
                c6ym.A00 = this.A01;
                break;
            case 8:
                93R r02 = (93R) obj;
                11T.A0F(r02, 0);
                r02.A02 = this.A01;
                break;
            case 9:
                C6yn c6yn = (C6yn) obj;
                11T.A0F(c6yn, 0);
                c6yn.A06 = this.A01;
                break;
            default:
                return Boolean.valueOf(this.A01);
        }
        return 04S.A00;
    }
}
