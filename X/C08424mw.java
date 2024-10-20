package X;

import android.app.ActivityManager;
import android.os.DeadObjectException;

/* renamed from: X.4mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4mw.class */
public final class C08424mw {
    public final ActivityManager A00;

    public C08424mw(ActivityManager activityManager) {
        this.A00 = activityManager;
    }

    public final C4n0 A00() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            try {
                this.A00.getMemoryInfo(memoryInfo);
            } catch (Exception e) {
                if (!(e instanceof DeadObjectException)) {
                    throw e;
                }
            }
            return new C4n0(memoryInfo, memoryInfo.totalMem);
        } catch (Throwable unused) {
            return new C4n0(memoryInfo, memoryInfo.totalMem);
        }
    }
}
