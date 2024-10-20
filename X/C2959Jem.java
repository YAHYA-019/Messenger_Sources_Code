package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.Iterator;

/* renamed from: X.Jem, reason: case insensitive filesystem */
/* loaded from: Jem.class */
public final class C2959Jem extends 0Cs {
    public ReboundViewPager A00;
    public final C2956Jej A01;

    public C2959Jem(ReboundViewPager reboundViewPager) {
        this.A00 = reboundViewPager;
        if (reboundViewPager.getImportantForAccessibility() == 0) {
            this.A00.setImportantForAccessibility(1);
        }
        this.A01 = new C2956Jej(this);
    }

    public boolean A0X(View view, int i, Bundle bundle) {
        ReboundViewPager reboundViewPager;
        int i2;
        11T.A0F(view, 0);
        if (i == 4096) {
            reboundViewPager = this.A00;
            if (!reboundViewPager.canScrollHorizontally(1)) {
                return false;
            }
            i2 = reboundViewPager.A05 + 1;
        } else {
            if (i != 8192) {
                return super.A0X(view, i, bundle);
            }
            reboundViewPager = this.A00;
            if (!reboundViewPager.canScrollHorizontally(-1)) {
                return false;
            }
            i2 = reboundViewPager.A05 - 1;
        }
        ReboundViewPager.A08(reboundViewPager, 0.0d, i2, false);
        Iterator it = reboundViewPager.A0m.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return false;
    }

    public boolean A0Y(View view, AccessibilityEvent accessibilityEvent) {
        View view2;
        11T.A0H(view, accessibilityEvent);
        return (accessibilityEvent.getEventType() == 4096 || (view2 = this.A00.A0A) == null) ? ((0Cs) this).A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : view2.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean A0Z(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        7zT.A1S(viewGroup, view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768) {
            viewGroup.postDelayed(new Lm6(viewGroup), 1000L);
        }
        return super.A0Z(viewGroup, view, accessibilityEvent);
    }

    public void A0a(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        11T.A0H(view, accessibilityNodeInfoCompat);
        super.A0a(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.A04(RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
        accessibilityNodeInfoCompat.A04(8192);
    }
}
