package X;

import com.facebook.messaging.analytics.perf.efficiency.MessagingStateChangePerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3he, reason: invalid class name */
/* loaded from: 3he.class */
public final class C3he implements Runnable {
    public static final String __redex_internal_original_name = "MsysSyncEventListener$decoratePerformanceLogger$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 1dN A01;
    public final /* synthetic */ String A02;

    public C3he(1dN r302, String str, long j) {
        this.A01 = r302;
        this.A02 = str;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger = (MessagingStateChangePerformanceLogger) 1Br.A0B(this.A01.A02);
        String str = this.A02;
        long j = this.A00;
        if (messagingStateChangePerformanceLogger.A0J && messagingStateChangePerformanceLogger.A0K) {
            int[] iArr = MessagingStateChangePerformanceLogger.A0b;
            for (int i = 0; i < 4; i++) {
                int i2 = iArr[i];
                if (MessagingStateChangePerformanceLogger.A01(messagingStateChangePerformanceLogger).isMarkerOn(i2, true)) {
                    if (!messagingStateChangePerformanceLogger.A03) {
                        MessagingStateChangePerformanceLogger.A01(messagingStateChangePerformanceLogger).markerPoint(i2, "msys_sync_started");
                    }
                    MessagingStateChangePerformanceLogger.A01(messagingStateChangePerformanceLogger).markerPoint(i2, str, j, TimeUnit.MILLISECONDS);
                }
            }
            messagingStateChangePerformanceLogger.A03 = true;
        }
    }
}
