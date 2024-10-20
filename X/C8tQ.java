package X;

import android.net.Uri;

/* renamed from: X.8tQ, reason: invalid class name */
/* loaded from: 8tQ.class */
public final class C8tQ extends 99V {
    public final Uri A00;

    public C8tQ(Uri uri) {
        this.A00 = uri;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8tQ) && 11T.A0O(this.A00, ((C8tQ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
