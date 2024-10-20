package X;

import android.os.SystemClock;

/* renamed from: X.0Ai, reason: invalid class name */
/* loaded from: 0Ai.class */
public final class C0Ai {
    public static final C0Ai A03 = new Object();
    public volatile long A00;
    public volatile long A01;
    public volatile String A02;

    public void A00(boolean z) {
        this.A01 = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            this.A00 = currentTimeMillis;
        }
    }
}
