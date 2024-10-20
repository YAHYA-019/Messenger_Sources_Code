package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.user.model.User;
import org.json.JSONObject;

/* loaded from: F87.class */
public final class F87 {
    public final 1Br A00;
    public final C00i A01;
    public final 1De A02;
    public final FAX A03;
    public final User A04;

    public F87(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A04 = (User) 1Bn.A0E((Context) null, r0, 83430);
        this.A00 = DKF.A0N();
        1Br A0O = DKF.A0O(7zQ.A0I(r0));
        this.A01 = A0O;
        this.A03 = ((F6C) A0O.get()).A00;
    }

    public static JSONObject A00(C00i c00i, String str, String str2) {
        return ((F87) c00i.get()).A01(str, str2, null);
    }

    public final JSONObject A01(String str, String str2, String str3) {
        JSONObject A12 = AnonymousClass001.A12();
        A12.put(7zK.A00(ActionId.RTMP_CONNECTION_INTERCEPTED), str);
        if (str2 != null) {
            A12.put("promise_id", str2);
        }
        if (str3 != null) {
            A12.put("sdk_version", str3);
        }
        FAX fax = this.A03;
        Er6 er6 = fax.A03;
        if (er6 != null) {
            A12.put("game_id", er6.A0g);
        }
        A12.put("context_token_id", fax.A09);
        A12.put("game_session_id", fax.A0D);
        User user = this.A04;
        if (user != null) {
            A12.put("user_id", user.A13);
        }
        A12.put("should_use_armadillo_custom_update_e2ee", ((FHN) 1Br.A0B(this.A00)).A08());
        return A12;
    }
}
