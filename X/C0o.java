package X;

import com.facebook.messaging.integrity.frx.model.FeedbackSubmissionResult;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C0o.class */
public final class C0o {
    public final /* synthetic */ FeedbackReportFragment A00;

    public C0o(FeedbackReportFragment feedbackReportFragment) {
        this.A00 = feedbackReportFragment;
    }

    public void A00(FeedbackSubmissionResult feedbackSubmissionResult) {
        FeedbackReportFragment feedbackReportFragment = this.A00;
        if (feedbackReportFragment.A0F != null) {
            ThreadKey threadKey = feedbackReportFragment.A0M;
            boolean z = threadKey != null && (threadKey.A1F() || threadKey.A1I() || threadKey.A11());
            C73 c73 = feedbackReportFragment.A0K;
            c73.getClass();
            feedbackReportFragment.A1L(feedbackSubmissionResult, c73.A01(feedbackReportFragment.A0Q, z));
        }
    }
}
