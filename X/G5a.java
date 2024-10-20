package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: G5a.class */
public final class G5a implements Runnable {
    public static final String __redex_internal_original_name = "BrowserReportingOrchestrator$2";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ F6X A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public G5a(FbUserSession fbUserSession, F6X f6x, String str, String str2, String str3) {
        this.A01 = f6x;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public void run() {
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, this.A03, "iab_report_id");
        F6X f6x = this.A01;
        String str = this.A04;
        1FV A00 = F6X.A00(f6x, str);
        String str2 = this.A02;
        1FV A002 = F6X.A00(f6x, str2);
        try {
            try {
                ICS ics = (ICS) A00.get();
                if (ics != null) {
                    07S.A00(A0J, ics.A05, "screenshot_file_handle");
                }
                ICS ics2 = (ICS) A002.get();
                if (ics2 != null) {
                    07S.A00(A0J, ics2.A05, "raw_html_file_handle");
                }
                GraphQlQueryParamSet A0M = 7zL.A0M();
                4YV.A1A(A0J, A0M, "input");
                AbL.A0Z(7zM.A0K(f6x.A01), 5Dh.A00(A0M, new C01643sd(Dlc.class, "IabReportSubmitMutation", null, "input", "fbandroid", 132496856, 384, 1072291255L, 1072291255L, false, true)), 718770159051174L).get();
            } catch (Exception e) {
                0fH.A0w("BrowserReportingOrchestrator", "Unable to submit screenshot for report", e);
            }
        } finally {
            if (str != null) {
                DKD.A1O(str);
            }
            if (str2 != null) {
                DKD.A1O(str2);
            }
        }
    }
}
