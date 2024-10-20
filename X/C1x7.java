package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1x7, reason: invalid class name */
/* loaded from: 1x7.class */
public final class C1x7 {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final Executor A05;
    public final LightweightQuickPerformanceLogger A06;

    public C1x7(Context context, FbUserSession fbUserSession, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Executor executor, int i, int i2) {
        11T.A0F(executor, 1);
        this.A05 = executor;
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = lightweightQuickPerformanceLogger;
        this.A04 = 1Bq.A00(33032);
    }

    public static final void A00(C1x7 c1x7, Summary summary) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c1x7.A06;
        if (lightweightQuickPerformanceLogger != null) {
            int i = summary.attempts;
            if (i != 0) {
                lightweightQuickPerformanceLogger.markerAnnotate(231356437, "ATTEMPTS", i);
            }
            long j = summary.requestStart;
            if (j != 0) {
                lightweightQuickPerformanceLogger.markerPoint(231356437, "REQUEST_START", j, TimeUnit.MILLISECONDS);
            }
            long j2 = summary.requestEnd;
            if (j2 != 0) {
                lightweightQuickPerformanceLogger.markerPoint(231356437, "REQUEST_END", j2, TimeUnit.MILLISECONDS);
            }
            long j3 = summary.networkStart;
            if (j3 != 0) {
                lightweightQuickPerformanceLogger.markerPoint(231356437, "NETWORK_START", j3, TimeUnit.MILLISECONDS);
            }
            long j4 = summary.networkEnd;
            if (j4 != 0) {
                lightweightQuickPerformanceLogger.markerPoint(231356437, "NETWORK_END", j4, TimeUnit.MILLISECONDS);
            }
            long j5 = summary.parseStart;
            if (j5 != 0) {
                lightweightQuickPerformanceLogger.markerPoint(231356437, "PARSE_START", j5, TimeUnit.MILLISECONDS);
            }
            if (summary.retryTimes.isEmpty()) {
                return;
            }
            List list = summary.retryTimes;
            11T.A09(list);
            lightweightQuickPerformanceLogger.markerAnnotate(231356437, "RETRY_TIMESTAMPS", 0QD.A0o(list));
        }
    }
}
