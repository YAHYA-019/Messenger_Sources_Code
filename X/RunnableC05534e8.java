package X;

import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;

/* renamed from: X.4e8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4e8.class */
public final class RunnableC05534e8 implements Runnable {
    public static final String __redex_internal_original_name = "MessagingPerformanceLogger$endLogRunnable$1$queueIdle$2";
    public final /* synthetic */ 1MU A00;
    public final /* synthetic */ MessagingPerformanceLogger A01;

    public RunnableC05534e8(1MU r302, MessagingPerformanceLogger messagingPerformanceLogger) {
        this.A01 = messagingPerformanceLogger;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A04 = null;
        MessagingPerformanceLogger.A03(this.A00.A00).A03();
    }
}
