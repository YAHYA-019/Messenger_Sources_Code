package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1Qu, reason: invalid class name */
/* loaded from: 1Qu.class */
public final class C1Qu {
    public Set A00 = new HashSet();

    public C1Qu(1O5 r302) {
        String[] split = r302.Akc().split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        int length = split.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            this.A00.add(split[i2].trim());
            i = i2 + 1;
        }
    }
}
