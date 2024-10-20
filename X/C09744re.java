package X;

import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: X.4re, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4re.class */
public final class C09744re implements 1Ro {
    public static final String __redex_internal_original_name = "FetchMqttParametersMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11011add((Object) new BasicNameValuePair("format", "JSON"));
        builder.m11011add((Object) new BasicNameValuePair("config_sections[]", "mqtt_config"));
        C04083zw c04083zw = new C04083zw();
        c04083zw.A0D = "getMobileConfig";
        c04083zw.A0E = "GET";
        c04083zw.A0F = "/me/mobile_configs";
        c04083zw.A06 = 0S2.A01;
        c04083zw.A0J = builder.build();
        return c04083zw.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X r308;
        24X A01 = anonymousClass439.A01();
        if (A01 == null) {
            throw new IllegalArgumentException();
        }
        String[] strArr = {"mqtt_config"};
        HashMap hashMap = new HashMap();
        C10554tt A0C = A01.A0C("data");
        if (A0C == null) {
            A0C = C10554tt.A00;
        }
        String str = strArr[0];
        Iterator it = A0C.iterator();
        while (true) {
            if (!it.hasNext()) {
                r308 = C10554tt.A00;
                break;
            }
            24X r0 = (24X) it.next();
            if (r0.A0E(DKB.A00(524)).A0H().equals(str)) {
                r308 = r0.A0E("value");
                break;
            }
        }
        if (!r308.A0U()) {
            hashMap.put(str, r308);
        }
        return hashMap;
    }
}
