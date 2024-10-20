package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.LinkedHashMap;

/* renamed from: X.4wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4wo.class */
public abstract class AbstractC11504wo {
    public static final Object A00(String str, java.util.Map map) {
        Object obj = map.get(str);
        if (obj == null) {
            throw 1BK.A0h();
        }
        return obj;
    }

    public static final String A01() {
        String valueOf = String.valueOf(System.currentTimeMillis());
        String obj = C04I.A00().toString();
        11T.A0A(obj);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s", "upl", valueOf, obj);
        11T.A0A(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public static final String A02(java.util.Map map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData == null) {
                throw 1BK.A0h();
            }
            String str = fBPayLoggerData.A01;
            if (str != null && str.length() != 0) {
                return str;
            }
        }
        return (String) A00("flow_name", map);
    }

    public static final String A03(java.util.Map map) {
        11T.A0F(map, 0);
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData == null) {
                throw 1BK.A0h();
            }
            String A00 = fBPayLoggerData.A00();
            if (A00 != null && A00.length() != 0) {
                return A00;
            }
        }
        return (String) A00("session_id", map);
    }

    public static final LinkedHashMap A04(FBPayLoggerData fBPayLoggerData) {
        11T.A0F(fBPayLoggerData, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("logger_data", fBPayLoggerData);
        String A00 = fBPayLoggerData.A00();
        if (A00 != null && A00.length() != 0) {
            linkedHashMap.put("session_id", A00);
        }
        return linkedHashMap;
    }
}
