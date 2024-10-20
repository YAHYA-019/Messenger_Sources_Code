package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M6b.class */
public final class M6b extends C00q implements Function1 {
    public static final M6b A00 = new M6b();

    public M6b() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        FJC A0f = DKD.A0f(obj);
        M6a m6a = M6a.A00;
        11T.A0F(m6a, 1);
        Object obj2 = A0f.A01;
        return FJC.A02(A0f, obj2 != null ? m6a.invoke(obj2) : null);
    }
}
