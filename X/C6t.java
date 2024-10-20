package X;

import android.graphics.drawable.Drawable;

/* loaded from: C6t.class */
public final class C6t {
    public final Drawable A00;

    public C6t(Drawable drawable) {
        C1pq.A08("drawable", drawable);
        this.A00 = drawable;
        drawable.getClass();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C6t) && 11T.A0O(this.A00, ((C6t) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }
}
