package X;

import android.app.ActivityManager;

/* renamed from: X.05l, reason: invalid class name */
/* loaded from: 05l.class */
public final class C05l implements 0gG {
    public C15h A00;

    public static int A00(ActivityManager.RunningAppProcessInfo runningAppProcessInfo) {
        return runningAppProcessInfo.lastTrimLevel;
    }

    public Integer Ayh() {
        return 0S2.A0s;
    }

    public boolean BN1(Integer num) {
        return AnonymousClass001.A1W(num, 0S2.A00);
    }

    public void CXo(C0qh c0qh, C0gq c0gq) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        C0jQ c0jQ = (C0jQ) this.A00.get();
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = c0jQ.A02;
        synchronized (runningAppProcessInfo2) {
            if (C0jQ.A02(c0jQ) || c0jQ.A00 > 0) {
                runningAppProcessInfo.importance = runningAppProcessInfo2.importance;
                C0jQ.A00(runningAppProcessInfo2, runningAppProcessInfo);
            }
        }
        C0qh.A01(C0g6.A29, c0qh, runningAppProcessInfo.importance);
        C0qh.A01(C0g6.A2A, c0qh, A00(runningAppProcessInfo));
    }
}
