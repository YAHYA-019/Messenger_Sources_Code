package X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9bz, reason: invalid class name */
/* loaded from: 9bz.class */
public final class C9bz {
    public String A00;
    public ScheduledFuture A01;
    public final 1Br A05 = 1Bq.A00(16461);
    public final 1Br A04 = 7zM.A0S();
    public final 1Br A02 = 7zM.A0Q();
    public final 1Br A03 = 1Bq.A00(16765);
    public final Runnable A06 = new ADQ(this);

    public final void A00(String str) {
        7zS.A1H(this.A02);
        String str2 = this.A00;
        if (str.equals(str2)) {
            return;
        }
        if (str2 != null) {
            0fH.A0d(str, str2, "MainSectionsPerformanceLogger", "Entering section %s. Ending any potential marker for section %s with action CANCEL");
            7zP.A0e(this.A04).markerEnd(5505121, (short) 4);
            ScheduledFuture scheduledFuture = this.A01;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.A01 = null;
            }
        }
        0fH.A0g(str, "MainSectionsPerformanceLogger", "Starting marker for section %s");
        C00i c00i = this.A04.A00;
        1BK.A0V(c00i).markerStart(5505121, "section", str);
        C00i c00i2 = this.A03.A00;
        C1iq c1iq = (C1iq) c00i2.get();
        Integer num = 0S2.A01;
        if (c1iq.A02(num) != 0) {
            1BK.A0V(c00i).markerAnnotate(5505121, "time_since_cold_startup", String.valueOf(((C1iq) c00i2.get()).A02(num)));
        }
        C1iq c1iq2 = (C1iq) c00i2.get();
        Integer num2 = 0S2.A0C;
        if (c1iq2.A02(num2) != 0) {
            1BK.A0V(c00i).markerAnnotate(5505121, "time_since_lukewarm_startup", String.valueOf(((C1iq) c00i2.get()).A02(num2)));
        }
        C1iq c1iq3 = (C1iq) c00i2.get();
        Integer num3 = 0S2.A0N;
        if (c1iq3.A02(num3) != 0) {
            1BK.A0V(c00i).markerAnnotate(5505121, "time_since_warm_startup", String.valueOf(((C1iq) c00i2.get()).A02(num3)));
        }
        this.A01 = ((ScheduledExecutorService) 1Br.A0B(this.A05)).schedule(this.A06, 30, TimeUnit.SECONDS);
        this.A00 = str;
    }

    public final void A01(String str) {
        7zS.A1H(this.A02);
        if (str.equals(this.A00)) {
            0fH.A0g(str, "MainSectionsPerformanceLogger", "Leaving section %s. Ending any potential active marker with action CANCEL");
            7zP.A0e(this.A04).markerEnd(5505121, (short) 4);
            ScheduledFuture scheduledFuture = this.A01;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.A01 = null;
            }
            this.A00 = null;
        }
    }
}
