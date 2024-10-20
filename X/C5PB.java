package X;

import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.TraceLogger;

/* renamed from: X.5PB, reason: invalid class name */
/* loaded from: 5PB.class */
public abstract class C5PB {
    public static void A00(LoggingOption loggingOption, boolean z) {
        if (loggingOption == null || loggingOption.getTraceInfo() == null) {
            return;
        }
        int intValue = loggingOption.getTraceInfo().getTraceType().intValue();
        int i = 2001;
        if (z) {
            i = 2000;
        }
        TraceLogger.log(null, intValue, null, i, loggingOption.getTraceInfo().getTraceId(), null, 0, null);
    }
}
