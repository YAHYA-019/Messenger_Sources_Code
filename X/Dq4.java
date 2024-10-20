package X;

import android.net.Uri;

/* loaded from: Dq4.class */
public final class Dq4 extends C04v {
    public final Uri A00;
    public final Float A01;
    public final String A02;

    public Dq4(Uri uri, Float f, String str) {
        this.A00 = uri;
        this.A01 = f;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dq4)) {
                return false;
            }
            Dq4 dq4 = (Dq4) obj;
            if (!11T.A0O(this.A00, dq4.A00) || !11T.A0O(this.A01, dq4.A01) || !11T.A0O(this.A02, dq4.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A02, (1BL.A03(this.A00) + AnonymousClass001.A02(this.A01)) * 31);
    }
}
