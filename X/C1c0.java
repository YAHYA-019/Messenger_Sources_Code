package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.1c0, reason: invalid class name */
/* loaded from: 1c0.class */
public class C1c0 extends 1Yu implements C1Yv {
    public final 1Yu A00;
    public final String A01;

    public C1c0(1Yu r302, String str) {
        this.A01 = str;
        this.A00 = r302;
    }

    public JSONObject D4Q() {
        JSONObject D4Q = this.A00.D4Q();
        String str = this.A01;
        if (!TextUtils.isEmpty(str)) {
            D4Q.put("feature_name", str);
        }
        return D4Q;
    }
}
