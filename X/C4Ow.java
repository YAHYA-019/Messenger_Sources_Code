package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.4Ow, reason: invalid class name */
/* loaded from: 4Ow.class */
public final class C4Ow extends 0TD {
    public final /* synthetic */ 3vE A00;

    public C4Ow(3vE r302) {
        this.A00 = r302;
    }

    public AccessibilityNodeInfoCompat A00(int i) {
        return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(this.A00.A0d(i).A02));
    }

    public AccessibilityNodeInfoCompat A01(int i) {
        3vE r0 = this.A00;
        int i2 = i == 2 ? r0.A00 : r0.A01;
        if (i2 == ((-1) << (-1))) {
            return null;
        }
        return A00(i2);
    }

    public boolean A03(int i, int i2, Bundle bundle) {
        boolean z;
        int i3;
        int i4;
        3vE r0 = this.A00;
        if (i == -1) {
            return r0.A03.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return 3vE.A0H(r0, i);
        }
        if (i2 == 2) {
            return 3vE.A0G(r0, i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                z = r0.A0n(i, i2, bundle);
                return z;
            }
            if (r0.A00 != i) {
                return false;
            }
            r0.A00 = (-1) << (-1);
            r0.A03.invalidate();
            i4 = 65536;
            r0.A0g(i, i4);
            return true;
        }
        AccessibilityManager accessibilityManager = r0.A04;
        z = false;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = r0.A00) != i) {
            int i5 = (-1) << (-1);
            if (i3 != i5) {
                r0.A00 = i5;
                r0.A03.invalidate();
                r0.A0g(i3, 65536);
            }
            r0.A00 = i;
            r0.A03.invalidate();
            i4 = 32768;
            r0.A0g(i, i4);
            return true;
        }
        return z;
    }
}
