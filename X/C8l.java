package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: C8l.class */
public final class C8l {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(long j, String str, String str2) {
        11T.A0F(str2, 4);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "in_thread_warning_click");
        if (A08.isSampled()) {
            4YU.A1H(A08, j);
            A08.A7R("ad_context_in_thread_warning_state", "should_show_warning");
            A08.A7R("click_type", str);
            A08.A0A("was_shown_report");
            AbF.A1N(A08, str2);
            A08.BZL();
        }
    }

    public final void A01(String str, long j, String str2, String str3, String str4, String str5) {
        C3o5.A0k(str, 1, str5);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "in_thread_warning_error");
        if (A08.isSampled()) {
            4YU.A1H(A08, j);
            A08.A7R("ad_context_in_thread_warning_state", str);
            A08.A7R(TraceFieldType.ErrorCode, str2);
            A08.A7R("error_message", str3);
            A08.A7R(DKB.A00(46), str4);
            AbF.A1N(A08, str5);
            A08.BZL();
        }
    }

    public final void A02(String str, String str2, String str3, String str4, long j) {
        C3o5.A0k(str2, 2, str4);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "in_thread_warning_mutation_result");
        if (A08.isSampled()) {
            4YU.A1H(A08, j);
            A08.A7R("mutation_status", str);
            A08.A7R("ad_context_in_thread_warning_state", str2);
            A08.A7R(JQw.A00(28), str3);
            A08.A0A("was_shown_report");
            AbF.A1N(A08, str4);
            A08.BZL();
        }
    }
}
