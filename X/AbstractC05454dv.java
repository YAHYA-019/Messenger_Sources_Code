package X;

import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;

/* renamed from: X.4dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4dv.class */
public abstract class AbstractC05454dv {
    public static ImmutableMap A00(1GS r301, C10174sm c10174sm, String str) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put("locale", r301.A01());
        if (str != null) {
            builder.put("client_country_code", str);
        }
        if (c10174sm != null) {
            C00i c00i = c10174sm.A00;
            c00i.get();
            c00i.get();
            builder.put("access_token", 0Pz.A0m("", "256002347743983", "374e60f8b9bb6b8cbb30f78030438895", '|'));
        }
        return builder.build();
    }

    public static String A01() {
        String A04 = ((1Oe) 1Bi.A03(16617)).A04(C1fe.A0k);
        return TextUtils.isEmpty(A04) ? 1BJ.A00(689) : A04.toUpperCase(Locale.ROOT);
    }
}
