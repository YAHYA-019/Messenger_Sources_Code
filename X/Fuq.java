package X;

import com.facebook.common.dextricks.DexOptimization;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebookpay.logging.FBPayLoggerData;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashSet;
import java.util.Set;

/* loaded from: Fuq.class */
public final class Fuq implements GKt {
    public static final Set A03;
    public final 04J A00;
    public final C0dp A01;
    public final java.util.Map A02;

    static {
        HashSet A0v = AnonymousClass001.A0v();
        A03 = A0v;
        A0v.add("payflows_back_click");
        A0v.add("payflows_cancel");
        A0v.add("payflows_click");
        A0v.add("payflows_custom");
        A0v.add("payflows_done_click");
        A0v.add("payflows_fail");
        A0v.add("payflows_field_focus");
        A0v.add("payflows_init");
        A0v.add("payflows_display");
        A0v.add("payflows_api_init");
        A0v.add("payflows_redirect");
        A0v.add("payflows_save_click");
        A0v.add("payflows_success");
        A0v.add("payflows_terms_click");
        A0v.add("payflows_timeout");
    }

    public Fuq(04J r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
        0rI r0 = 0rI.A00;
        11T.A0A(r0);
        this.A01 = r0;
        this.A02 = DKD.A13();
    }

    public static final String A00(String str) {
        if (11T.A0P("payflows_", 1, str)) {
            str = DKC.A19(str, 9);
        }
        return str;
    }

    public static final String A01(java.util.Map map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData == null) {
                throw 1BK.A0h();
            }
            String str = fBPayLoggerData.A00;
            if (str != null && str.length() != 0) {
                return str;
            }
        }
        return AbH.A1C("external_session_id", map);
    }

    public static final String A02(java.util.Map map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData == null) {
                throw 1BK.A0h();
            }
            String str = fBPayLoggerData.A04;
            if (str != null && str.length() != 0) {
                return str;
            }
        }
        return AbH.A1C(Property.SYMBOL_Z_ORDER_SOURCE, map);
    }

    public static void A03(0D7 r301, Fuq fuq, String str, String str2) {
        r301.A0E("event_type", DexOptimization.OPT_KEY_CLIENT);
        r301.A0E("event_name", A00(str));
        r301.A0E(OptSvcAnalyticsStore.LOGGING_KEY_CLIENT_TIME, String.valueOf(fuq.A01.now()));
        r301.A0C("logging_service_id", Integer.valueOf(fuq.hashCode()));
        r301.A0E("session_id", str2);
    }

    public static void A04(0D7 r301, String str, String str2, java.util.Map map) {
        r301.A0E("external_session_id", A01(map));
        r301.A0E("flow_name", str);
        r301.A0E("context_id", str2);
        r301.A0E("flow_step", (String) map.get("flow_step"));
    }

    public static void A05(0D7 r301, String str, java.util.Map map) {
        String str2 = (String) map.get(str);
        if (str2 == null || str2.length() == 0) {
            return;
        }
        r301.A0E(str, str2);
    }

    public static void A06(0D7 r301, String str, java.util.Map map) {
        r301.A0E(str, (String) map.get(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x00c4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x077a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0618  */
    @Override // X.GKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BZT(java.lang.String r302, java.util.Map r303) {
        /*
            Method dump skipped, instructions count: 1923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fuq.BZT(java.lang.String, java.util.Map):void");
    }
}
