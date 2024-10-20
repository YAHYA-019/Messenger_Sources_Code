package X;

import android.net.Uri;

/* loaded from: BU4.class */
public abstract class BU4 {
    public static final boolean A00(Uri uri) {
        11T.A0F(uri, 0);
        String host = uri.getHost();
        boolean z = true;
        if (!"instagram".equalsIgnoreCase(uri.getScheme()) && !"instagram.com".equalsIgnoreCase(host) && !"www.instagram.com".equalsIgnoreCase(host) && !"aistudio.instagram.com".equalsIgnoreCase(uri.getHost())) {
            z = false;
        }
        return z;
    }
}
