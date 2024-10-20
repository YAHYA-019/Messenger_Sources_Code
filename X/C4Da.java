package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.4Da, reason: invalid class name */
/* loaded from: 4Da.class */
public abstract class C4Da {
    public static final boolean A00(Drawable drawable, Drawable drawable2) {
        boolean z = false;
        if (drawable == null) {
            if (drawable2 == null) {
                z = true;
            }
        } else if (drawable2 != null) {
            return ((drawable instanceof 2hW) && (drawable2 instanceof 2hW)) ? ((2hW) drawable).BSD((2hW) drawable2) : drawable.equals(drawable2);
        }
        return z;
    }
}
