package X;

import kotlin.jvm.functions.Function1;

/* loaded from: GBr.class */
public final class GBr extends C00q implements Function1 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBr(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static Object A00(Object obj, GBr gBr) {
        11T.A0F(obj, 0);
        return gBr.A01;
    }

    public static GBr A01(Object obj, int i) {
        return new GBr(obj, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x088b, code lost:
    
        if (r306 != null) goto L116;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBr.invoke(java.lang.Object):java.lang.Object");
    }
}
