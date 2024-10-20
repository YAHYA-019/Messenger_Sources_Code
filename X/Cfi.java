package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function1;

/* loaded from: Cfi.class */
public final class Cfi implements GEX {
    public final int A00;
    public final Object A01;

    public Cfi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bmo(Integer num) {
        BLR blr;
        switch (this.A00) {
            case 0:
                11T.A0F(num, 0);
                Function1 function1 = (Function1) this.A01;
                int intValue = num.intValue();
                if (intValue == 0) {
                    blr = BLR.A05;
                } else if (intValue == 1) {
                    blr = BLR.A03;
                } else if (intValue == 2) {
                    blr = BLR.A06;
                } else if (intValue == 3) {
                    blr = BLR.A02;
                } else {
                    if (intValue != 4) {
                        throw 1BK.A1F();
                    }
                    blr = BLR.A04;
                }
                function1.invoke(blr);
                return;
            case 1:
                ((FbFragmentActivity) this.A01).finish();
                return;
            case 2:
                FeedbackReportFragment feedbackReportFragment = (FeedbackReportFragment) this.A01;
                FRXParams fRXParams = feedbackReportFragment.A0F;
                if (fRXParams == null || fRXParams.A04 == null) {
                    return;
                }
                6Io r0 = feedbackReportFragment.A06;
                r0.getClass();
                FbUserSession fbUserSession = feedbackReportFragment.A00;
                fbUserSession.getClass();
                FRXParams fRXParams2 = feedbackReportFragment.A0F;
                ThreadKey threadKey = fRXParams2.A04;
                C5yq c5yq = fRXParams2.A00;
                C5yl c5yl = fRXParams2.A09;
                7zR.A1O(c5yq, c5yl);
                1UG A08 = 1BK.A08(r0.A00, "frx_messenger_feedback_or_report_action_interstitial_closed");
                if (!A08.isSampled() || threadKey == null) {
                    return;
                }
                CPB.A04(A08, threadKey);
                6Io.A01(A08, fbUserSession, r0, c5yq, threadKey);
                AbM.A1H(A08, c5yl);
                A08.BZL();
                return;
            case 3:
                return;
            default:
                IFc.A06((IFc) this.A01, "rooms_lobby_call_details_bottom_sheet_hidden");
                return;
        }
    }
}
