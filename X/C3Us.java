package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Set;

/* renamed from: X.3Us, reason: invalid class name */
/* loaded from: 3Us.class */
public final class C3Us implements 1Z9 {
    public Set A00;
    public final 1Br A01 = 1BK.A0C();

    public void A7q(2jL r302) {
        java.util.Map A05;
        11T.A0F(r302, 0);
        C00i c00i = this.A01.A00;
        if (1BK.A0M(c00i).AZk(36323612164508479L)) {
            String str = r302.A02;
            String str2 = r302.A03;
            if (str == null) {
                str = str2 == null ? "" : str2;
            } else if (str2 != null) {
                str = 0Pz.A0Y(str, str2, ':');
            }
            Set set = this.A00;
            if (set == null) {
                set = 0QD.A0f(0CU.A0M(2yD.A02(1BK.A0M(c00i), 36886562118043283L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0));
                this.A00 = set;
                if (set == null) {
                    return;
                }
            }
            if (!set.contains(str) || (A05 = r302.A05()) == null || A05.isEmpty()) {
                return;
            }
            if (A05.containsKey("bookmarkType")) {
                Object obj = A05.get("bookmarkType");
                if (obj instanceof String) {
                    11T.A0O(obj, "VideoHome");
                }
            }
            if (A05.containsKey("bookmarkName")) {
                Object obj2 = A05.get("bookmarkName");
                if (obj2 instanceof String) {
                    11T.A0O(obj2, "Reels");
                }
            }
            if (A05.containsKey("reels_entry_post_id")) {
                A05.get("reels_entry_post_id");
            }
            if (A05.containsKey("reels_entry_pivot_type")) {
                A05.get("reels_entry_pivot_type");
            }
            if (A05.containsKey("reels_entry_feed_position")) {
                A05.get("reels_entry_feed_position");
            }
        }
    }
}
