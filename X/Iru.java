package X;

import java.util.concurrent.ScheduledFuture;

/* loaded from: Iru.class */
public final class Iru implements Runnable {
    public static final String __redex_internal_original_name = "MediaSyncSeekRateLimiter$runnable$1";
    public final /* synthetic */ I2b A00;

    public Iru(I2b i2b) {
        this.A00 = i2b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I2b i2b = this.A00;
        synchronized (i2b) {
            i2b.A03 = false;
            if (i2b.A00 >= 0 && i2b.A01 >= 0) {
                ScheduledFuture scheduledFuture = i2b.A02;
                if (scheduledFuture == null || !scheduledFuture.isCancelled()) {
                    I2b.A00(i2b, i2b.A00, 1BL.A09(i2b.A04) - i2b.A01);
                    i2b.A00 = -1;
                    i2b.A01 = -1;
                }
            }
            i2b.A02 = null;
            i2b.A00 = -1;
            i2b.A01 = -1;
        }
    }
}
