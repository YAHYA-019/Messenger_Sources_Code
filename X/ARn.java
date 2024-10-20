package X;

import kotlin.jvm.functions.Function1;

/* loaded from: ARn.class */
public final class ARn extends C00q implements Function1 {
    public static final ARn A00 = new ARn();

    public ARn() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(obj.hashCode());
    }
}
