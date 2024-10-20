package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M7s.class */
public final class M7s extends C00q implements Function2 {
    public static final M7s A00 = new M7s();

    public M7s() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        LBT lbt = (LBT) obj2;
        Lj1 lj1 = ((LBT) obj).A05;
        L29 l29 = KdW.A0T;
        Object obj3 = lj1.A02.get(l29);
        if (obj3 == null) {
            obj3 = 7zN.A0f();
        }
        float A002 = 7zM.A00(obj3);
        Object obj4 = lbt.A05.A02.get(l29);
        if (obj4 == null) {
            obj4 = 7zN.A0f();
        }
        return Integer.valueOf(Float.compare(A002, 7zM.A00(obj4)));
    }
}
