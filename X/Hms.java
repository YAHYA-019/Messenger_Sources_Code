package X;

import java.util.List;

/* loaded from: Hms.class */
public final class Hms {
    public final 04J A00;

    public Hms(04J r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    public final void A00(String str, String str2, String str3, String str4, List list, long j) {
        11T.A0F(list, 0);
        1UG A08 = 1BK.A08(this.A00, 1BJ.A00(1528));
        if (A08.isSampled()) {
            A08.A7h("rtc_end_call_survey_selected_options", 1BK.A17(list));
            A08.A7R("rtc_end_call_survey_issue", str);
            A08.A7R("local_call_id", str3);
            A08.A7R("shared_call_id", str4);
            A08.A6H("peer_id", Long.valueOf(j));
            if (str2 != null) {
                A08.A7R("rtc_end_call_survey_freeform", str2);
            }
            A08.BZL();
        }
    }
}
