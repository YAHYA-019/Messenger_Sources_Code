package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.NestedScrollView;

/* renamed from: X.Jel, reason: case insensitive filesystem */
/* loaded from: Jel.class */
public final class C2958Jel extends 0Cs {
    public void A0U(View view, AccessibilityEvent accessibilityEvent) {
        super.A0U(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(AnonymousClass001.A1P(nestedScrollView.A0E()));
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.A0E());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0X(android.view.View r302, int r303, android.os.Bundle r304) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2958Jel.A0X(android.view.View, int, android.os.Bundle):boolean");
    }

    public void A0a(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int A0E;
        super.A0a(view, accessibilityNodeInfoCompat);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfoCompat.A07(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (A0E = nestedScrollView.A0E()) <= 0) {
            return;
        }
        accessibilityNodeInfoCompat.A02.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            accessibilityNodeInfoCompat.A05(0Oe.A0X);
            accessibilityNodeInfoCompat.A05(0Oe.A0e);
        }
        if (nestedScrollView.getScrollY() < A0E) {
            accessibilityNodeInfoCompat.A05(0Oe.A0Z);
            accessibilityNodeInfoCompat.A05(0Oe.A0Y);
        }
    }
}
