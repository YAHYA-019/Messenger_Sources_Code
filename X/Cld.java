package X;

import com.facebook.messaging.integrity.frx.model.FRXEvidencePrompt;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.user.model.User;

/* loaded from: Cld.class */
public final class Cld implements JIO {
    public final /* synthetic */ FRXEvidencePrompt A00;
    public final /* synthetic */ FeedbackReportFragment A01;
    public final /* synthetic */ User A02;

    public Cld(FRXEvidencePrompt fRXEvidencePrompt, FeedbackReportFragment feedbackReportFragment, User user) {
        this.A01 = feedbackReportFragment;
        this.A00 = fRXEvidencePrompt;
        this.A02 = user;
    }

    public void CTF() {
        0fH.A0o("FeedbackReportFragment", "Error fetching users from server");
        FeedbackReportFragment.A07(this.A00, this.A01, this.A02, false);
    }

    public void CTU(java.util.Map map) {
        FeedbackReportFragment feedbackReportFragment = this.A01;
        User user = (User) map.get(feedbackReportFragment.A0T);
        if (user != null) {
            feedbackReportFragment.A0Y = user.A0D();
        }
        FeedbackReportFragment.A07(this.A00, feedbackReportFragment, this.A02, false);
    }
}
