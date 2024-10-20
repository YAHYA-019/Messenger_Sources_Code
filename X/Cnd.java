package X;

import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;

/* loaded from: Cnd.class */
public final class Cnd implements DFT {
    public final int A00;
    public final Object A01;

    public Cnd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C8J(Integer num) {
        if (this.A00 != 0) {
            CMV.A01((CMV) this.A01);
            return;
        }
        FeedbackReportFragment feedbackReportFragment = (FeedbackReportFragment) this.A01;
        feedbackReportFragment.A07.getClass();
        feedbackReportFragment.A07.A0D(num);
    }
}
