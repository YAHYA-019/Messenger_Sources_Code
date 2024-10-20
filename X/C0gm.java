package X;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: X.0gm, reason: invalid class name */
/* loaded from: 0gm.class */
public final class C0gm {
    public static long A00 = 1;

    public static long A00() {
        return Math.max(0L, A02(new StatFs(Environment.getDataDirectory().getPath())));
    }

    public static long A01() {
        long j;
        synchronized (C0gm.class) {
            j = A00;
            if (j == 1) {
                j = A03(new StatFs(Environment.getDataDirectory().getPath()));
                A00 = j;
            }
        }
        return j;
    }

    public static long A02(StatFs statFs) {
        return statFs.getAvailableBytes();
    }

    public static long A03(StatFs statFs) {
        return statFs.getTotalBytes();
    }
}
