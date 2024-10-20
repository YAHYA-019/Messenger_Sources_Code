package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.LinkedHashMap;

/* loaded from: F76.class */
public final class F76 {
    public static final LinkedHashMap A00() {
        return 04R.A0A(7zO.A1b("is_from_switcher", ConstantsKt.CAMERA_ID_FRONT, 1BK.A1G("is_from_logged_out", ConstantsKt.CAMERA_ID_FRONT)));
    }

    public final void A01(String str, String str2, java.util.Map map) {
        11T.A0F(str2, 1);
        LinkedHashMap A00 = A00();
        A00.put("fblite_client_id", "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(A00);
        linkedHashMap.putAll(map);
        F3h.A00(str, "login_manual", "login_home_page_interaction", str2, linkedHashMap);
    }
}
