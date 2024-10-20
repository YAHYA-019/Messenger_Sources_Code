package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.xapp.messaging.threadpre.tltv.logger.ThreadPRETltvLogger;

/* renamed from: X.6ij, reason: invalid class name */
/* loaded from: 6ij.class */
public final class C6ij extends C6ik {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "INITIALIZED";
            case 1:
                return "STARTED";
            case 2:
                return "FINISHED";
            case 3:
                return "CACHE_COMPLETE";
            default:
                return "NETWORK_COMPLETE";
        }
    }

    public static final boolean A01(C6ij c6ij, Integer num, Integer num2) {
        boolean z = true;
        if (num != 0S2.A0C) {
            z = false;
        }
        if (z) {
            return false;
        }
        ThreadPRETltvLogger threadPRETltvLogger = c6ij.A02;
        if (!threadPRETltvLogger.isLoggingInProgress || num == num2) {
            return false;
        }
        Integer num3 = c6ij.A00;
        if (num3 == num) {
            11T.A0F(num2, 0);
            c6ij.A00 = num2;
            return true;
        }
        C6ia c6ia = c6ij.A03;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s.%s tries to move from state %s to %s while the current state is %s", threadPRETltvLogger.getClass().getSimpleName(), c6ij.A04, A00(num), A00(num2), A00(num3));
        11T.A0A(formatStrLocaleSafe);
        c6ia.report("PerfComponentWithValidation", formatStrLocaleSafe);
        return false;
    }
}
