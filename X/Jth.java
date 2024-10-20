package X;

import android.net.Uri;
import com.facebook.user.model.UserKey;

/* loaded from: Jth.class */
public final class Jth extends C04v implements MCI {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;

    public Jth(Uri uri) {
        this((String) null, uri);
    }

    public Jth(UserKey userKey) {
        this(userKey, (String) null);
    }

    public Jth(UserKey userKey, String str) {
        11T.A0F(userKey, 1);
        this.A01 = userKey;
        this.A02 = str;
    }

    public Jth(String str, Uri uri) {
        this.A01 = uri;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else {
            if (this == obj) {
                return true;
            }
            i = 0;
        }
        if (!(obj instanceof Jth)) {
            return false;
        }
        Jth jth = (Jth) obj;
        return jth.A00 == i && 11T.A0O(this.A01, jth.A01) && 11T.A0O(this.A02, jth.A02);
    }

    public int hashCode() {
        return 1BL.A03(this.A01) + 1BL.A05(this.A02);
    }
}
