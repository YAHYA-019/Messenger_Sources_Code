package X;

import android.graphics.Rect;

/* renamed from: X.1k1, reason: invalid class name */
/* loaded from: 1k1.class */
public final class C1k1 {
    public final 08D A00;
    public final C1k0 A01;

    public C1k1(08D r302, C1k0 c1k0) {
        11T.A0F(r302, 2);
        this.A01 = c1k0;
        this.A00 = r302;
    }

    public final Rect A00() {
        C1k0 c1k0 = this.A01;
        return new Rect(c1k0.A01, c1k0.A03, c1k0.A02, c1k0.A00);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!11T.A0O(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            11T.A0I(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
            C1k1 c1k1 = (C1k1) obj;
            if (!11T.A0O(this.A01, c1k1.A01) || !11T.A0O(this.A00, c1k1.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 1BL.A03(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("WindowMetrics( bounds=");
        A0k.append(this.A01);
        A0k.append(", windowInsetsCompat=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
