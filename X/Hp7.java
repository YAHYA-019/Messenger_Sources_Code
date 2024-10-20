package X;

import android.os.SystemClock;

/* loaded from: Hp7.class */
public final class Hp7 {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;

    public Hp7() {
        long j = -1;
        this.A00 = j;
        this.A01 = j;
    }

    public long A00(long j) {
        if (!this.A03) {
            long j2 = Long.MAX_VALUE;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= 3) {
                    break;
                }
                long nanoTime = System.nanoTime();
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long nanoTime2 = System.nanoTime();
                long j3 = nanoTime2 - nanoTime;
                if (i2 == 0 || j3 < j2) {
                    this.A02 = elapsedRealtimeNanos - ((nanoTime + nanoTime2) >> 1);
                    j2 = j3;
                }
                i = i2 + 1;
            }
            this.A03 = true;
        }
        long j4 = Math.abs(((float) (SystemClock.elapsedRealtimeNanos() - j)) / 1.0E9f) < 120.0f ? j - this.A02 : j;
        this.A00 = j;
        this.A01 = j4;
        return j4;
    }
}
