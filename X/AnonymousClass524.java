package X;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.524, reason: invalid class name */
/* loaded from: 524.class */
public abstract class AnonymousClass524 {
    public static boolean A00(Context context) {
        AccessibilityManager accessibilityManager;
        if (Boolean.getBoolean("is_accessibility_enabled")) {
            return true;
        }
        if (context == null || (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) == null) {
            return false;
        }
        return accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean A01(Context context, boolean z) {
        return A02(context != null ? (AccessibilityManager) context.getSystemService("accessibility") : null, z);
    }

    public static boolean A02(AccessibilityManager accessibilityManager, boolean z) {
        if (z && Boolean.getBoolean("is_accessibility_enabled")) {
            return true;
        }
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }
}
