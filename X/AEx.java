package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AEx.class */
public final class AEx implements Runnable {
    public static final String __redex_internal_original_name = "MsysBannerDataSource$subscribeBanner$1$1";
    public final /* synthetic */ 6Ky A00;
    public final /* synthetic */ Function1 A01;

    public AEx(6Ky r302, Function1 function1) {
        this.A01 = function1;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.invoke(this.A00);
    }
}
