package X;

import android.graphics.Rect;

/* renamed from: X.1k0, reason: invalid class name */
/* loaded from: 1k0.class */
public final class C1k0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C1k0(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        if (i > i3) {
            throw AnonymousClass001.A0L(0Pz.A0C(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
        }
        if (i2 > i4) {
            throw AnonymousClass001.A0L(0Pz.A0C(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!11T.A0O(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            11T.A0I(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
            C1k0 c1k0 = (C1k0) obj;
            if (this.A01 != c1k0.A01 || this.A03 != c1k0.A03 || this.A02 != c1k0.A02 || this.A00 != c1k0.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Bounds");
        A0k.append(" { [");
        A0k.append(this.A01);
        A0k.append(',');
        A0k.append(this.A03);
        A0k.append(',');
        A0k.append(this.A02);
        A0k.append(',');
        A0k.append(this.A00);
        return AnonymousClass001.A0d("] }", A0k);
    }
}
