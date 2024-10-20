package X;

import java.util.LinkedHashMap;

/* loaded from: F5a.class */
public final class F5a {
    public final 04J A00;
    public final Eza A01;
    public final F5K A02;

    public /* synthetic */ F5a(Eza eza) {
        F5K f5k = new F5K(eza.A06);
        this.A01 = eza;
        this.A02 = f5k;
        04J r0 = Eaa.A00;
        11T.A0A(r0);
        this.A00 = r0;
    }

    public static final void A00(EQA eqa, F5a f5a, String str) {
        Eza eza = f5a.A01;
        RU0 ru0 = eza.A06;
        LinkedHashMap A0A = 4YW.A0A("surface_session_id", ru0.A01, 1BK.A1G("app_session_id", (Object) null));
        1UG A08 = 1BK.A08(f5a.A00, 1BJ.A00(1739));
        if (A08.isSampled()) {
            A08.A7R("event_name", str);
            A08.A5c(F2h.A00(eza.A02), "surface");
            A08.A5c(eqa, "source_image_type");
            A08.A7R("bottom_sheet_session_id", ru0.A00);
            A08.A7R("response_image_type", "");
            A08.A6J("app_context_data", A0A);
            A08.A7R("surface_string_override", (String) null);
            A08.BZL();
        }
    }
}
