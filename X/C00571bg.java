package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.1bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1bg.class */
public final class C00571bg extends C1c0 {
    public final long A00;
    public final 1Zj A01;

    public C00571bg(1Zj r302, 1Yt r303, String str, long j) {
        super(r303, str);
        this.A01 = r302;
        this.A00 = j;
    }

    public static C00571bg A00(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("userid_in_path", true);
        1Yt r307 = jSONObject.optBoolean("keep_data_on_account_removal", false) ? 1Yt.A07 : jSONObject.optBoolean("keep_data_between_sessions", false) ? 1Yt.A06 : jSONObject.optBoolean("is_underlying_account_scoped", false) ? optBoolean ? 1Yt.A08 : 1Yt.A09 : optBoolean ? 1Yt.A05 : jSONObject.optBoolean("is_user_scoped", true) ? 1Yt.A0A : 1Yt.A0B;
        if (!r307.A02) {
            return null;
        }
        String optString = jSONObject.optString("user_id", "__invalid__");
        String optString2 = jSONObject.optString("feature_name");
        if (TextUtils.isEmpty(optString2)) {
            optString2 = "n/a";
        }
        return new C00571bg(new 1Zj(optString, jSONObject.optString("owner_user_id", optString)), r307, optString2, jSONObject.optLong("last_access_time", -1));
    }

    @Override // X.C1c0, X.C1Yv
    public JSONObject D4Q() {
        String str;
        JSONObject D4Q = super.D4Q();
        1Zj r0 = this.A01;
        str = "__invalid__";
        String str2 = str;
        String str3 = r0.A01;
        if (str3 != null) {
            str2 = str3;
        }
        D4Q.put("user_id", str2);
        String str4 = r0.A00;
        D4Q.put("owner_user_id", str4 != null ? str4 : "__invalid__");
        D4Q.put("last_access_time", this.A00);
        return D4Q;
    }
}
