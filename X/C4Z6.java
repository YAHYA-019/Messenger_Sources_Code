package X;

import android.content.Context;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Z6, reason: invalid class name */
/* loaded from: 4Z6.class */
public final class C4Z6 {
    public long A00;
    public ScheduledFuture A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final Context A06;

    public C4Z6() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A06 = A00;
        this.A04 = 1Bq.A00(16520);
        this.A02 = 1Bq.A00(84488);
        this.A05 = 1Bq.A00(16465);
        this.A03 = 1Bq.A00(16687);
    }

    public final void A00() {
        ((QuickPerformanceLogger) 1Br.A0B(this.A04)).markerEnd(5505132, 0, (short) 330, 1Br.A01(this.A02), TimeUnit.MILLISECONDS);
    }

    public final void A01(int i) {
        this.A00 = ((C0dr) this.A02.A00.get()).now();
        C00i c00i = this.A04.A00;
        ((QuickPerformanceLogger) c00i.get()).markerStart(5505132, 0, this.A00, TimeUnit.MILLISECONDS);
        ((QuickPerformanceLogger) c00i.get()).markerTag(5505132, ((FbNetworkManager) this.A03.A00.get()).A0M() ? "INTERNET" : "NO_INTERNET");
        ((QuickPerformanceLogger) c00i.get()).markerTag(5505132, 0Jw.A00((short) (i & ((char) (-1)))));
        long j = 5;
        ScheduledFuture scheduledFuture = this.A01;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.A01 = ((ScheduledExecutorService) this.A05.A00.get()).schedule(new Runnable() { // from class: X.4Z7
            public static final String __redex_internal_original_name = "InboxDisplayPerformanceLogger$schedulePossibleEndOfThreadListMarker$1";

            @Override // java.lang.Runnable
            public final void run() {
                C4Z6 c4z6 = C4Z6.this;
                ((QuickPerformanceLogger) c4z6.A04.A00.get()).markerEnd(5505132, 0, (short) 1, c4z6.A00, TimeUnit.MILLISECONDS);
            }
        }, j, TimeUnit.SECONDS);
    }
}
