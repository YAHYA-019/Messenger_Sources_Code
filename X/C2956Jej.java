package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.WeakHashMap;

/* renamed from: X.Jej, reason: case insensitive filesystem */
/* loaded from: Jej.class */
public final class C2956Jej extends 0Cs {
    public final java.util.Map A00 = new WeakHashMap();
    public final C2959Jem A01;

    public C2956Jej(C2959Jem c2959Jem) {
        this.A01 = c2959Jem;
    }

    public void A0a(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        View A0H;
        11T.A0H(view, accessibilityNodeInfoCompat);
        ReboundViewPager reboundViewPager = this.A01.A00;
        Ktb ktb = (Ktb) reboundViewPager.A0l.get(view);
        if (ktb != null && (i = ktb.A00) > 0 && (A0H = reboundViewPager.A0H(i - 1)) != null) {
            accessibilityNodeInfoCompat.A02.setTraversalAfter(A0H);
        }
        0Cs r0 = (0Cs) this.A00.get(view);
        if (r0 != null) {
            r0.A0a(view, accessibilityNodeInfoCompat);
        } else {
            super.A0a(view, accessibilityNodeInfoCompat);
        }
    }
}
