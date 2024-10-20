package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M6d.class */
public final class M6d extends C00q implements Function1 {
    public static final M6d A00 = new M6d();

    public M6d() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        FJC A0f = DKD.A0f(obj);
        M6c m6c = M6c.A00;
        11T.A0F(m6c, 1);
        Object obj2 = A0f.A01;
        return FJC.A02(A0f, obj2 != null ? m6c.invoke(obj2) : null);
    }
}
