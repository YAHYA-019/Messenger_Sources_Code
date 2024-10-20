package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M0z.class */
public final /* synthetic */ class M0z extends 01I implements Function2 {
    public static final M0z A00 = new M0z();

    public M0z() {
        super(2, 0KF.class, "min", "min(II)I", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(AnonymousClass001.A03(obj), AnonymousClass001.A03(obj2)));
    }
}
