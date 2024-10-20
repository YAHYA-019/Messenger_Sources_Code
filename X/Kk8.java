package X;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: Kk8.class */
public final class Kk8 {
    public Context A00;
    public AbstractC3252Jnp A01;
    public boolean A02;
    public boolean A03;

    public static long A00(String str) {
        long j = -1;
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong >= 0) {
                return parseLong;
            }
        } catch (NumberFormatException unused) {
        }
        return j;
    }
}
