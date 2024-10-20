package X;

import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.user.model.User;

/* loaded from: Cll.class */
public final class Cll implements DFE {
    public final /* synthetic */ FeedbackReportFragment A00;

    public Cll(FeedbackReportFragment feedbackReportFragment) {
        this.A00 = feedbackReportFragment;
    }

    public void Bwq(User user, String str) {
        COr cOr = this.A00.A09;
        if (cOr != null) {
            cOr.A03(user, str);
        }
    }
}
