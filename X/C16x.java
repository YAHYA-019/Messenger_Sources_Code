package X;

import android.content.Context;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.16x, reason: invalid class name */
/* loaded from: 16x.class */
public final class C16x {
    public final Context A05;
    public final RealtimeSinceBootClock A06;
    public volatile String A07;
    public final AtomicLong A04 = new AtomicLong();
    public final AtomicLong A03 = new AtomicLong();
    public final AtomicLong A00 = new AtomicLong();
    public final AtomicLong A01 = new AtomicLong();
    public final AtomicLong A02 = new AtomicLong();

    public C16x(Context context, RealtimeSinceBootClock realtimeSinceBootClock) {
        this.A05 = context;
        this.A06 = realtimeSinceBootClock;
    }

    public C16w A00(boolean z) {
        String str = this.A07;
        long j = this.A03.get() - this.A04.get();
        AtomicLong atomicLong = this.A01;
        long j2 = atomicLong.get();
        AtomicLong atomicLong2 = this.A00;
        C16w c16w = new C16w(str, j, j2 - atomicLong2.get(), atomicLong.get() - this.A02.get());
        if (z) {
            atomicLong2.set(0L);
            atomicLong.set(0L);
        }
        return c16w;
    }
}
