package X;

import android.graphics.drawable.Drawable;
import com.google.common.base.Objects;

/* renamed from: X.58z, reason: invalid class name */
/* loaded from: 58z.class */
public final class C58z implements 55E {
    public final float A00;
    public final Drawable A01;

    public C58z(Drawable drawable, float f) {
        this.A01 = drawable;
        this.A00 = f;
    }

    public boolean BVi(55E r302) {
        if (r302.getClass() != C58z.class) {
            return false;
        }
        return Objects.equal(this.A01, ((C58z) r302).A01);
    }
}
