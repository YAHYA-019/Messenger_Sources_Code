package X;

import android.R;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;

/* renamed from: X.6qs, reason: invalid class name */
/* loaded from: 6qs.class */
public final class C6qs extends StateListDrawable {
    public static final int[] A00 = {R.attr.state_checkable, R.attr.state_checked};
    public static final int[] A03 = {R.attr.state_selected};
    public static final int[] A02 = {R.attr.state_pressed};
    public static final int[] A01 = {R.attr.state_enabled};

    public C6qs(Drawable drawable, Drawable drawable2) {
        if (drawable == null || drawable2 == null) {
            throw 1BL.A0f("Given null ", drawable == null ? "outline" : "filled", " drawable");
        }
        addState(A00, drawable2);
        addState(A03, drawable2);
        addState(A02, drawable2);
        addState(A01, drawable);
        addState(StateSet.NOTHING, drawable);
        setBounds(0, 0, Math.max(drawable2.getIntrinsicWidth(), drawable.getIntrinsicWidth()), Math.max(drawable2.getIntrinsicHeight(), drawable.getIntrinsicHeight()));
    }
}
