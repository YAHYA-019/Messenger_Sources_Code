package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M89.class */
public final class M89 extends C00q implements Function2 {
    public static final M89 A00 = new M89();

    public M89() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }
}
