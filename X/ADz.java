package X;

import kotlin.jvm.functions.Function1;

/* loaded from: ADz.class */
public final class ADz implements Runnable {
    public static final String __redex_internal_original_name = "RpStores$finalizeStore$1$1";
    public final /* synthetic */ String A00;

    public ADz(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9m3 c9m3;
        Function1 function1;
        java.util.Map map = C9lt.A04;
        String str = this.A00;
        5Vt r0 = C9lt.A01;
        5Vt r02 = (5Vt) map.put(str, r0);
        if (11T.A0O(r02, r0)) {
            IDO.A02("RpStores", 0Pz.A0W("Accessing an RpStore after the Call has ended & UI is finished. localCallId=", str));
        }
        if (C9lt.A00.A00) {
            if (r02 == null || (function1 = r02.A00) == null) {
                return;
            }
            function1.invoke(C9eX.A00);
            return;
        }
        if (r02 == null || (c9m3 = r02.A01) == null) {
            return;
        }
        c9m3.A03();
    }
}
