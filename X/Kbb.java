package X;

import android.os.Looper;

/* loaded from: Kbb.class */
public abstract class Kbb {
    public static final long A00;
    public static final C01i A01 = C01g.A01(M1S.A00);

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        A00 = j;
    }
}
