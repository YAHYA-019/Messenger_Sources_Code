package com.facebook.messaging.business.customerfeedback.view;

import X.07S;
import X.1BK;
import X.1Bi;
import X.1Bn;
import X.1Fv;
import X.1Iw;
import X.2JX;
import X.2Jf;
import X.4YU;
import X.4YV;
import X.5iG;
import X.7zL;
import X.7zM;
import X.7zO;
import X.C00i;
import X.C03z;
import X.C2077Db2;
import X.C3sa;
import X.C6hy;
import X.DKN;
import X.DLP;
import X.EAX;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;
import com.facebook.messaging.business.common.calltoaction.model.CTACustomerFeedback;
import com.facebook.messaging.business.customerfeedback.model.CustomerFeedbackPageData;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.interfaces.UserSelectedScheme;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: CustomerFeedbackActivity.class */
public class CustomerFeedbackActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public boolean A01;
    public final C00i A05 = 1Bn.A09(5iG.class, (Class) null);
    public final C00i A02 = 1Bn.A09(C6hy.class, (Class) null);
    public final C00i A03 = 1Bn.A06(this, MigColorScheme.class, UserSelectedScheme.class);
    public final C00i A04 = 1Bi.A02(QuickPerformanceLogger.class, (Class) null);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        CustomerFeedbackPageData customerFeedbackPageData;
        super.A2y(bundle);
        this.A00 = ((1Fv) 1Bi.A05(1Fv.class, (Class) null)).A05(this);
        1BK.A0U(this.A04).markerStart(508638616);
        Bundle A0H = 7zO.A0H(this);
        if (A0H == null || A0H.getParcelable("arg_customer_feedback_cta_data") == null) {
            return;
        }
        CTACustomerFeedback cTACustomerFeedback = (CTACustomerFeedback) A0H.getParcelable("arg_customer_feedback_cta_data");
        LithoView lithoView = new LithoView(this, (AttributeSet) null);
        1Iw A0W = 7zL.A0W(this);
        EAX eax = new EAX(this, 0);
        DLP dlp = new DLP(lithoView, false);
        NestedScrollView nestedScrollView = new NestedScrollView(this, null);
        nestedScrollView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        nestedScrollView.addView(lithoView);
        eax.setContentView(nestedScrollView);
        if (eax.getWindow() != null) {
            eax.getWindow().setSoftInputMode(16);
        }
        if (cTACustomerFeedback != null) {
            String str = cTACustomerFeedback.A03;
            if (str != null) {
                int length = str.length();
                if (length != 15 && length != 16 && (customerFeedbackPageData = cTACustomerFeedback.A01) != null) {
                    str = customerFeedbackPageData.A03;
                }
                C03z c03z = GraphQlCallInput.A02;
                if (str == null) {
                    str = ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL;
                }
                07S A02 = c03z.A02();
                GraphQlQueryParamSet A0N = 4YU.A0N(A02, str, "form_id");
                4YV.A1A(A02, A0N, "input");
                ((5iG) this.A05.get()).A04(new C2077Db2(eax, A0W, lithoView, cTACustomerFeedback, this, dlp), ((DKN) 1Bn.A0F(this, DKN.class, (Class) null)).A01().A09(C3sa.A00(7zM.A0L(A0N, new 2Jf(2JX.class, (Class) null, "MessengerFeedbackFormStateQuery", (String) null, "fbandroid", 2101317420, 0, 1962428008L, 1962428008L, false, true)).A01())), "customer_feedback_form_status_query");
            }
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
    }
}
