package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.58v, reason: invalid class name */
/* loaded from: 58v.class */
public final class C58v implements 55E {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final boolean A03;

    public C58v(Drawable drawable, int i, int i2, boolean z) {
        this.A02 = drawable;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
    }

    public static C58v A00(Context context, int i, int i2) {
        return new C58v(context.getDrawable(i), i2, i, false);
    }

    public static C58v A01(Context context, int i, int i2) {
        return new C58v(context.getDrawable(i), i2, i, true);
    }

    public boolean BVi(55E r302) {
        int i;
        boolean z = false;
        if (r302.getClass() == C58v.class) {
            C58v c58v = (C58v) r302;
            int i2 = c58v.A01;
            if (i2 == 0 && this.A01 == 0) {
                Drawable drawable = c58v.A02;
                if (drawable.getConstantState() != null) {
                    Drawable drawable2 = this.A02;
                    if (drawable2.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                        i2 = this.A03 ? 1 : 0;
                        i = c58v.A03 ? 1 : 0;
                    }
                }
            } else {
                i = this.A01;
            }
            if (i2 == i) {
                z = true;
            }
        }
        return z;
    }
}
