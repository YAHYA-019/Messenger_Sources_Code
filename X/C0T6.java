package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0T6, reason: invalid class name */
/* loaded from: 0T6.class */
public abstract class C0T6 {
    public static CharSequence A00(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void A01(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
