package X;

/* loaded from: F3h.class */
public abstract class F3h {
    public static final 04J A00 = 4YV.A0B();

    public static void A00(String str, String str2, String str3, String str4, java.util.Map map) {
        1UG A08 = 1BK.A08(A00, "caa_login_client_events_fb_msgr");
        if (A08.isSampled()) {
            0DA r0 = new 0DA();
            DKI.A0W(r0, str, str2, "home_page", str3);
            DV7.A00(r0, A08, "event_request_id", DKI.A0L(r0, map, str4));
        }
    }
}
