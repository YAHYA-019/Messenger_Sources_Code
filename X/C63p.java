package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.63p, reason: invalid class name */
/* loaded from: 63p.class */
public final class C63p {
    public final 1Br A00 = 1Bq.A00(16634);

    public static final void A00(C63p c63p, String str, String str2, String str3, String str4) {
        if (str2 != null) {
            1UG A08 = 1BK.A08(1Br.A02(c63p.A00), "services_booking_mobile_client_event");
            if (A08.isSampled()) {
                A08.A7R("event", str);
                A08.A7R("page_id", str2);
                if (str3 != null) {
                    A08.A7R("referrer_ui_component", str3);
                }
                if (str4 != null) {
                    A08.A7R(TraceFieldType.RequestID, str4);
                }
                A08.BZL();
            }
        }
    }
}
