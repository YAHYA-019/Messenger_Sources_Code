package X;

import android.os.Bundle;

/* renamed from: X.7sh, reason: invalid class name */
/* loaded from: 7sh.class */
public final class C7sh {
    public final Bundle A00;
    public final GCp A01;
    public final String A02;

    public C7sh(Bundle bundle, GCp gCp, String str) {
        this.A02 = str;
        Bundle A05 = 1BK.A05();
        this.A00 = A05;
        if (bundle != null) {
            A05.putAll(bundle);
        }
        this.A01 = gCp;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7sh)) {
            return false;
        }
        return 11T.A0O(((C7sh) obj).A02, this.A02);
    }

    public int hashCode() {
        return this.A02.hashCode();
    }
}
