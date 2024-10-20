package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: L9c.class */
public final class L9c {
    public static final L9c A00 = new Object();
    public static final String[] A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.L9c] */
    static {
        String[] strArr = new String[128];
        int i = 0;
        do {
            strArr[i] = StringFormatUtil.formatStrLocaleSafe("\\u%04x", Integer.valueOf(i));
            i++;
        } while (i < 32);
        JQz.A1V(strArr);
        strArr[60] = "\\u003c";
        strArr[62] = "\\u003e";
        strArr[38] = "\\u0026";
        strArr[61] = "\\u003d";
        strArr[39] = "\\u0027";
        A01 = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r304v0, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r304v1 */
    /* JADX WARN: Type inference failed for: r304v2, types: [org.json.JSONObject] */
    public static final Object A00(L9c l9c, Object obj) {
        Object jSONArray;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            jSONArray = AnonymousClass001.A12();
            Iterator<String> keys = jSONObject.keys();
            11T.A0A(keys);
            while (keys.hasNext()) {
                String A0i = AnonymousClass001.A0i(keys);
                try {
                    L9c l9c2 = A00;
                    11T.A0D(A0i);
                    String A012 = A01(A0i, true);
                    Object obj2 = jSONObject.get(A0i);
                    11T.A0A(obj2);
                    jSONArray.put(A012, A00(l9c2, obj2));
                } catch (JSONException unused) {
                }
            }
        } else {
            if (!(obj instanceof JSONArray)) {
                return ((obj instanceof Integer) || (obj instanceof Boolean)) ? obj : A01(obj.toString(), true);
            }
            JSONArray jSONArray2 = (JSONArray) obj;
            jSONArray = new JSONArray();
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                try {
                    Object obj3 = jSONArray2.get(i);
                    11T.A0A(obj3);
                    jSONArray.put(A00(l9c, obj3));
                } catch (JSONException unused2) {
                }
            }
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A01(java.lang.String r301, boolean r302) {
        /*
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r303 = r0
            r0 = 0
            r304 = r0
        L6:
            r0 = r301
            int r0 = r0.length()
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 >= r1) goto L83
            r0 = r301
            r1 = r304
            char r0 = r0.charAt(r1)
            r306 = r0
            r0 = 92
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 != r1) goto L3a
            r0 = r302
            if (r0 == 0) goto L6c
            java.lang.String r0 = "\\\\\\\\"
            r307 = r0
        L2c:
            r0 = r303
            r1 = r307
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r304
            r1 = 1
            int r0 = r0 + r1
            r304 = r0
            goto L6
        L3a:
            r0 = 128(0x80, float:1.8E-43)
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 < r1) goto L6c
            r0 = 8232(0x2028, float:1.1535E-41)
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 != r1) goto L59
            java.lang.String r0 = "\\u2028"
            r307 = r0
            goto L2c
        L59:
            r0 = 8233(0x2029, float:1.1537E-41)
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 != r1) goto L79
            java.lang.String r0 = "\\u2029"
            r307 = r0
            goto L2c
        L6c:
            java.lang.String[] r0 = X.L9c.A01
            r1 = r306
            r0 = r0[r1]
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L2c
        L79:
            r0 = r306
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r307 = r0
            goto L2c
        L83:
            r0 = r303
            java.lang.String r0 = X.11T.A02(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L9c.A01(java.lang.String, boolean):java.lang.String");
    }
}
