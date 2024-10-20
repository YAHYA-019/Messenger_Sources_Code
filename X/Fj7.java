package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.business.common.calltoaction.CallToActionContextParams;
import com.facebook.messaging.business.common.calltoaction.model.CTACustomerFeedback;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.business.customerfeedback.view.CustomerFeedbackActivity;

/* loaded from: Fj7.class */
public final class Fj7 implements DGe {
    @Override // X.DGe
    public C4Nc Aav() {
        return C4Nc.A05;
    }

    @Override // X.DGe
    public boolean BLp(Context context, CallToActionContextParams callToActionContextParams, CallToAction callToAction) {
        boolean A1X = 1BL.A1X(context, callToAction);
        CTACustomerFeedback cTACustomerFeedback = callToAction.A02;
        if (cTACustomerFeedback == null) {
            return false;
        }
        Intent A0D = C3o5.A0D(context, CustomerFeedbackActivity.class);
        A0D.putExtra("arg_customer_feedback_cta_data", cTACustomerFeedback);
        0LS.A0A(context, A0D);
        return A1X;
    }
}
