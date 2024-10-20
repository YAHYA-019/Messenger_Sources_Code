package X;

import com.facebook.rsys.cowatch.gen.CowatchPlayerApi;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: I2b.class */
public final class I2b {
    public ScheduledFuture A02;
    public boolean A03;
    public final HVQ A06;
    public final C00i A05 = GOn.A0P();
    public final C00i A04 = GOn.A0Q();
    public int A00 = -1;
    public long A01 = -1;
    public final Runnable A07 = new Iru(this);

    public I2b(HVQ hvq) {
        this.A06 = hvq;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.H2x, android.view.View, X.6d6] */
    public static final void A00(I2b i2b, int i, long j) {
        C6ce c6ce;
        boolean BWa;
        String str;
        if (i2b.A03) {
            i2b.A00 = i;
            i2b.A01 = 1BL.A09(i2b.A04);
            return;
        }
        ?? r0 = i2b.A06.A00;
        if (r0.isAttachedToWindow() && ((c6ce = r0.A08) != null || r0.A09 != null)) {
            GRX grx = r0.A09;
            if (grx == null || (str = r0.A0A) == null) {
                if (c6ce != null) {
                    BWa = c6ce.BWa();
                }
                CowatchPlayerApi cowatchPlayerApi = (CowatchPlayerApi) 1Br.A0B(r0.A03);
                long j2 = i;
                cowatchPlayerApi.updateMediaPosition(j2, j2 - r0.A00);
            } else {
                BWa = grx.A0D(H2x.A0C, str);
            }
            if (BWa && j > 0) {
                i = H2x.A00(r0);
            }
            CowatchPlayerApi cowatchPlayerApi2 = (CowatchPlayerApi) 1Br.A0B(r0.A03);
            long j22 = i;
            cowatchPlayerApi2.updateMediaPosition(j22, j22 - r0.A00);
        }
        i2b.A03 = true;
        i2b.A02 = ((ScheduledExecutorService) i2b.A05.get()).schedule(i2b.A07, 1000L, TimeUnit.MILLISECONDS);
    }

    public final void A01() {
        synchronized (this) {
            this.A00 = -1;
            this.A01 = -1;
            this.A03 = false;
            ScheduledFuture scheduledFuture = this.A02;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.A02 = null;
        }
    }
}
