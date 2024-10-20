package X;

import java.lang.ref.WeakReference;
import java.util.SortedMap;

/* loaded from: Fzo.class */
public final class Fzo implements Runnable {
    public static final String __redex_internal_original_name = "SadDataOverlayController$showOverlay$1";
    public final /* synthetic */ F9K A00;

    public Fzo(F9K f9k) {
        this.A00 = f9k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QSX qsx;
        F9K f9k = this.A00;
        F9K.A00(f9k);
        WeakReference weakReference = f9k.A00;
        if (weakReference == null || (qsx = (QSX) weakReference.get()) == null) {
            return;
        }
        SortedMap sortedMap = f9k.A06;
        11T.A0F(sortedMap, 0);
        SortedMap sortedMap2 = qsx.A00;
        sortedMap2.clear();
        sortedMap2.putAll(sortedMap);
        QSX.A00(qsx);
    }
}
