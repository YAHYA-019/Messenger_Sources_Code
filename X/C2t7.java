package X;

import android.telephony.SubscriptionManager;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.2t7, reason: invalid class name */
/* loaded from: 2t7.class */
public final class C2t7 {
    public static final C2t7 A00 = new Object();

    public static final void A00(1Od r301, FbNetworkManager fbNetworkManager, QuickPerformanceLogger quickPerformanceLogger, int i, int i2) {
        11T.A0F(quickPerformanceLogger, 0);
        11T.A0F(r301, 3);
        11T.A0F(fbNetworkManager, 4);
        quickPerformanceLogger.markerAnnotate(i, i2, "end_network_state", fbNetworkManager.A0M());
        quickPerformanceLogger.markerAnnotate(i, i2, "end_network_type", fbNetworkManager.A0E());
        quickPerformanceLogger.markerAnnotate(i, i2, "end_app_state_is_background", r301.A0E());
        quickPerformanceLogger.markerAnnotate(i, i2, "asl_session_id", r301.A01);
    }

    public static final void A01(QuickPerformanceLogger quickPerformanceLogger, int i, int i2) {
        11T.A0F(quickPerformanceLogger, 0);
        if (((2yD) 1Bi.A03(16385)).AZk(36313609189202730L)) {
            2DH A002 = ((2Ar) 1Bi.A03(16918)).A00();
            11T.A0A(A002);
            quickPerformanceLogger.markerAnnotate(i, i2, "sim_phone_count", A002.A0e());
            SubscriptionManager subscriptionManager = A002.A02;
            quickPerformanceLogger.markerAnnotate(i, i2, "sim_active_subscription_count", (subscriptionManager == null || !A002.A0I.A03.A08("android.permission.READ_PHONE_STATE")) ? -1 : subscriptionManager.getActiveSubscriptionInfoCount());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x00d4, code lost:
    
        if (r302.A0l > 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(X.1Od r302, com.facebook.common.network.FbNetworkManager r303, com.facebook.quicklog.QuickPerformanceLogger r304, int r305, int r306) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2t7.A02(X.1Od, com.facebook.common.network.FbNetworkManager, com.facebook.quicklog.QuickPerformanceLogger, int, int):void");
    }
}
