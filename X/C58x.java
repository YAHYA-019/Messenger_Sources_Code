package X;

import android.graphics.drawable.Drawable;
import com.google.common.base.Objects;

/* renamed from: X.58x, reason: invalid class name */
/* loaded from: 58x.class */
public final class C58x implements 55E {
    public final int A00;
    public final 9bM A01;

    public C58x(9bM r302, int i) {
        this.A01 = r302;
        this.A00 = i;
    }

    public static C58x A00(int i, int i2, int i3) {
        return new C58x(new 9bM((Drawable) null, Integer.valueOf(i), i3), i2);
    }

    public boolean BVi(55E r302) {
        boolean z = false;
        if (r302.getClass() == C58x.class) {
            C58x c58x = (C58x) r302;
            if (Objects.equal(this.A01, c58x.A01) && this.A00 == c58x.A00) {
                z = true;
            }
        }
        return z;
    }
}
