package X;

import java.lang.ref.WeakReference;
import java.util.SortedMap;

/* loaded from: G3e.class */
public final class G3e implements Runnable {
    public static final String __redex_internal_original_name = "PerfOverlayController$handleMetricValue$1";
    public final /* synthetic */ 52V A00;
    public final /* synthetic */ GjM A01;
    public final /* synthetic */ String A02;

    public G3e(52V r302, GjM gjM, String str) {
        this.A00 = r302;
        this.A01 = gjM;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E9A e9a;
        52V r0 = this.A00;
        52V.A00(r0);
        GjM gjM = this.A01;
        String str = this.A02;
        WeakReference weakReference = r0.A00;
        if (weakReference == null || (e9a = (E9A) weakReference.get()) == null) {
            return;
        }
        String str2 = gjM.A03;
        11T.A0F(str2, 0);
        SortedMap sortedMap = e9a.A00;
        if (!sortedMap.containsKey(str2)) {
            E9A.A02(e9a, str2, str);
            return;
        }
        sortedMap.put(str2, str);
        QST findViewWithTag = e9a.findViewWithTag(str2);
        if (findViewWithTag != null) {
            findViewWithTag.A01.setText(str);
        }
    }
}
