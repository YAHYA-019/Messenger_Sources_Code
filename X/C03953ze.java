package X;

import android.view.MotionEvent;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.3ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ze.class */
public final class C03953ze {
    public static final C03953ze A03 = new C03953ze();
    public final C0dr A00 = AwakeTimeSinceBootClock.INSTANCE;
    public final AtomicLong A01;
    public final AtomicLong A02;

    public C03953ze() {
        long j = -1;
        this.A02 = new AtomicLong(j);
        this.A01 = new AtomicLong(j);
    }

    public static long A00(C03953ze c03953ze, long j) {
        long j2 = c03953ze.A02.get();
        long j3 = c03953ze.A01.get();
        if (j2 > 0) {
            long j4 = j - j2;
            if (j4 >= 0 && j4 <= 2000) {
                return j2;
            }
        }
        if (j3 > 0) {
            long j5 = j - j3;
            if (j5 >= 0 && j5 <= 2000) {
                return j3;
            }
        }
        return -1;
    }

    public static C03953ze A01() {
        return A03;
    }

    public void A02(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A02.set(motionEvent.getEventTime());
            this.A01.set(this.A00.now());
        }
    }
}
