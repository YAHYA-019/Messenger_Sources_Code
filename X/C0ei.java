package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.0ei, reason: invalid class name */
/* loaded from: 0ei.class */
public final class C0ei extends C00q implements Function2 {
    public static final C0ei A00 = new C0ei();

    public C0ei() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        11T.A0H(str, obj2);
        return str.length() == 0 ? obj2.toString() : AnonymousClass001.A0Z(obj2, ", ", AnonymousClass001.A0n(str));
    }
}
