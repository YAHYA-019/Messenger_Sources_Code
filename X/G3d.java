package X;

import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.SortedMap;

/* loaded from: G3d.class */
public final class G3d implements Runnable {
    public static final String __redex_internal_original_name = "ConnectionOverlayController$handleMetricValue$1";
    public final /* synthetic */ FFb A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public G3d(FFb fFb, String str, String str2) {
        this.A00 = fFb;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E99 e99;
        FFb fFb = this.A00;
        FFb.A00(fFb);
        String str = this.A01;
        String str2 = this.A02;
        WeakReference weakReference = fFb.A00;
        if (weakReference == null || (e99 = (E99) weakReference.get()) == null) {
            return;
        }
        SortedMap sortedMap = e99.A00;
        if (sortedMap.containsKey(str)) {
            sortedMap.put(str, str2);
            E98 e98 = (E98) e99.findViewWithTag(str);
            if (e98 != null) {
                e98.A00(str2);
                return;
            }
            return;
        }
        sortedMap.put(str, str2);
        E98 e982 = new E98(4YU.A08(e99));
        LinearLayout.LayoutParams A0M = DKE.A0M();
        A0M.gravity = 8388613;
        e99.addView(e982, A0M);
        E99.A00(e99);
    }
}
