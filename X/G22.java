package X;

import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.SortedMap;

/* loaded from: G22.class */
public final class G22 implements Runnable {
    public static final String __redex_internal_original_name = "ConnectionOverlayController$addMetric$1";
    public final /* synthetic */ FFb A00;
    public final /* synthetic */ String A01;

    public G22(FFb fFb, String str) {
        this.A00 = fFb;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E99 e99;
        FFb fFb = this.A00;
        FFb.A00(fFb);
        WeakReference weakReference = fFb.A00;
        if (weakReference == null || (e99 = (E99) weakReference.get()) == null) {
            return;
        }
        String str = this.A01;
        SortedMap sortedMap = e99.A00;
        if (sortedMap.get(str) == null) {
            sortedMap.put(str, "");
            E98 e98 = new E98(4YU.A08(e99));
            LinearLayout.LayoutParams A0M = DKE.A0M();
            A0M.gravity = 8388613;
            e99.addView(e98, A0M);
            E99.A00(e99);
        }
    }
}
