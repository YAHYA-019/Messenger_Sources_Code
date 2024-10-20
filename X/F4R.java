package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: F4R.class */
public final class F4R {
    public final 1Br A00 = 1BK.A0D();

    public static final void A00(KPP kpp, F4R f4r, Long l, String str) {
        1UG A08 = 1BK.A08(1Br.A02(f4r.A00), "mwb_actor_experience_event");
        if (A08.isSampled()) {
            A08.A0B("action");
            A08.A5c(kpp, "restriction_type");
            A08.A7R("surface", "messenger_thread_view");
            0DA r0 = new 0DA();
            r0.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(l != null ? l.longValue() : -1));
            r0.A03("is_fbid", true);
            A08.A7T(r0, "other_user");
            if (str == null) {
                str = "";
            }
            A08.A7R("thread_id", str);
            A08.BZL();
        }
    }
}
