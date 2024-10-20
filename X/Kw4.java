package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Kw4.class */
public abstract class Kw4 {
    public static final String A00(Throwable th) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(th.getMessage());
        Throwable cause = th.getCause();
        if (cause != null) {
            A0k.append(" caused by: ");
            A0k.append(cause.getMessage());
        }
        return 11T.A02(A0k);
    }

    public static final String A01(java.util.Map map) {
        if (map.isEmpty()) {
            return null;
        }
        try {
            JSONObject A12 = AnonymousClass001.A12();
            StringBuilder A0k = AnonymousClass001.A0k();
            Iterator A1B = 1BK.A1B(map);
            while (A1B.hasNext()) {
                A0k.append(AnonymousClass001.A0i(A1B));
                A0k.append(" ");
            }
            A12.put("summary", A0k.toString());
            String[] strArr = LDW.A05;
            for (int i = 0; i < 13; i++) {
                String str = strArr[i];
                if (map.containsKey(str)) {
                    A12.put(str, map.get(str));
                }
            }
            if (A12.length() != 0) {
                return A12.toString();
            }
            return null;
        } catch (JSONException e) {
            Object[] objArr = new Object[0];
            C0d8 c0d8 = C0d7.A00;
            if (!c0d8.BTv(6)) {
                return null;
            }
            c0d8.e("ImageUploadTracker", String.format(null, "Failed to sanitize response headers", objArr), e);
            return null;
        }
    }
}
