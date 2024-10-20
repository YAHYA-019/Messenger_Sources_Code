package X;

import android.net.Uri;

/* loaded from: L7e.class */
public final class L7e {
    public final int A00;
    public final int A01;
    public final String A02;
    public static final String[] A03 = {"facebook.com", "www.facebook.com", "m.facebook.com"};
    public static final String[] A04 = {"fbwat.ch", "www.fbwat.ch", "fb.watch", "www.fb.watch"};
    public static final String[] A09 = {"streamable.com", "www.streamable.com"};
    public static final String[] A05 = {"instagram.com", "www.instagram.com"};
    public static final String[] A06 = {"lassovideos.com", "www.lassovideos.com"};
    public static final String[] A07 = {"netflix.com", "www.netflix.com"};
    public static final String[] A08 = {"sharechat.com", "www.sharechat.com"};

    public L7e(String str, int i, int i2) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = i;
    }

    public static boolean A00(Uri uri, String[] strArr) {
        String host;
        boolean z = false;
        if (uri != null && (host = uri.getHost()) != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                if (host.equalsIgnoreCase(strArr[i2])) {
                    z = true;
                    break;
                }
                i = i2 + 1;
            }
        }
        return z;
    }
}
