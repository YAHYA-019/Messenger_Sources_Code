package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7lm, reason: invalid class name */
/* loaded from: 7lm.class */
public abstract class C7lm {
    /* JADX WARN: Type inference failed for: r0v7, types: [X.5Ny, java.lang.Object] */
    public static final 5Ny A00(String str) {
        11T.A0F(str, 0);
        Integer num = 0S2.A0X;
        String str2 = null;
        try {
            str2 = new JSONObject(str).getString("action");
            num = 5Nx.A00(str2);
        } catch (JSONException e) {
            0fH.A0p("MessengerIpcRequestLoggerData", "Failed to parse request. Setting defaults.", e);
        }
        11T.A0F(num, 2);
        ?? obj = new Object();
        ((5Ny) obj).A02 = false;
        ((5Ny) obj).A00 = num;
        ((5Ny) obj).A01 = str2;
        return obj;
    }
}
