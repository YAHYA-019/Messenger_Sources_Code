package X;

import java.util.LinkedHashMap;

/* loaded from: F5K.class */
public final class F5K {
    public final 04J A00;
    public final RU0 A01;

    public F5K(RU0 ru0) {
        this.A01 = ru0;
        04J r0 = Eaa.A00;
        11T.A0A(r0);
        this.A00 = r0;
    }

    public static final void A00(EQV eqv, EQu eQu, F5K f5k, String str, String str2) {
        RU0 ru0 = f5k.A01;
        03Y A1G = 1BK.A1G("app_session_id", (Object) null);
        String str3 = ru0.A01;
        LinkedHashMap A0A = 4YW.A0A("surface_session_id", str3, A1G);
        1UG A08 = 1BK.A08(f5k.A00, 1BJ.A00(1740));
        if (A08.isSampled()) {
            A08.A7R("event_name", str);
            A08.A5c(eQu, "surface");
            A08.A5c(eqv, "intent_name");
            A08.A7R("bottom_sheet_session_id", ru0.A00);
            if (str3 == null) {
                str3 = "";
            }
            A08.A7R("surface_session_id", str3);
            A08.A7R(AbstractC00603o4.A00(31), str2);
            A08.A6J("app_context_data", A0A);
            A08.A7R("surface_string_override", (String) null);
            A08.BZL();
        }
    }
}
