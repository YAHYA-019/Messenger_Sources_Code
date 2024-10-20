package X;

import com.facebook.omnistore.OmnistoreCustomLogger;

/* renamed from: X.1of, reason: invalid class name */
/* loaded from: 1of.class */
public final class C1of implements OmnistoreCustomLogger {
    @Override // com.facebook.omnistore.OmnistoreCustomLogger
    public int getAnalyticsEventBuilderId(String str, String str2) {
        return 0;
    }

    @Override // com.facebook.omnistore.OmnistoreCustomLogger
    public void logAnalyticsEvent(int i, String str, String str2, String str3) {
    }

    @Override // com.facebook.omnistore.OmnistoreCustomLogger
    public void logCounter(String str, int i) {
    }

    @Override // com.facebook.omnistore.OmnistoreCustomLogger
    public void logDebug(String str, String str2) {
        0fH.A0j(str, str2);
    }

    @Override // com.facebook.omnistore.OmnistoreCustomLogger
    public void logError(String str, String str2) {
        0fH.A0k(str, str2);
    }

    @Override // com.facebook.omnistore.OmnistoreCustomLogger
    public void logInfo(String str, String str2) {
        0fH.A0l(str, str2);
    }

    @Override // com.facebook.omnistore.OmnistoreCustomLogger
    public void logWarning(String str, String str2) {
        0fH.A0n(str, str2);
    }
}
