package X;

import android.net.Uri;

/* renamed from: X.4w8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4w8.class */
public final class C11344w8 {
    public 4wC A00(Uri uri, int i) {
        if (4wA.A03.equals(uri)) {
            return new 4wB(i);
        }
        Uri uri2 = 4wA.A09;
        if (uri2.equals(uri)) {
            return new 4wC(uri2, i);
        }
        if (4wA.A07.equals(uri)) {
            return new 4wH(i);
        }
        Uri uri3 = 4wA.A04;
        if (uri3.equals(uri)) {
            return new 4wC(uri3, i);
        }
        return null;
    }
}
