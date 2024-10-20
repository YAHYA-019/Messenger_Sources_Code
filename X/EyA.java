package X;

import android.graphics.drawable.Drawable;

/* loaded from: EyA.class */
public final class EyA {
    public final int A00;
    public final Drawable A01;

    public EyA(Drawable drawable, int i) {
        this.A01 = drawable;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EyA)) {
                return false;
            }
            EyA eyA = (EyA) obj;
            if (!11T.A0O(this.A01, eyA.A01) || this.A00 != eyA.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A02(this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("IconStyleValues(drawable=");
        A0k.append(this.A01);
        A0k.append(", sizeDp=");
        return DKH.A0p(A0k, this.A00);
    }
}
