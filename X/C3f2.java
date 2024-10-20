package X;

import com.facebook.messaging.analytics.perf.efficiency.MessagingStateChangePerformanceLogger;

/* renamed from: X.3f2, reason: invalid class name */
/* loaded from: 3f2.class */
public final class C3f2 implements Runnable {
    public static final String __redex_internal_original_name = "MessagingStateChangePerformanceLogger$onEnterForeground$1";
    public final /* synthetic */ MessagingStateChangePerformanceLogger A00;

    public C3f2(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger) {
        this.A00 = messagingStateChangePerformanceLogger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger = this.A00;
        if (((1Od) 1Br.A0B(messagingStateChangePerformanceLogger.A0A)).A0E()) {
            return;
        }
        MessagingStateChangePerformanceLogger.A06(messagingStateChangePerformanceLogger, messagingStateChangePerformanceLogger.A0U);
    }
}
