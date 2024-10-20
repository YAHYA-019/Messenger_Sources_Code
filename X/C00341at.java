package X;

import android.os.Looper;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1at, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1at.class */
public final class C00341at implements 02R {
    public final C00331as A00;
    public final int[] A02;
    public final long A03;
    public final AwakeTimeSinceBootClock A04;
    public final 1Jx A05;
    public final Random A07;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final Thread A06 = Looper.getMainLooper().getThread();

    public C00341at(AwakeTimeSinceBootClock awakeTimeSinceBootClock, 1Jx r303, C00331as c00331as, Random random, int[] iArr) {
        this.A04 = awakeTimeSinceBootClock;
        this.A05 = r303;
        this.A07 = random;
        this.A00 = c00331as;
        this.A03 = r303.B8e(27787270);
        this.A02 = iArr;
    }

    public static boolean A00(0El r301, C00341at c00341at) {
        int i = (int) r301.A08;
        return (r301.A0N || i <= 1 || c00341at.A07.nextInt(i) == 0) ? false : true;
    }

    public 0El Bdj(int i) {
        1Jx r0 = this.A05;
        long j = this.A03;
        if (r0.Cam((int) j) == ((-1) >>> 1)) {
            return null;
        }
        0El r02 = new 0El();
        r02.A00 = i;
        r02.A0G = j;
        boolean z = false;
        if (this.A06 == Thread.currentThread()) {
            z = true;
        }
        r02.A0L = z;
        r02.A0H = this.A04.nowNanos();
        return r02;
    }

    public void Cg4(long j, int i, boolean z) {
        this.A00.A06(TimeUnit.NANOSECONDS, new int[]{z ? 1 : 0, i}, new int[]{8, 2}, new String[]{OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS, "events_cnt"}, 27799150, j);
    }

    public void Cg5(long j, boolean z) {
        this.A00.A06(TimeUnit.NANOSECONDS, new int[]{z ? 1 : 0}, new int[]{8}, new String[]{OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS}, 27791744, j);
    }

    public void Cg6(int i, String str, String str2) {
        this.A00.A07(TimeUnit.NANOSECONDS, new int[]{2, 1, 1, 1}, new String[]{"markerId", String.valueOf(i), "annotationKey", str, "error", "annotation discarded", "reason", str2});
    }

    public void Cg7(int i, int i2, int i3, int i4) {
        this.A00.A06(TimeUnit.NANOSECONDS, new int[]{i, i2, i3, i4}, new int[]{2, 2, 2, 2}, new String[]{"markerId", "storage_version", "map_size", "data_buffer_size"}, 27791348, 0L);
    }

    public void Cg8(int i, int i2, int i3, int i4) {
        this.A00.A06(TimeUnit.NANOSECONDS, new int[]{i, 1, i3, i4}, new int[]{2, 2, 2, 2}, new String[]{"marker_id", "storage_version", AnonymousClass000.A00(224), "max_concurrent_events"}, 27800211, 0L);
    }

    public void Cg9(int i, String str, String str2) {
        this.A00.A07(TimeUnit.NANOSECONDS, new int[]{2, 1, 1, 1}, new String[]{"markerId", String.valueOf(i), "annotationKey", str, "error", 0Pz.A0j("annotation ", str2, " truncated"), "reason", 0Pz.A0W(str2, " too long")});
    }

    public void CgR(0El r302) {
        if (A00(r302, this)) {
            return;
        }
        long nowNanos = (this.A04.nowNanos() - r302.A0H) + r302.A02;
        C00331as c00331as = this.A00;
        Runnable A00 = C00331as.A00(r302, c00331as, "MARK_EVENT_TIME", nowNanos);
        if (C00331as.A05(c00331as)) {
            C00331as.A03(r302, c00331as, A00);
            c00331as.A00.execute(A00);
            c00331as.A01.set(1BK.A0d());
        }
    }

    public void CgS(0El r302, String str, boolean z) {
        r302.A08 = this.A05.B8e(r302.A00);
        if (A00(r302, this)) {
            return;
        }
        long nowNanos = this.A04.nowNanos() - r302.A0H;
        C00331as c00331as = this.A00;
        Runnable A00 = C00331as.A00(r302, c00331as, z ? "MARKER_ANNOTATE_EVENT_TIME" : "MARKER_ANNOTATE_TIME", nowNanos);
        if (C00331as.A05(c00331as)) {
            A00.A8P("annotation_type", str);
            c00331as.A00.execute(A00);
            c00331as.A01.set(false);
        }
    }

    public void CgT(0El r302) {
        r302.A08 = this.A05.B8e(r302.A00);
        if (A00(r302, this)) {
            return;
        }
        long nowNanos = this.A04.nowNanos() - r302.A0H;
        C00331as c00331as = this.A00;
        Runnable A00 = C00331as.A00(r302, c00331as, "MARKER_POINT_TIME", nowNanos);
        if (C00331as.A05(c00331as)) {
            C00331as.A03(r302, c00331as, A00);
            c00331as.A00.execute(A00);
            c00331as.A01.set(false);
        }
    }

    public void CgU(0El r302, long j) {
        if (A00(r302, this)) {
            return;
        }
        long j2 = j - r302.A0H;
        C00331as c00331as = this.A00;
        Runnable A00 = C00331as.A00(r302, c00331as, "MARKER_START_TIME", j2);
        if (C00331as.A05(c00331as)) {
            A00.A05("event_was_restarted", r302.A0M);
            C00331as.A03(r302, c00331as, A00);
            c00331as.A00.execute(A00);
            c00331as.A01.set(false);
        }
    }
}
