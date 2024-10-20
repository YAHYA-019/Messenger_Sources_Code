package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M5d.class */
public final class M5d extends C00q implements Function1 {
    public static final M5d A00 = new M5d();

    public M5d() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A03;
        if (1BK.A1X(obj, false)) {
            A03 = LDp.A05;
        } else {
            11T.A0I(obj, "null cannot be cast to non-null type kotlin.Int");
            A03 = AnonymousClass001.A03(obj) << 32;
        }
        return new LDp(A03);
    }
}
