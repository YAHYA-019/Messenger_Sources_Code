package X;

import android.net.Uri;

/* renamed from: X.0jF, reason: invalid class name */
/* loaded from: 0jF.class */
public abstract class C0jF {
    public static Uri A00(String... strArr) {
        Uri.Builder authority;
        Uri.Builder scheme = new Uri.Builder().scheme("https");
        if (scheme == null || (authority = scheme.authority("b-www.facebook.com")) == null) {
            return C0A2.A03("");
        }
        int i = 0;
        do {
            authority.appendPath(strArr[i]);
            i++;
        } while (i < 2);
        authority.appendPath("");
        return authority.build();
    }
}
