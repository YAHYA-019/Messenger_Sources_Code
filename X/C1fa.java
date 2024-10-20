package X;

import android.util.Base64;

/* renamed from: X.1fa, reason: invalid class name */
/* loaded from: 1fa.class */
public abstract class C1fa {
    public static String A00(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
