package X;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.53d, reason: invalid class name */
/* loaded from: 53d.class */
public abstract class C53d {
    public static final int[] A01 = {R.attr.state_checked};
    public static final int[] A02 = new int[0];
    public static final Rect A00 = new Rect();

    public static PorterDuff.Mode A00(PorterDuff.Mode mode, int i) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static Rect A01(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return F41.A00(drawable);
        }
        Insets A002 = 7kG.A00(drawable);
        return new Rect(A002.left, A002.top, A002.right, A002.bottom);
    }

    public static void A02(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        drawable.setState((state == null || state.length == 0) ? A01 : A02);
        drawable.setState(state);
    }
}
