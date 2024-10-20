package X;

import com.facebook.bloks.messenger.activity.MSGBloksActivity;
import com.facebook.messaging.integrity.frx.model.FRXPage;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.messaging.integrity.frx.ui.nav.FRXNavState;
import java.util.ArrayList;

/* loaded from: C0p.class */
public final class C0p {
    public final /* synthetic */ FeedbackReportFragment A00;

    public C0p(FeedbackReportFragment feedbackReportFragment) {
        this.A00 = feedbackReportFragment;
    }

    public void A00() {
        FRXNavState fRXNavState;
        FeedbackReportFragment feedbackReportFragment = this.A00;
        CC7 cc7 = feedbackReportFragment.A0I;
        if (cc7 != null) {
            DDz dDz = feedbackReportFragment.A01;
            if (dDz != null && (fRXNavState = feedbackReportFragment.A0H) != null && fRXNavState.A00.size() == 1) {
                ((MSGBloksActivity) dDz).onBackPressed();
                return;
            }
            BeZ beZ = feedbackReportFragment.A0p;
            FRXNavState fRXNavState2 = feedbackReportFragment.A0H;
            11T.A0F(beZ, 0);
            if (fRXNavState2 != null) {
                ArrayList arrayList = fRXNavState2.A00;
                if (arrayList.size() != 0) {
                    fRXNavState2.A00();
                    FeedbackReportFragment feedbackReportFragment2 = beZ.A00;
                    FRXPage A05 = FeedbackReportFragment.A05(feedbackReportFragment2);
                    FRXPage fRXPage = (A05 == null || feedbackReportFragment2.A0M == null) ? null : (FRXPage) A05.A00(new Clb(beZ));
                    fRXNavState2.A00();
                    if (fRXPage != null) {
                        arrayList.add(fRXPage);
                        CC7.A00(fRXPage, cc7, false);
                    }
                }
            }
        }
    }
}
