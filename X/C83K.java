package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.83K, reason: invalid class name */
/* loaded from: 83K.class */
public final class C83K extends C00q implements Function1 {
    public final int A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83K(String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                C89h c89h = (C89h) obj;
                11T.A0F(c89h, 0);
                return C89h.A00(c89h.A01, this.A01, c89h.A00);
            case 1:
                7KL r0 = (7KL) obj;
                11T.A0F(r0, 0);
                r0.A00 = this.A01;
                return 04S.A00;
            case 2:
                7KL r02 = (7KL) obj;
                11T.A0F(r02, 0);
                r02.A01 = this.A01;
                return 04S.A00;
            case 3:
                7Sr r03 = (7Sr) obj;
                11T.A0F(r03, 0);
                r03.A02 = this.A01;
                return 04S.A00;
            case 4:
                7Sr r04 = (7Sr) obj;
                11T.A0F(r04, 0);
                r04.A03 = this.A01;
                return 04S.A00;
            default:
                C6yn c6yn = (C6yn) obj;
                11T.A0F(c6yn, 0);
                c6yn.A04 = this.A01;
                return 04S.A00;
        }
    }
}
