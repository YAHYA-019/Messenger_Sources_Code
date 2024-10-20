package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: X.2co, reason: invalid class name */
/* loaded from: 2co.class */
public abstract class C2co {
    public static RippleDrawable A00(Drawable drawable, Drawable drawable2, int i) {
        return new RippleDrawable(new ColorStateList(C2cn.A03, new int[]{i}), drawable, drawable2);
    }
}
