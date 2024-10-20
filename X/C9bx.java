package X;

import android.graphics.drawable.Drawable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* renamed from: X.9bx, reason: invalid class name */
/* loaded from: 9bx.class */
public final class C9bx {
    public final int A00;
    public final Drawable A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C9bx(Drawable drawable, String str, String str2, int i, boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = str2;
        this.A01 = drawable;
        this.A00 = i;
        this.A05 = z2;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof C9bx)) {
            C9bx c9bx = (C9bx) obj;
            if (this.A04 == c9bx.A04 && Objects.equal(this.A03, c9bx.A03) && this.A01 == c9bx.A01 && this.A00 == c9bx.A00) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A04), this.A03, this.A01, Integer.valueOf(this.A00)});
    }
}
