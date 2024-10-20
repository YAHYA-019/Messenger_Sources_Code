package X;

import com.facebook.photos.base.debug.DebugImageTracker;

/* renamed from: X.3fo, reason: invalid class name */
/* loaded from: 3fo.class */
public final class C3fo implements Runnable {
    public static final String __redex_internal_original_name = "DebugImageTracker$onAppBackgrounded$1";
    public final /* synthetic */ DebugImageTracker A00;

    public C3fo(DebugImageTracker debugImageTracker) {
        this.A00 = debugImageTracker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0A9 c0a9 = this.A00.A00;
        synchronized (c0a9) {
            C0A9.A01(c0a9, -1);
        }
    }
}
