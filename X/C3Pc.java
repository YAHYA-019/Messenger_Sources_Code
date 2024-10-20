package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TransportAgnosticLogging;
import com.mapbox.mapboxsdk.BuildConfig;

/* renamed from: X.3Pc, reason: invalid class name */
/* loaded from: 3Pc.class */
public abstract class C3Pc {
    public static C5oa[] A00 = {new C5oa("armadillo_app_upgrade_screen_blocker", new long[]{2, 0, 1}, 1, 1783)};

    public static void A00(PrivacyContext privacyContext, String str, String str2) {
        TransportAgnosticLogging.logTalEventToPipe(privacyContext, 0, false, 3, new Object[]{3, 0L, (byte) 1, BuildConfig.VERSION_NAME, 3, 0L, (byte) 1, str, 3, 0L, (byte) 1, str2}, A00);
    }
}
