package X;

/* renamed from: X.5ex, reason: invalid class name */
/* loaded from: 5ex.class */
public final class C5ex {
    public final C0dp A00;
    public final C0dr A01;

    public C5ex(C0dp c0dp, C0dr c0dr) {
        this.A00 = c0dp;
        this.A01 = c0dr;
    }

    public static long A00(L5D l5d, long j, long j2) {
        long elapsedRealtimeNanos = l5d.A00.getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos != 0 && Long.valueOf(elapsedRealtimeNanos) != null) {
            return (((j2 * 1000000) - elapsedRealtimeNanos) + 500000) / 1000000;
        }
        if (l5d.A05() != null) {
            return j - l5d.A05().longValue();
        }
        return Long.MIN_VALUE;
    }

    public long A01(L5D l5d) {
        return A00(l5d, this.A00.now(), this.A01.now());
    }
}
