package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.SortedMap;

/* loaded from: G24.class */
public final class G24 implements Runnable {
    public static final String __redex_internal_original_name = "PerfOverlayController$removePerfMetric$1";
    public final /* synthetic */ 52V A00;
    public final /* synthetic */ GjM A01;

    public G24(52V r302, GjM gjM) {
        this.A00 = r302;
        this.A01 = gjM;
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
        String str = this.A01.A03;
        11T.A0F(str, 0);
        SortedMap sortedMap = e9a.A00;
        if (sortedMap.get(str) != null) {
            sortedMap.remove(str);
            View findViewWithTag = e9a.findViewWithTag(str);
            if (findViewWithTag != null) {
                e9a.removeView(findViewWithTag);
            }
        }
    }
}
