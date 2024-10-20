package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M4a.class */
public final class M4a extends C00q implements Function1 {
    public static final M4a A00 = new M4a();

    public M4a() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.Jae, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j = ((LCr) obj).A00;
        float A01 = LCr.A01(j);
        float A002 = LCr.A00(j);
        ?? obj2 = new Object();
        obj2.A00 = A01;
        obj2.A01 = A002;
        return obj2;
    }
}
