package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.82w, reason: invalid class name */
/* loaded from: 82w.class */
public final class C82w extends C00q implements Function1 {
    public final int A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82w(int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A01 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                7Gc r0 = (7Gc) obj;
                11T.A0F(r0, 0);
                r0.A00 = this.A01;
                break;
            case 1:
                7Gb r02 = (7Gb) obj;
                11T.A0F(r02, 0);
                r02.A00 = this.A01;
                break;
            case 2:
                7Sr r03 = (7Sr) obj;
                11T.A0F(r03, 0);
                r03.A00 = this.A01;
                break;
            case 3:
                C6yn c6yn = (C6yn) obj;
                11T.A0F(c6yn, 0);
                c6yn.A00 = this.A01;
                break;
            case 4:
                C6yn c6yn2 = (C6yn) obj;
                11T.A0F(c6yn2, 0);
                c6yn2.A01 = this.A01;
                break;
            case 5:
                C6yn c6yn3 = (C6yn) obj;
                11T.A0F(c6yn3, 0);
                c6yn3.A02 = this.A01;
                break;
            case 6:
                C6yn c6yn4 = (C6yn) obj;
                11T.A0F(c6yn4, 0);
                c6yn4.A03 = this.A01;
                break;
            default:
                boolean z = false;
                if (((Number) obj).intValue() > this.A01) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
        return 04S.A00;
    }
}
