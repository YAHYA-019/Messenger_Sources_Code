package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M58.class */
public final class M58 extends C00q implements Function1 {
    public static final M58 A00 = new M58();

    public M58() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ML3 ml3 = ((AbstractC2938JdR) obj).A08;
        if (ml3 != null) {
            ml3.invalidate();
        }
        return 04S.A00;
    }
}
