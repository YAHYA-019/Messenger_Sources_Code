package X;

import com.facebook.messaging.integrity.frx.model.FRXEvidencePrompt;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: Clg.class */
public final class Clg implements DFD {
    public final /* synthetic */ FRXEvidencePrompt A00;
    public final /* synthetic */ FeedbackReportFragment A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ boolean A03;

    public Clg(FRXEvidencePrompt fRXEvidencePrompt, FeedbackReportFragment feedbackReportFragment, User user, boolean z) {
        this.A01 = feedbackReportFragment;
        this.A00 = fRXEvidencePrompt;
        this.A02 = user;
        this.A03 = z;
    }

    public void C4W(ImmutableList immutableList, ImmutableList immutableList2) {
        FeedbackReportFragment.A06(this.A00, this.A01, this.A02, immutableList, immutableList2, this.A03);
    }
}
