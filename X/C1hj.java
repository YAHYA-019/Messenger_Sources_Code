package X;

import android.content.Context;
import android.os.Build;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.perf.efficiency.MessagingStateChangePerformanceLogger;

/* renamed from: X.1hj, reason: invalid class name */
/* loaded from: 1hj.class */
public final class C1hj implements Runnable {
    public static final String __redex_internal_original_name = "MessagingStateChangePerformanceLogger$addMsysBootstrapStart$1";
    public final /* synthetic */ MessagingStateChangePerformanceLogger A00;

    public C1hj(MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger) {
        this.A00 = messagingStateChangePerformanceLogger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger = this.A00;
        MessagingStateChangePerformanceLogger.A05(messagingStateChangePerformanceLogger, "Cold Start");
        MessagingStateChangePerformanceLogger.A06(messagingStateChangePerformanceLogger, "Cold Start");
        if (Build.VERSION.SDK_INT >= 30) {
            Context context = FbInjector.A03;
            11T.A0A(context);
            0FL A00 = 0FL.A00(context, -1, false);
            if (A00 != null) {
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "app_exit_reason", A00.A03());
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "app_exit_status", A00.A04());
                MessagingStateChangePerformanceLogger.A07(messagingStateChangePerformanceLogger, "app_exit_importance", A00.A01());
                MessagingStateChangePerformanceLogger.A08(messagingStateChangePerformanceLogger, "app_exit_timestamp", A00.A07());
                String A08 = A00.A08();
                if (A08 != null) {
                    MessagingStateChangePerformanceLogger.A09(messagingStateChangePerformanceLogger, "app_exit_description", new C04t("\\d+").A00(A08, "N"));
                }
            }
        }
    }
}
