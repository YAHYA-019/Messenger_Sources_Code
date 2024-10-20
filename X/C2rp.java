package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.2rp, reason: invalid class name */
/* loaded from: 2rp.class */
public abstract class C2rp {
    public static Integer A00(View view) {
        Integer A00;
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        view.onInitializeAccessibilityNodeInfo(obtain);
        CharSequence className = obtain.getClassName();
        if (className == null) {
            A00 = 0S2.A00;
        } else {
            A00 = Kvb.A00(className.toString());
            Integer num = 0S2.A15;
            if (A00.equals(num) || A00.equals(0S2.A0u)) {
                return obtain.isClickable() ? num : 0S2.A0u;
            }
            if (A00.equals(0S2.A00) && (collectionInfo = obtain.getCollectionInfo()) != null) {
                return (collectionInfo.getRowCount() <= 1 || collectionInfo.getColumnCount() <= 1) ? 0S2.A1G : 0S2.A0j;
            }
        }
        return A00;
    }

    public static void A01(View view) {
        A02(view, 0S2.A01);
    }

    public static void A02(View view, final Integer num) {
        final boolean isLongClickable = view.isLongClickable();
        if (C0Ad.A00(view) != null || num == null) {
            return;
        }
        C0Ad.A0B(view, new 0Cs() { // from class: X.2rq
            public void A0a(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.A0a(view2, accessibilityNodeInfoCompat);
                view2.setLongClickable(isLongClickable);
                C2rp.A04(accessibilityNodeInfoCompat, num);
            }
        });
    }

    public static void A03(AccessibilityNodeInfo accessibilityNodeInfo, Integer num) {
        accessibilityNodeInfo.setClassName(Kvb.A01(num));
        if (num.equals(0S2.A01) || num.equals(0S2.A15)) {
            accessibilityNodeInfo.setClickable(true);
        }
    }

    public static void A04(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Integer num) {
        if (num != null) {
            accessibilityNodeInfoCompat.A07(Kvb.A01(num));
            if (num.equals(0S2.A01) || num.equals(0S2.A15)) {
                accessibilityNodeInfoCompat.A0C(true);
            } else if (num.equals(0S2.A04) || num.equals(0S2.A06)) {
                accessibilityNodeInfoCompat.A0A(true);
            }
        }
    }
}
