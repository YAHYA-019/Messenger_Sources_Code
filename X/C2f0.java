package X;

import android.net.Uri;

/* renamed from: X.2f0, reason: invalid class name */
/* loaded from: 2f0.class */
public final class C2f0 extends C04v implements C2f1 {
    public final Uri A00;
    public final Uri A01;

    public C2f0(Uri uri, Uri uri2) {
        1BL.A1F(uri, uri2);
        this.A01 = uri;
        this.A00 = uri2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2f0)) {
                return false;
            }
            C2f0 c2f0 = (C2f0) obj;
            if (!11T.A0O(this.A01, c2f0.A01) || !11T.A0O(this.A00, c2f0.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 1BL.A03(this.A01));
    }
}
