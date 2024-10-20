package X;

import java.util.HashMap;
import java.util.List;

/* loaded from: F9q.class */
public final class F9q {
    public final 1Br A01 = 1BK.A0D();
    public final 1Br A00 = 1BK.A0E();
    public final EhS A02 = new EhS();

    private final void A00(Integer num, java.util.Map map) {
        String str;
        1UG A08 = 1BK.A08(1Br.A02(this.A01), "caa_aymh_client_events_fb");
        if (A08.isSampled()) {
            0DA r0 = new 0DA();
            switch (num.intValue()) {
                case 0:
                    str = "aymh_profile_load_failed";
                    break;
                case 1:
                    str = "aymh_profile_load_succeeded";
                    break;
                default:
                    str = "aymh_profile_load_attempted";
                    break;
            }
            r0.A07("event", str);
            r0.A07("event_flow", "aymh");
            r0.A07("event_step", "home_page");
            r0.A07("event_category", "prefill_login_signal");
            r0.A07("access_flow_version", "");
            String BD0 = 1Br.A09(this.A00).BD0(EZk.A00);
            if (BD0 == null) {
                BD0 = "";
            }
            r0.A07("waterfall_id", BD0);
            r0.A00.put("extra_client_data", map);
            A08.A7T(r0, "core");
            A08.A7T(new 0DA(), "aymh_params");
            A08.BZL();
        }
    }

    public final void A01(String str) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("credential_type", str);
        A00(0S2.A0C, A0u);
    }

    public final void A02(String str, String str2) {
        1UD.A00(1Br.A02(this.A01), 1ZG.A01, "caa_aymh_client_events_fb");
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("credential_type", str);
        A0u.put("error", str2);
        A00(0S2.A00, A0u);
    }

    public final void A03(String str, List list) {
        11T.A0F(list, 1);
        HashMap A0u = AnonymousClass001.A0u();
        AbM.A1S(list, "profile_uid", A0u);
        Integer num = 0S2.A01;
        A0u.put("credential_type", str);
        A00(num, A0u);
    }
}
