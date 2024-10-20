package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.Collection;

/* loaded from: I7x.class */
public final class I7x {
    public static final String A00(6KV r301) {
        String str = "u";
        if (r301 != null) {
            int A01 = r301.A01();
            if (A01 == 0) {
                return Lra.__redex_internal_original_name;
            }
            if (A01 == 1) {
                return K92.__redex_internal_original_name;
            }
            if (A01 == 8) {
                return "r_l";
            }
            if (A01 == 9) {
                str = "r_p";
            }
        }
        return str;
    }

    public static void A01(6KV r301, Object obj, java.util.Map map, long j) {
        map.put("is_landscape_mode", A00(r301));
        map.put("view_duration", String.valueOf(j));
        map.put("expose_duration", obj);
        map.put("is_mine", "false");
        map.put("montage_position", ConstantsKt.CAMERA_ID_FRONT);
        map.put("montage_size", ConstantsKt.CAMERA_ID_BACK);
        map.put("is_last_in_session", "true");
    }

    public final boolean A02(ICk iCk, String str, int i, int i2, int i3, int i4) {
        if ("SWIPE_DOWN".equals(str) || "BACK_PRESS".equals(str)) {
            return true;
        }
        if (!"AUTO_PLAY".equals(str) && !"SWIPE_FORWARD".equals(str) && !"EDGE_SWIPE_FORWARD".equals(str)) {
            return false;
        }
        if (!"EDGE_SWIPE_FORWARD".equals(str) && i3 != i4 - 1) {
            return false;
        }
        Collection A07 = 07C.A07(i + 1, i2);
        if ((A07 instanceof Collection) && A07.isEmpty()) {
            return true;
        }
        07I it = A07.iterator();
        while (it.hasNext()) {
            IAR A06 = iCk.A06(it.A00());
            if (A06 != null && A06.A00 == 1) {
                return false;
            }
        }
        return true;
    }
}
