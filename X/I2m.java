package X;

import com.facebook.messaging.montage.forked.model.viewer.PollVoteResults;
import com.facebook.messaging.montage.forked.model.viewer.ViewerPollVoteResult;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: I2m.class */
public final class I2m {
    public boolean A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A0A;
    public final Runnable A0B;
    public final java.util.Map A09 = DKD.A13();
    public final java.util.Map A08 = DKD.A13();
    public final java.util.Map A07 = DKD.A13();
    public final java.util.Map A06 = DKD.A13();

    public I2m() {
        1BV A00 = 1BV.A00(16452);
        this.A0A = A00;
        this.A03 = AbH.A0S();
        this.A04 = 1BV.A00(68334);
        this.A02 = 1BQ.A01();
        this.A01 = AbH.A0a();
        this.A05 = 1BV.A00(114699);
        this.A0B = new Iqr(this);
        ((ScheduledExecutorService) A00.get()).schedule(new Iqs(this), 10, TimeUnit.SECONDS);
    }

    public static void A00(I2m i2m) {
        synchronized (i2m) {
            if (!i2m.A00) {
                ((ScheduledExecutorService) i2m.A0A.get()).schedule(i2m.A0B, 10, TimeUnit.SECONDS);
                i2m.A00 = true;
            }
        }
    }

    public void A01(ImmutableList immutableList, String str, long j) {
        int i;
        int i2;
        if (str != null) {
            1Du it = immutableList.iterator();
            int i3 = 0;
            while (true) {
                i = i3;
                if (!it.hasNext()) {
                    break;
                } else {
                    i3 = i + ((ViewerPollVoteResult) it.next()).A01;
                }
            }
            java.util.Map map = this.A07;
            if (!map.containsKey(str) || map.get(str) == null) {
                i2 = 0;
            } else {
                1Du it2 = ((PollVoteResults) map.get(str)).A01.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    i2 += ((ViewerPollVoteResult) it2.next()).A01;
                }
            }
            if (i >= i2) {
                ImmutableList.of();
                map.put(str, new PollVoteResults(immutableList, str, j));
                A00(this);
            }
        }
    }
}
