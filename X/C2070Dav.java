package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.enums.GraphQLServicesAppointmentMessagingOptionType;
import com.facebook.litho.LithoView;
import com.facebook.messaging.business.informationidentify.activity.PIIActivity;
import com.facebook.pages.common.requesttime.shared.cancelappointment.RejectAppointmentActivity;
import com.facebook.payments.paymentmethods.model.PayPalJwtToken;
import com.facebook.widget.text.BetterButton;

/* renamed from: X.Dav, reason: case insensitive filesystem */
/* loaded from: Dav.class */
public final class C2070Dav extends 1RM {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C2070Dav(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        2JY r0;
        2JY A0L;
        2JY A0O;
        GraphQLServicesAppointmentMessagingOptionType A0g;
        Object obj2;
        2JY A0B;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                PIIActivity pIIActivity = (PIIActivity) this.A01;
                C00i c00i = pIIActivity.A0Z;
                DKF.A0R(c00i).A01("pii_submission_metadata_query_success", null);
                7zQ.A19(pIIActivity.findViewById(2131366474));
                if (abstractC08294mh != null && (obj2 = abstractC08294mh.A03) != null && (A0B = 1BK.A0B((2JY) obj2, 2JX.class, -316427161, -2084283059)) != null) {
                    String A0r = A0B.A0r(3450462);
                    if (!TextUtils.isEmpty(A0r)) {
                        pIIActivity.A0L = A0r;
                        pIIActivity.A03 = A0B.getIntValue(55126294);
                        DKF.A0R(c00i).A01("pii_user_data_serialize", null);
                        pIIActivity.A0N = A0B.A0r(1078187943);
                        pIIActivity.A0M = A0B.A0r(1073584312);
                        String str = this.A02;
                        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(pIIActivity.A0N) || TextUtils.isEmpty(pIIActivity.A0M)) {
                            return;
                        }
                        Bundle A05 = 1BK.A05();
                        A05.putInt("form_num_screens", pIIActivity.A02);
                        A05.putSerializable("user_input_data", pIIActivity.A0f);
                        pIIActivity.A0F.A01(A05, 0S2.A00, str, pIIActivity.A0N, pIIActivity.A0M, false);
                        return;
                    }
                }
                boolean z = false;
                pIIActivity.A0G.setVisibility(8);
                LithoView lithoView = pIIActivity.A0A;
                1Iw r02 = lithoView.A09;
                if (pIIActivity.A01 >= pIIActivity.A02 - 1) {
                    z = true;
                }
                lithoView.A0x(pIIActivity.A3B(r02, z));
                pIIActivity.A3E(null, pIIActivity.getResources().getString(2131960105), null);
                return;
            case 2:
                AbstractC08294mh abstractC08294mh2 = (AbstractC08294mh) obj;
                String str2 = null;
                if (abstractC08294mh2 != null && (r0 = (2JY) abstractC08294mh2.A03) != null && (A0L = AbM.A0L(r0, 2JX.class, -344852347)) != null && (A0O = 7zL.A0O(A0L, 2JX.class, 345399889, -1435863574, 2029113404)) != null && (A0g = A0O.A0g(GraphQLServicesAppointmentMessagingOptionType.A02, 81273360)) != null && A0g == GraphQLServicesAppointmentMessagingOptionType.A01) {
                    str2 = AbK.A1A(A0O.A0r(-1711529327), (String) null);
                }
                RejectAppointmentActivity.A15((RejectAppointmentActivity) this.A01, this.A02, str2);
                return;
            default:
                ((Fo0) this.A01).A02(new PayPalJwtToken(this.A02));
                return;
        }
    }

    public void A03(Throwable th) {
        switch (this.A00) {
            case 0:
                BIs bIs = (BIs) this.A01;
                CallerContext callerContext = BIs.A09;
                BetterButton betterButton = bIs.A08;
                if (betterButton == null) {
                    11T.A0L("actionButton");
                    throw 0Q8.createAndThrow();
                }
                betterButton.setText(this.A02);
                return;
            case 1:
                PIIActivity pIIActivity = (PIIActivity) this.A01;
                boolean z = false;
                pIIActivity.A0G.setVisibility(8);
                LithoView lithoView = pIIActivity.A0A;
                1Iw r0 = lithoView.A09;
                if (pIIActivity.A01 >= pIIActivity.A02 - 1) {
                    z = true;
                }
                lithoView.A0x(pIIActivity.A3B(r0, z));
                DKF.A0R(pIIActivity.A0Z).A01("pii_submission_metadata_query_failure", th.toString());
                pIIActivity.A3E(null, pIIActivity.getResources().getString(2131960105), null);
                return;
            default:
                return;
        }
    }
}
