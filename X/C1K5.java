package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1K5, reason: invalid class name */
/* loaded from: 1K5.class */
public final class C1K5 implements 1K6 {
    public final 1KA A00;
    public final 1K7 A01;
    public final 1K7 A02;

    public C1K5(AwakeTimeSinceBootClock awakeTimeSinceBootClock) {
        this.A01 = new 1K7(awakeTimeSinceBootClock);
        this.A00 = new 1KA(awakeTimeSinceBootClock, "module_tags");
        this.A02 = new 1K7(awakeTimeSinceBootClock);
    }

    public void BLS(0El r302) {
    }

    public void BLT(0El r302) {
    }

    public void Cai(0El r302, 1Qb r303) {
        r303.A0Y.A00(r302);
    }

    public void Caj(0El r302, 1Qb r303) {
        r303.A0Y.A01(r302);
    }

    public void D4e(0El r302, int i) {
        AtomicLong atomicLong;
        long nowNanos;
        1K7 r0 = this.A02;
        try {
            if (i == 0) {
                1Jy.A04("qpl.rw_lock.readLock(%s)", "open_traces");
                long nowNanos2 = r302 == null ? 0L : r0.A00.nowNanos();
                r0.A01.readLock().lock();
                if (r302 != null) {
                    atomicLong = r302.A0K;
                    nowNanos = r0.A00.nowNanos() - nowNanos2;
                    atomicLong.addAndGet(nowNanos);
                }
                return;
            }
            1Jy.A04("qpl.rw_lock.writeLock(%s)", "open_traces");
            long nowNanos3 = r302 == null ? 0L : r0.A00.nowNanos();
            r0.A01.writeLock().lock();
            if (r302 != null) {
                atomicLong = r302.A0K;
                nowNanos = r0.A00.nowNanos() - nowNanos3;
                atomicLong.addAndGet(nowNanos);
            }
            return;
        } finally {
            1Jy.A00();
        }
        1Jy.A00();
    }

    public void D4f(0El r302, int i) {
        AtomicLong atomicLong;
        long nowNanos;
        1K7 r0 = this.A02;
        try {
            if (i == 0) {
                1Jy.A04("qpl.rw_lock.readUnlock(%s)", "open_traces");
                long nowNanos2 = r302 == null ? 0L : r0.A00.nowNanos();
                r0.A01.readLock().unlock();
                if (r302 != null) {
                    atomicLong = r302.A0K;
                    nowNanos = r0.A00.nowNanos() - nowNanos2;
                    atomicLong.addAndGet(nowNanos);
                }
                return;
            }
            1Jy.A04("qpl.rw_lock.writeUnlock(%s)", "open_traces");
            long nowNanos3 = r302 == null ? 0L : r0.A00.nowNanos();
            r0.A01.writeLock().unlock();
            if (r302 != null) {
                atomicLong = r302.A0K;
                nowNanos = r0.A00.nowNanos() - nowNanos3;
                atomicLong.addAndGet(nowNanos);
            }
            return;
        } finally {
            1Jy.A00();
        }
        1Jy.A00();
    }
}
