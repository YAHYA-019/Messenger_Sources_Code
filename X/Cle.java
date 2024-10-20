package X;

import com.facebook.messaging.integrity.frx.model.FeedbackSubmissionResult;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.user.model.User;

/* loaded from: Cle.class */
public final class Cle implements JIO {
    public final /* synthetic */ FeedbackSubmissionResult A00;
    public final /* synthetic */ FeedbackReportFragment A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public Cle(FeedbackSubmissionResult feedbackSubmissionResult, FeedbackReportFragment feedbackReportFragment, String str, String str2) {
        this.A01 = feedbackReportFragment;
        this.A00 = feedbackSubmissionResult;
        this.A02 = str;
        this.A03 = str2;
    }

    public void CTF() {
        0fH.A0o("FeedbackReportFragment", "Error fetching users from server, while showing followup action page");
        FeedbackReportFragment.A0E(this.A00, this.A01, null, null, this.A02);
    }

    public void CTU(java.util.Map map) {
        FeedbackReportFragment feedbackReportFragment = this.A01;
        FeedbackReportFragment.A0E(this.A00, feedbackReportFragment, (User) map.get(feedbackReportFragment.A0T), (User) map.get(this.A03), this.A02);
    }
}
