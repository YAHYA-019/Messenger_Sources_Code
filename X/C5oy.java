package X;

import com.facebook.inject.FbInjector;

/* renamed from: X.5oy, reason: invalid class name */
/* loaded from: 5oy.class */
public final class C5oy {
    public final 1Br A03 = 1Bq.A00(16705);
    public final 1BP A04 = FbInjector.A00;
    public final 1Br A00 = 1Bu.A00(66916);
    public final 1Br A01 = 1Bq.A00(84027);
    public final 1Br A02 = 1Bu.A00(16669);

    public static final Long A00(C5oy c5oy, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (4YV.A0Z(c5oy.A03).isOngoingFlow(parseLong)) {
                return Long.valueOf(parseLong);
            }
            return null;
        } catch (NumberFormatException e) {
            0fH.A0d(str, e, "SecureMessageOverWANotificationsE2EMessageLevelLogger", "Invalid messageTraceId");
            return null;
        }
    }
}
