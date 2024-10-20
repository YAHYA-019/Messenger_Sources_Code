package X;

import android.os.Build;

/* loaded from: Kaz.class */
public abstract class Kaz {
    public static final int A00;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 33554432;
        }
        A00 = i;
    }
}
