package X;

import android.net.Uri;

/* loaded from: F06.class */
public abstract class F06 {
    public static final Uri A00(Uri uri) {
        11T.A0F(uri, 0);
        String A00 = FGe.A00(new FZv(uri), FGe.A02);
        if (A00 != null) {
            uri = C0A2.A03(A00);
            11T.A0A(uri);
        }
        return uri;
    }

    public static final Uri A01(Uri uri, boolean z) {
        11T.A0F(uri, 0);
        String A01 = FGe.A01(new FZv(uri), FGe.A02, z);
        if (A01 != null) {
            uri = C0A2.A03(A01);
            11T.A0A(uri);
        }
        return uri;
    }
}
