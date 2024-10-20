package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.xapp.messaging.threadpre.tltv.logger.ThreadPRETltvLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.5c6, reason: invalid class name */
/* loaded from: 5c6.class */
public final class C5c6 extends 1SG {
    public boolean A01;
    public final boolean A06;
    public final 1Br A02 = 1Bq.A00(84488);
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicLong A05 = new AtomicLong(0);
    public long A00 = -1;

    public C5c6(boolean z) {
        this.A06 = z;
    }

    public static final MarkerEditor A00(C5c6 c5c6) {
        QuickPerformanceLogger A02 = 1SG.A02(c5c6);
        Integer num = ((1SG) c5c6).A02;
        if (num != null) {
            return A02.withMarker(num.intValue());
        }
        throw 1BK.A0h();
    }

    public static final void A01(C5c6 c5c6) {
        0fH.A0j("HighlightsTabTTRCTracker", 0Pz.A0r("markerId=", ", init=", " markTTCC", 91369891, c5c6.A00));
        MarkerEditor A00 = A00(c5c6);
        A00.annotate("ttrc_reason", ThreadPRETltvLogger.ANNOTATION_VALUE_TTCC);
        A00.markerEditingCompleted();
        c5c6.A0Y("time_to_recent_content", c5c6.A05.get());
        c5c6.A01 = true;
    }

    public boolean A0g() {
        return C1ub.A03.A0M();
    }
}
