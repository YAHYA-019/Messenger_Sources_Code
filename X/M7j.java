package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M7j.class */
public final class M7j extends C00q implements Function2 {
    public static final M7j A00 = new M7j();

    public M7j() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        return str.length() == 0 ? obj2.toString() : AnonymousClass001.A0Z(obj2, ", ", AnonymousClass001.A0n(str));
    }
}
