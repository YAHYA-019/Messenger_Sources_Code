package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AR0.class */
public final class AR0 extends C00q implements Function1 {
    public final int A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AR0(int i, int i2) {
        super(1);
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A00 = 7zM.A00(obj);
        int i = this.A01;
        int i2 = -this.A00;
        return Integer.valueOf(Math.round((i2 - i) * 9dQ.A00(A00, 1.5f)) + i);
    }
}
