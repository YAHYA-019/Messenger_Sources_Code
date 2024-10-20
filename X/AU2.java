package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AU2.class */
public final class AU2 extends C00q implements Function1 {
    public static final AU2 A00 = new AU2();

    public AU2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf((AnonymousClass001.A03(obj) + 1) % 8fO.A02.size());
    }
}
