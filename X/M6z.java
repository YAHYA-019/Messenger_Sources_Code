package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M6z.class */
public final class M6z extends C00q implements Function1 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M6z(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static FEV A00(Object obj, int i) {
        return new FEV(new M6z(obj, i));
    }

    public static Object A01(Object obj, M6z m6z) {
        11T.A0F(obj, 0);
        return m6z.A01;
    }

    public static void A02(Object obj, java.util.Map map, int i) {
        map.put("on_log_interaction_event_callback_v2", new FEV(new M6z(obj, i)));
    }

    public static void A03(Object obj, java.util.Map map, int i) {
        map.put("on_log_interaction_event_callback", new FEV(new M6z(obj, i)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0601, code lost:
    
        if (r309 == null) goto L106;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M6z.invoke(java.lang.Object):java.lang.Object");
    }
}
