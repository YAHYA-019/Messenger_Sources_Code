package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* loaded from: I0z.class */
public final class I0z {
    public static final I0z A00 = new Object();

    public final void A00(Context context, 1CO r303) {
        boolean A1W = 1BL.A1W(context, r303);
        boolean AZk = r303.AZk(36317938512441281L);
        boolean AZk2 = r303.AZk(36317938512375744L);
        if (AZk) {
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance == null) {
                throw AnonymousClass001.A0T("we need qpl, test will assert on this event");
            }
            qPLInstance.markerStart(11279966);
            qPLInstance.markerEnd(11279966, (short) 2);
        }
        if (AZk2) {
            HO0.A00(context, A1W);
        }
    }
}
