package X;

import com.facebook.user.model.User;
import java.util.HashMap;

/* loaded from: G7k.class */
public final class G7k implements GJE {
    public 1BY A00;
    public final C00i A01 = AbH.A0N();
    public final C00i A03 = 7zN.A0D(83430);
    public final C00i A02 = AbH.A0M();

    public G7k(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static void A00(String str, String str2, G7k g7k) {
        HashMap hashMap = null;
        1UG A08 = 1BK.A08(1BK.A07(g7k.A01), 1BJ.A00(1370));
        if (A08.isSampled()) {
            if (str2 != null) {
                hashMap = AnonymousClass001.A0u();
                hashMap.put("description", String.format("description", str2));
            }
            A08.A7R("fx_sso_library_event", str);
            A08.A7R("fx_sso_library_failure_reason", (String) null);
            C00i c00i = g7k.A03;
            A08.A6H("initiator_account_id", c00i.get() != null ? 1BK.A0n(((User) c00i.get()).A13) : null);
            A08.A5c((C07n) null, "initiator_account_type");
            A08.A7R("version_id", "1.0");
            A08.A6J("debug_test_data", hashMap);
            A08.BZL();
        }
    }

    public void BhQ(String str) {
        A00("auth_token_fetch_failure", str, this);
    }

    public void CMa(C67d c67d) {
        1BK.A0U(this.A02).markerPoint(857814189, "CONTENT_PROVIDER_RESOLVED");
    }
}
