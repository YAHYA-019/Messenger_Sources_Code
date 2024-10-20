package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: HvT.class */
public abstract class HvT {
    public static void A00(ICj iCj, String str, boolean z) {
        String str2;
        switch (iCj.A01.intValue()) {
            case 0:
                str2 = "NOT_STARTED";
                break;
            case 1:
                str2 = "STARTED";
                break;
            default:
                str2 = "NETWORK_CONTENT_DISPLAYED";
                break;
        }
        0fH.A0n("MontageViewerLoadTTRCTracker", 0Pz.A17(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, str2, z));
    }

    public static void A01(ICj iCj, StringBuilder sb, boolean z) {
        String str;
        sb.append(z);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        switch (iCj.A01.intValue()) {
            case 0:
                str = "NOT_STARTED";
                break;
            case 1:
                str = "STARTED";
                break;
            default:
                str = "NETWORK_CONTENT_DISPLAYED";
                break;
        }
        sb.append(str);
    }
}
