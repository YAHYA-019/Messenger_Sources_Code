package X;

import com.facebook.mobileconfig.MobileConfigCxxLogger;
import com.facebook.xanalytics.XAnalyticsHolder;
import org.json.JSONObject;

/* renamed from: X.4so, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4so.class */
public final class C10194so implements MobileConfigCxxLogger {
    public static XAnalyticsHolder A00;

    @Override // com.facebook.mobileconfig.MobileConfigCxxLogger
    public void logCounter(String str, int i) {
        XAnalyticsHolder xAnalyticsHolder = A00;
        if (xAnalyticsHolder != null) {
            xAnalyticsHolder.logCounter(str, i);
        }
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxLogger
    public void logEvent(String str, java.util.Map map) {
        XAnalyticsHolder xAnalyticsHolder = A00;
        if (xAnalyticsHolder != null) {
            xAnalyticsHolder.logEvent(str, new JSONObject(map).toString(), "{}");
        }
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxLogger
    public void logEventImmediately(String str, java.util.Map map) {
        XAnalyticsHolder xAnalyticsHolder = A00;
        if (xAnalyticsHolder != null) {
            xAnalyticsHolder.logRealtimeEvent(str, new JSONObject(map).toString(), "{}");
        }
    }
}
