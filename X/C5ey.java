package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.5ey, reason: invalid class name */
/* loaded from: 5ey.class */
public final class C5ey {
    public 1CO A00;

    public boolean A00(String str) {
        String BCy;
        boolean z = false;
        if (!str.isEmpty() && (BCy = this.A00.BCy(36873664333545632L)) != null && !BCy.isEmpty()) {
            String[] split = BCy.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (split[i].equalsIgnoreCase(str)) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        return z;
    }
}
