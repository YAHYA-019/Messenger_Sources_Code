package X;

/* loaded from: F3g.class */
public abstract class F3g {
    public static final 04J A00 = 4YV.A0B();

    public static void A00(String str, String str2, java.util.Map map) {
        1UG A08 = 1BK.A08(A00, "caa_login_client_events_fb_msgr");
        if (A08.isSampled()) {
            0DA r0 = new 0DA();
            DKI.A0W(r0, str, "aymh", "home_page", str2);
            DV7.A00(r0, A08, "event_request_id", DKI.A0L(r0, map, ""));
        }
    }
}
