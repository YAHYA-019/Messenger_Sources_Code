package X;

import android.os.PowerManager;

/* renamed from: X.16i, reason: invalid class name */
/* loaded from: 16i.class */
public final class C16i {
    public static final C16i A01 = new C16i();
    public final PowerManager A00;

    public C16i() {
        this.A00 = null;
    }

    public C16i(C16k c16k) {
        0Gp A00 = c16k.A00(PowerManager.class, "power");
        if (!A00.A06()) {
            throw AnonymousClass001.A0L("Cannot acquire power service");
        }
        this.A00 = (PowerManager) A00.A05();
    }

    public C16h A00() {
        C16h c16h;
        PowerManager powerManager = this.A00;
        if (powerManager == null) {
            c16h = C16h.A01;
        } else {
            c16h = new C16h(powerManager);
            try {
                PowerManager.WakeLock wakeLock = c16h.A00;
                if (wakeLock != null) {
                    wakeLock.acquire(60000L);
                    0Ew.A01(wakeLock, 60000L);
                    return c16h;
                }
            } catch (Throwable unused) {
            }
        }
        return c16h;
    }
}
