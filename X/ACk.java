package X;

import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: ACk.class */
public final class ACk implements Runnable {
    public static final String __redex_internal_original_name = "StickerUpdateDebouncer$runnable$1";
    public final /* synthetic */ 9TB A00;

    public ACk(9TB r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        9TB r0 = this.A00;
        HashSet hashSet = r0.A04;
        synchronized (hashSet) {
            List A0V = 0QD.A0V(hashSet);
            if (1BK.A1Y(A0V)) {
                Function1 function1 = r0.A00;
                if (function1 != null) {
                    function1.invoke(A0V);
                }
                hashSet.clear();
            }
            r0.A01 = false;
        }
    }
}
