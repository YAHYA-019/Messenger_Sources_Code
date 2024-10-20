package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemePayload;

/* renamed from: X.9iM, reason: invalid class name */
/* loaded from: 9iM.class */
public abstract class C9iM {
    public static final ThreadThemePayload A00(String str, java.util.Map map) {
        String str2;
        Long A0e;
        if (map == null || map.isEmpty()) {
            return null;
        }
        ThreadThemePayload threadThemePayload = (ThreadThemePayload) map.get("view_as_user");
        long longValue = (threadThemePayload == null || (str2 = threadThemePayload.A03) == null || (A0e = 0CW.A0e(str2)) == null) ? 0L : A0e.longValue();
        if (longValue != 0) {
            str = StringFormatUtil.formatStrLocaleSafe("%s,%d", str, Long.valueOf(longValue));
            11T.A0D(str);
        }
        return (ThreadThemePayload) map.get(str);
    }

    public static final String A01(String str, java.util.Map map) {
        String str2;
        ThreadThemePayload A00 = A00(str, map);
        if (A00 == null) {
            str2 = 0Pz.A0j("payload key ", str, " is not found in the map, fallback to the default value");
        } else {
            long j = A00.A00;
            if (j == 0 || j >= System.currentTimeMillis()) {
                String str3 = A00.A03;
                11T.A0A(str3);
                return str3;
            }
            str2 = "Payload has expired, fallback to the default value";
        }
        0fH.A0j("ThemePayloadUtil", str2);
        return "";
    }

    public static final String A02(java.util.Map map, int i) {
        ThreadThemePayload threadThemePayload;
        String str;
        return (map == null || (threadThemePayload = (ThreadThemePayload) map.get(0Pz.A0D(i, "_DEFAULT"))) == null || (str = threadThemePayload.A03) == null) ? "" : str;
    }
}
