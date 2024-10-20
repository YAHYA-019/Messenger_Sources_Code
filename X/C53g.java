package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.facebook.acra.constants.ActionId;

/* renamed from: X.53g, reason: invalid class name */
/* loaded from: 53g.class */
public abstract class C53g {
    public static final ThreadLocal A00 = new ThreadLocal();
    public static final int[] A02 = {-16842910};
    public static final int[] A04 = {R.attr.state_focused};
    public static final int[] A05 = {R.attr.state_pressed};
    public static final int[] A01 = {R.attr.state_checked};
    public static final int[] A03 = new int[0];
    public static final int[] A06 = new int[1];

    public static int A00(Context context, int i) {
        ColorStateList A022 = A02(context, i);
        if (A022 != null && A022.isStateful()) {
            return A022.getColorForState(A02, A022.getDefaultColor());
        }
        ThreadLocal threadLocal = A00;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return 1tG.A05(A01(context, i), Math.round(Color.alpha(r0) * f));
    }

    public static int A01(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList A02(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        53Z r0 = new 53Z(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return r0.A00(0);
        } finally {
            r0.A02.recycle();
        }
    }

    public static void A03(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(53Y.A09);
        try {
            if (!obtainStyledAttributes.hasValue(ActionId.RTMP_CONNECTION_CONNECTED)) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("View ");
                A0k.append(view.getClass());
                android.util.Log.e("ThemeUtils", AnonymousClass001.A0d(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).", A0k));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
