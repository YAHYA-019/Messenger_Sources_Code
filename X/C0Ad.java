package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.0Ad, reason: invalid class name */
/* loaded from: 0Ad.class */
public abstract class C0Ad {
    public static Field A00;
    public static boolean A01;
    public static WeakHashMap A02;
    public static final C0Af A03;
    public static final int[] A04;
    public static final C0Ag A05;

    static {
        int[] iArr = new int[32];
        System.arraycopy(new int[]{2131361814, 2131361815, 2131361826, 2131361837, 2131361840, 2131361841, 2131361842, 2131361843, 2131361844, 2131361845, 2131361816, 2131361817, 2131361818, 2131361819, 2131361820, 2131361821, 2131361822, 2131361823, 2131361824, 2131361825, 2131361827, 2131361828, 2131361829, 2131361830, 2131361831, 2131361832, 2131361833}, 0, iArr, 0, 27);
        System.arraycopy(new int[]{2131361834, 2131361835, 2131361836, 2131361838, 2131361839}, 0, iArr, 27, 5);
        A04 = iArr;
        A03 = new C0Af() { // from class: X.0Ae
            @Override // X.C0Af
            public final 0Rg CFf(0Rg r302) {
                return r302;
            }
        };
        A05 = new C0Ag();
    }

    public static View.AccessibilityDelegate A00(View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityDelegate = C0Ah.A00(view);
        } else {
            accessibilityDelegate = null;
            if (!A01) {
                if (A00 == null) {
                    try {
                        Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                        A00 = declaredField;
                        declaredField.setAccessible(true);
                    } catch (Throwable unused) {
                        A01 = true;
                        return null;
                    }
                }
                Object obj = A00.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
            }
        }
        return accessibilityDelegate;
    }

    public static 0Cs A01(View view) {
        0Ct A002 = A00(view);
        if (A002 == null) {
            return null;
        }
        return A002 instanceof 0Ct ? A002.A00 : new 0Cs(A002);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static 0Rg A02(View view, 0Rg r302) {
        if (android.util.Log.isLoggable("ViewCompat", 3)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("performReceiveContent: ");
            A0k.append(r302);
            A0k.append(", view=");
            A0k.append(AnonymousClass001.A0X(view));
            A0k.append("[");
            A0k.append(view.getId());
            android.util.Log.d("ViewCompat", AnonymousClass001.A0d("]", A0k));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return 0SU.A00(view, r302);
        }
        0SF r0 = (0SF) view.getTag(2131367850);
        if (r0 != null) {
            r302 = r0.CFe(view, r302);
            if (r302 == null) {
                return null;
            }
        }
        return (view instanceof C0Af ? (C0Af) view : A03).CFf(r302);
    }

    public static 0Sk A03(View view) {
        WeakHashMap weakHashMap = A02;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            A02 = weakHashMap;
        }
        0Sk r303 = (0Sk) weakHashMap.get(view);
        if (r303 == null) {
            r303 = new 0Sk(view);
            A02.put(view, r303);
        }
        return r303;
    }

    public static 08D A04(View view, 08D r302) {
        WindowInsets A042 = r302.A04();
        if (A042 != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(A042);
            if (!dispatchApplyWindowInsets.equals(A042)) {
                return 08D.A01(view, dispatchApplyWindowInsets);
            }
        }
        return r302;
    }

    public static 08D A05(View view, 08D r302) {
        WindowInsets A042 = r302.A04();
        if (A042 != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(A042);
            if (!onApplyWindowInsets.equals(A042)) {
                return 08D.A01(view, onApplyWindowInsets);
            }
        }
        return r302;
    }

    public static C0T2 A06(View view) {
        C0T2 c0t2;
        if (Build.VERSION.SDK_INT >= 30) {
            c0t2 = 0ST.A00(view);
        } else {
            Context context = view.getContext();
            while (true) {
                Context context2 = context;
                c0t2 = null;
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
                if (context2 instanceof Activity) {
                    Window window = ((Activity) context2).getWindow();
                    if (window != null) {
                        return new C0T2(view, window);
                    }
                } else {
                    context = ((ContextWrapper) context2).getBaseContext();
                }
            }
        }
        return c0t2;
    }

    public static void A07(Context context, TypedArray typedArray, AttributeSet attributeSet, View view, int[] iArr, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0Ah.A01(context, typedArray, attributeSet, view, iArr, i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (r301.getWindowVisibility() != 0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A08(android.view.View r301, int r302) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Ad.A08(android.view.View, int):void");
    }

    public static void A09(View view, int i) {
        A0A(view, i);
        A08(view, 0);
    }

    public static void A0A(View view, int i) {
        AbstractList abstractList = (AbstractList) view.getTag(2131367839);
        if (abstractList == null) {
            abstractList = new ArrayList();
            view.setTag(2131367839, abstractList);
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= abstractList.size()) {
                return;
            }
            if (((AccessibilityNodeInfo.AccessibilityAction) ((0Oe) abstractList.get(i3)).A03).getId() == i) {
                abstractList.remove(i3);
                return;
            }
            i2 = i3 + 1;
        }
    }

    public static void A0B(View view, 0Cs r302) {
        if (r302 == null && (A00(view) instanceof 0Ct)) {
            r302 = new 0Cs();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(r302 == null ? null : r302.A00);
    }

    public static void A0C(View view, 0SF r302, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 31) {
            0SU.A01(view, r302, strArr);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        0RZ.A05(AnonymousClass001.A1T(strArr), "When the listener is set, MIME types must also be set");
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                if (strArr[i2].startsWith("*")) {
                    z = true;
                    break;
                }
                i = i2 + 1;
            }
            0RZ.A05(!z, 0Pz.A0W("A MIME type set here must not start with *: ", Arrays.toString(strArr)));
        }
        view.setTag(2131367851, strArr);
        view.setTag(2131367850, r302);
    }

    public static void A0D(View view, 0Oe r302) {
        0Cs A012 = A01(view);
        if (A012 == null) {
            A012 = new 0Cs();
        }
        A0B(view, A012);
        A0A(view, ((AccessibilityNodeInfo.AccessibilityAction) r302.A03).getId());
        AbstractCollection abstractCollection = (AbstractCollection) view.getTag(2131367839);
        if (abstractCollection == null) {
            abstractCollection = new ArrayList();
            view.setTag(2131367839, abstractCollection);
        }
        abstractCollection.add(r302);
        A08(view, 0);
    }

    public static void A0E(View view, 0Oe r302, 0PO r303, CharSequence charSequence) {
        if (r303 == null && charSequence == null) {
            A09(view, ((AccessibilityNodeInfo.AccessibilityAction) r302.A03).getId());
        } else {
            A0D(view, new 0Oe(r303, charSequence, r302.A02, (Object) null, r302.A00));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r301.getWindowVisibility() != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0F(android.view.View r301, java.lang.CharSequence r302) {
        /*
            r0 = 1
            r303 = r0
            X.0uK r0 = new X.0uK
            r304 = r0
            r0 = r304
            r1 = r303
            r0.<init>(r1)
            r0 = r304
            r1 = r301
            r2 = r302
            r0.A01(r1, r2)
            X.0Ag r0 = X.C0Ad.A05
            r305 = r0
            r0 = r302
            if (r0 == 0) goto L68
            r0 = r305
            java.util.WeakHashMap r0 = r0.A00
            r306 = r0
            r0 = r301
            boolean r0 = r0.isShown()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L38
            r0 = r301
            int r0 = r0.getWindowVisibility()
            r303 = r0
            r0 = 1
            r307 = r0
            r0 = r303
            if (r0 == 0) goto L3d
        L38:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
        L3d:
            r0 = r307
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r304 = r0
            r0 = r306
            r1 = r301
            r2 = r304
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r301
            r1 = r305
            r0.addOnAttachStateChangeListener(r1)
            r0 = r301
            boolean r0 = r0.isAttachedToWindow()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L67
            r0 = r301
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r304 = r0
            r0 = r304
            r1 = r305
            r0.addOnGlobalLayoutListener(r1)
        L67:
            return
        L68:
            r0 = r305
            java.util.WeakHashMap r0 = r0.A00
            r1 = r301
            java.lang.Object r0 = r0.remove(r1)
            r0 = r301
            r1 = r305
            r0.removeOnAttachStateChangeListener(r1)
            r0 = r301
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r1 = r305
            r0.removeOnGlobalLayoutListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Ad.A0F(android.view.View, java.lang.CharSequence):void");
    }

    public static void A0G(View view, List list) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0Ah.A02(view, list);
        }
    }

    public static void A0H(View view, boolean z) {
        new 0uK(3).A01(view, Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r0.booleanValue() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0I(android.view.View r301) {
        /*
            r0 = 3
            r302 = r0
            X.0uK r0 = new X.0uK
            r303 = r0
            r0 = r303
            r1 = r302
            r0.<init>(r1)
            r0 = r303
            r1 = r301
            java.lang.Object r0 = r0.A00(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L23
            r0 = r303
            boolean r0 = r0.booleanValue()
            r302 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            if (r0 != 0) goto L27
        L23:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L27:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Ad.A0I(android.view.View):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r0.booleanValue() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0J(android.view.View r301) {
        /*
            r0 = 0
            r302 = r0
            X.0uK r0 = new X.0uK
            r303 = r0
            r0 = r303
            r1 = 0
            r0.<init>(r1)
            r0 = r303
            r1 = r301
            java.lang.Object r0 = r0.A00(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L23
            r0 = r303
            boolean r0 = r0.booleanValue()
            r302 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            if (r0 != 0) goto L27
        L23:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L27:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Ad.A0J(android.view.View):boolean");
    }

    public static String[] A0K(View view) {
        return Build.VERSION.SDK_INT >= 31 ? 0SU.A02(view) : (String[]) view.getTag(2131367851);
    }
}
