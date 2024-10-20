package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TransportAgnosticLogging;

/* renamed from: X.5x2, reason: invalid class name */
/* loaded from: 5x2.class */
public abstract class C5x2 {
    public static C5oa[] A00 = {new C5oa("messenger_armadillo_md_security_alerts", new long[]{2, 0, 1}, 1, 1686)};

    public static void A00(PrivacyContext privacyContext, Long l, String str, long j) {
        TransportAgnosticLogging.logTalEventToPipe(privacyContext, 0, false, 3, new Object[]{22, 0L, (byte) 0, l, 0, 0L, (byte) 1, Long.valueOf(j), 3, 0L, (byte) 1, str}, A00);
    }
}
