package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TransportAgnosticLogging;

/* renamed from: X.3Pd, reason: invalid class name */
/* loaded from: 3Pd.class */
public abstract class C3Pd {
    public static C5oa[] A00 = {new C5oa("messenger_magic_mod_client_events", new long[]{0, 1}, 1, 2001)};

    public static void A00(PrivacyContext privacyContext, long j, long j2) {
        TransportAgnosticLogging.logTalEventToPipe(privacyContext, 0, false, 2, new Object[]{0, 0L, (byte) 1, Long.valueOf(j), 0, 0L, (byte) 1, Long.valueOf(j2)}, A00);
    }
}
