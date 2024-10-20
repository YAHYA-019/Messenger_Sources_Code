package X;

import android.view.View;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.SortedMap;

/* loaded from: G3f.class */
public final class G3f implements Runnable {
    public static final String __redex_internal_original_name = "SadDataOverlayController$handleSadData$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ F9K A01;
    public final /* synthetic */ C1dc A02;

    public G3f(F9K f9k, C1dc c1dc, int i) {
        this.A01 = f9k;
        this.A02 = c1dc;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QSX qsx;
        F9K f9k = this.A01;
        F9K.A00(f9k);
        C1dc c1dc = this.A02;
        int i = this.A00;
        WeakReference weakReference = f9k.A00;
        if (weakReference == null || (qsx = (QSX) weakReference.get()) == null) {
            return;
        }
        String str = c1dc.A01;
        11T.A0F(str, 0);
        SortedMap sortedMap = qsx.A00;
        if (sortedMap.containsKey(str)) {
            1BK.A1P(str, sortedMap, i);
            QSV findViewWithTag = qsx.findViewWithTag(str);
            if (findViewWithTag != null) {
                findViewWithTag.A00(i);
                return;
            }
            return;
        }
        1BK.A1P(str, sortedMap, i);
        View qsv = new QSV(4YU.A08(qsx));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        qsx.addView(qsv, layoutParams);
        QSX.A01(qsx);
    }
}
