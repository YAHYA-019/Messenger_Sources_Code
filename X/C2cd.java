package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayDeque;

/* renamed from: X.2cd, reason: invalid class name */
/* loaded from: 2cd.class */
public abstract class C2cd {
    public static View A00(View view) {
        ArrayDeque arrayDeque = new ArrayDeque();
        do {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                while (true) {
                    childCount--;
                    if (childCount < 0) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt != null) {
                        arrayDeque.addFirst(childAt);
                    }
                }
            }
            if (arrayDeque.isEmpty()) {
                return null;
            }
            view = (View) arrayDeque.removeFirst();
        } while (!A08(view));
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
    
        if (r0 > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.View A01(android.view.View r301) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2cd.A01(android.view.View):android.view.View");
    }

    public static void A02(View view) {
        if (view == null || !AnonymousClass524.A00(view.getContext())) {
            return;
        }
        view.sendAccessibilityEvent(4194304);
        try {
            view.performAccessibilityAction(64, null);
        } catch (NullPointerException unused) {
        }
    }

    public static void A03(View view, int i) {
        if (AnonymousClass524.A01(view.getContext(), true)) {
            view.setImportantForAccessibility(i);
        }
    }

    public static void A04(final View view, long j) {
        if (view != null) {
            if (j < 500) {
                j = 500;
            }
            view.postDelayed(new Runnable() { // from class: X.3ed
                public static final String __redex_internal_original_name = "ViewAccessibilityHelper$2";

                @Override // java.lang.Runnable
                public void run() {
                    C2cd.A02(view);
                }
            }, j);
        }
    }

    public static void A05(View view, CharSequence charSequence) {
        ViewParent parent;
        if (!AnonymousClass524.A01(view.getContext(), false) || (parent = view.getParent()) == null) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        view.onInitializeAccessibilityEvent(obtain);
        if (charSequence != null) {
            obtain.getText().add(charSequence);
            obtain.setContentDescription(null);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }

    public static void A06(View view, final String str) {
        C0Ad.A0B(view, new 0Cs() { // from class: X.339
            public void A0a(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.A0a(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.A05(new 0Oe(16, str));
            }
        });
    }

    public static void A07(CharSequence charSequence, StringBuilder sb, boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (z && !TextUtils.isEmpty(sb)) {
            sb.append(',');
            sb.append(' ');
        }
        sb.append(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A08(android.view.View r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L14
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            r302 = r0
            r0 = r301
            r1 = r302
            r0.onInitializeAccessibilityNodeInfo(r1)     // Catch: java.lang.NullPointerException -> L13
            r0 = r302
            boolean r0 = r0.isAccessibilityFocused()     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            throw r0
        L13:
        L14:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2cd.A08(android.view.View):boolean");
    }
}
