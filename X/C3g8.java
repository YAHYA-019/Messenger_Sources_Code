package X;

/* renamed from: X.3g8, reason: invalid class name */
/* loaded from: 3g8.class */
public final /* synthetic */ class C3g8 implements Runnable {
    public static final String __redex_internal_original_name = "NavigationLoggerV2Api$$ExternalSyntheticLambda4";
    public final /* synthetic */ 2Kv A00;
    public final /* synthetic */ java.util.Map A01;

    public /* synthetic */ C3g8(2Kv r302, java.util.Map map) {
        this.A00 = r302;
        this.A01 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2Kv r0 = this.A00;
        java.util.Map map = this.A01;
        2jL r02 = ((2jK) r0.A00.get()).A01;
        java.util.Map map2 = r02.A06;
        if (map2 == null) {
            map2 = AnonymousClass001.A0u();
            r02.A06 = map2;
        }
        map2.putAll(map);
    }
}
