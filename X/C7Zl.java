package X;

import android.net.Uri;

/* renamed from: X.7Zl, reason: invalid class name */
/* loaded from: 7Zl.class */
public final class C7Zl {
    public final Uri A00;
    public final boolean A01;

    public C7Zl(boolean z, Uri uri) {
        this.A01 = z;
        C1pq.A08("url", uri);
        this.A00 = uri;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7Zl)) {
                return false;
            }
            C7Zl c7Zl = (C7Zl) obj;
            if (this.A01 != c7Zl.A01 || !11T.A0O(this.A00, c7Zl.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A02(2198, this.A01) * 31);
    }
}
