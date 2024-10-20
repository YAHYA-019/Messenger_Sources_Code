package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;

/* renamed from: X.Abu, reason: case insensitive filesystem */
/* loaded from: Abu.class */
public final /* synthetic */ class C1252Abu {
    public final /* synthetic */ 6QS A00;

    public final void A00() {
        6QS r0 = this.A00;
        6fA r02 = r0.A0H;
        if (r02 != null) {
            ThreadKey threadKey = r02.A02;
            1CO r03 = r0.A1b;
            boolean z = false;
            if (r03.AZk(72340799886725302L)) {
                boolean AZr = r03.AZr(1GD.A07, 72340799886463155L);
                String[] split = r03.BCy(72903749840077024L).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                if (6QS.A07(r0) != null && 6QS.A07(r0).A0E() && 6QS.A07(r0).A13 != null && Arrays.asList(split).contains(6QS.A07(r0).A13) && AZr) {
                    z = true;
                }
            }
            6QS.A0M(r0, threadKey, true, z);
        }
    }
}
