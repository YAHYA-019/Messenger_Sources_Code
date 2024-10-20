package X;

import android.os.PowerManager;

/* renamed from: X.16h, reason: invalid class name */
/* loaded from: 16h.class */
public final class C16h {
    public static final C16h A01 = new C16h();
    public final PowerManager.WakeLock A00;

    public C16h() {
        this.A00 = null;
    }

    public C16h(PowerManager powerManager) {
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "RtiWakeLock");
        0Ew.A02(newWakeLock, "RtiWakeLock");
        this.A00 = newWakeLock;
    }

    public void A00() {
        try {
            PowerManager.WakeLock wakeLock = this.A00;
            if (wakeLock != null) {
                0Iz.A01(wakeLock);
            }
        } catch (Throwable unused) {
        }
    }
}
