package X;

import android.os.SystemProperties;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0gr, reason: invalid class name */
/* loaded from: 0gr.class */
public abstract class C0gr {
    public static final java.util.Map A00 = new C0d6(0);

    public static JSONObject A00() {
        JSONObject A01 = A01();
        if (A01.length() == 0) {
            A01 = AnonymousClass001.A12();
            try {
                Iterator A0y = AnonymousClass001.A0y(A00);
                while (A0y.hasNext()) {
                    Map.Entry entry = (Map.Entry) A0y.next();
                    String str = SystemProperties.get((String) entry.getValue(), "");
                    if (str != null && !str.equals("")) {
                        A01.put((String) entry.getKey(), str);
                    }
                }
            } catch (Throwable th) {
                C0iy.A00().Bwu("SdkExtVerSysProp", th, null);
                0fH.A0p("lacrima", "Could not collect sdk extensions versions from SystemProperties", th);
            }
        }
        return A01;
    }

    public static JSONObject A01() {
        java.util.Map map;
        JSONObject jSONObject = new JSONObject();
        try {
            map = (java.util.Map) Class.forName("android.os.ext.SdkExtensions").getMethod("getAllExtensionVersions", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException e) {
            C0iy.A00().Bwu("SdkExtVer", e, null);
            0fH.A0p("lacrima", "Could not find SdkExtensions class", e);
        } catch (NoSuchMethodException e2) {
            C0iy.A00().Bwu("SdkExtVer", e2, null);
            0fH.A0p("lacrima", "Could not find getAllExtensionVersion method", e2);
        } catch (Throwable th) {
            C0iy.A00().Bwu("SdkExtVer", th, null);
            0fH.A0p("lacrima", "Could not collect sdk extensions versions from SdkExtensions class", th);
        }
        if (map == null) {
            return jSONObject;
        }
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put(((Integer) entry.getKey()).toString(), ((Integer) entry.getValue()).toString());
        }
        return jSONObject;
    }
}
