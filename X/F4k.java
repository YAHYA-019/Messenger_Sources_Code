package X;

/* loaded from: F4k.class */
public final class F4k {
    public final 1Br A01 = 1BK.A0D();
    public final 1Br A00 = 1BK.A0E();

    public static final void A00(F4k f4k, String str, String str2) {
        1UG A08 = 1BK.A08(1Br.A02(f4k.A01), 1BJ.A00(1084));
        if (A08.isSampled()) {
            0DA r0 = new 0DA();
            DKI.A0W(r0, "registration_flow_state", "ntf", "password_saving", "registration_funnel");
            r0.A06("exception_code", (Long) null);
            r0.A07("exception_message", str2);
            r0.A07("logged_in_identifier", (String) null);
            r0.A07("logged_out_identifier", (String) null);
            r0.A00.put("extra_client_data", null);
            r0.A07("waterfall_id", 1Br.A09(f4k.A00).BD0(EZk.A00));
            r0.A07("event_request_id", (String) null);
            A08.A7T(r0, "core");
            0DA r02 = new 0DA();
            r02.A07("reg_instance", "");
            r02.A07("state", str);
            A08.A7T(r02, "acquisition_client_params");
            A08.BZL();
        }
    }
}
