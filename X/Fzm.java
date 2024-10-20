package X;

import java.lang.ref.WeakReference;
import java.util.SortedMap;

/* loaded from: Fzm.class */
public final class Fzm implements Runnable {
    public static final String __redex_internal_original_name = "PerfOverlayController$showOverlayIfNecessary$1";
    public final /* synthetic */ 52V A00;

    public Fzm(52V r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E9A e9a;
        52V r0 = this.A00;
        52V.A00(r0);
        WeakReference weakReference = r0.A00;
        if (weakReference == null || (e9a = (E9A) weakReference.get()) == null) {
            return;
        }
        SortedMap sortedMap = r0.A06;
        11T.A0F(sortedMap, 0);
        SortedMap sortedMap2 = e9a.A00;
        sortedMap2.clear();
        sortedMap2.putAll(sortedMap);
        E9A.A01(e9a);
    }
}
