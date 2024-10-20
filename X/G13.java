package X;

import android.util.ArrayMap;
import java.util.Iterator;

/* loaded from: G13.class */
public final class G13 implements Runnable {
    public static final String __redex_internal_original_name = "VideoPrefetchFb4aMarkerStateHelper$disableLogger$1";
    public final /* synthetic */ 6Co A00;

    public G13(6Co r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Co r0 = this.A00;
        try {
            r0.A01.markerEnd(1906462, (short) 524);
        } catch (IllegalStateException unused) {
        }
        r0.A03.clear();
        java.util.Map map = r0.A02;
        Iterator A1A = 1BK.A1A(map);
        while (A1A.hasNext()) {
            ((ArrayMap) A1A.next()).clear();
        }
        map.clear();
    }
}
