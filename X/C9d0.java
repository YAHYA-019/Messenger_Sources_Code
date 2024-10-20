package X;

import android.net.Uri;

/* renamed from: X.9d0, reason: invalid class name */
/* loaded from: 9d0.class */
public final class C9d0 {
    public static final 8K7 A00(8KQ r301, 9Gx r302) {
        String obj;
        11T.A0F(r301, 0);
        Object obj2 = r301.A04.A00;
        if (obj2 == null || (obj = obj2.toString()) == null) {
            return null;
        }
        String str = r301.A0H;
        DqM dqM = new DqM(str, str, r301.A0D, r301.A0I);
        Uri uri = r301.A03;
        return new 8K7(uri, r301.A02, uri, r302, dqM, obj, r301.A00);
    }
}
