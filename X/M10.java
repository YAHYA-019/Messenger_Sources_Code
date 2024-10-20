package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M10.class */
public final /* synthetic */ class M10 extends 01I implements Function2 {
    public static final M10 A00 = new M10();

    public M10() {
        super(2, 0KF.class, "max", "max(II)I", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(AnonymousClass001.A03(obj), AnonymousClass001.A03(obj2)));
    }
}
