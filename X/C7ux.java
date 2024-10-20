package X;

import android.app.ActivityThread;

/* renamed from: X.7ux, reason: invalid class name */
/* loaded from: 7ux.class */
public final class C7ux implements MIE {
    @Override // X.MIE
    public void BeV() {
        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
        if (currentActivityThread != null) {
            synchronized (currentActivityThread) {
            }
        }
    }

    @Override // X.MIE
    public String getName() {
        return "ActivityThreadWatchdog";
    }
}
