package X;

import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.inject.FbInjector;
import com.facebook.payments.checkout.errors.model.CallToAction;
import com.facebook.payments.checkout.errors.model.PaymentsError;
import com.facebook.payments.model.PaymentItemType;
import java.util.HashSet;

/* loaded from: Ewl.class */
public final class Ewl {
    public final C00i A01 = FbInjector.A00;
    public final AnonymousClass243 A00 = (AnonymousClass243) 1Bn.A0A(68334);
    public final Eer A02 = (Eer) 1Bn.A0A(99329);

    public PaymentsError A00() {
        HashSet A0v = AnonymousClass001.A0v();
        C00i c00i = this.A01;
        String string = 1BL.A0B(c00i).getString(2131963152);
        C1pq.A08("errorTitle", string);
        String string2 = 1BL.A0B(c00i).getString(2131955745);
        C1pq.A08("errorDescription", string2);
        return new PaymentsError(new CallToAction(new RRA()), null, null, null, string2, string, null, "", 4YV.A0z("primaryCta", A0v, A0v), 0);
    }

    public PaymentsError A01(2JX r302, PaymentItemType paymentItemType) {
        Qug qug;
        RRA rra;
        CallToAction callToAction;
        String A0s;
        String A0q;
        Quh quh;
        String A0s2;
        String A0q2;
        Quh quh2;
        HashSet A0v = AnonymousClass001.A0v();
        int intValue = r302.getIntValue(1635686852);
        String A0r = r302.A0r(-817778335);
        if (A0r == null) {
            A0r = 1BL.A0B(this.A02.A00).getString(2131963152);
        }
        C1pq.A08("errorTitle", A0r);
        String A15 = DKC.A15(r302);
        if (A15 == null) {
            A15 = 1BL.A0B(this.A02.A00).getString(2131955745);
        }
        C1pq.A08("errorDescription", A15);
        String A0t = r302.A0t(GraphQLStringDefUtil.A00(), "GraphQLPaymentsUserFacingErrorImage", 100313435);
        if (A0t != null) {
            Qug[] values = Qug.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    qug = null;
                    break;
                }
                qug = values[i];
                if (((String) qug.getValue()).equalsIgnoreCase(A0t)) {
                    break;
                }
                i++;
            }
            qug.getClass();
        } else {
            qug = Qug.A01;
        }
        HashSet A07 = C1pq.A07(paymentItemType, "paymentItemType", A0v, A0v);
        String A0t2 = r302.A0t(GraphQLStringDefUtil.A00(), "GraphQLPaymentsFlowStep", -1499968707);
        if (A0t2 == null) {
            A0t2 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
        }
        C1pq.A08("flowStep", A0t2);
        String A0r2 = r302.A0r(747380345);
        2JY A0B = 1BK.A0B(r302, 2JX.class, -867242413, 396204042);
        if (A0B == null || (A0s2 = A0B.A0s(GraphQLStringDefUtil.A00(), "GraphQLPaymentsUserFacingErrorCallToActionType")) == null || (A0q2 = A0B.A0q()) == null) {
            rra = new RRA();
        } else {
            rra = new RRA();
            Quh[] values2 = Quh.values();
            int length2 = values2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    quh2 = null;
                    break;
                }
                quh2 = values2[i2];
                if (((String) quh2.getValue()).equalsIgnoreCase(A0s2)) {
                    break;
                }
                i2++;
            }
            quh2.getClass();
            rra.A00(quh2);
            rra.A02 = A0B.A0r(3321850);
            rra.A01 = A0q2;
        }
        CallToAction callToAction2 = new CallToAction(rra);
        HashSet A10 = 4YV.A10("primaryCta", A07);
        2JY A0B2 = 1BK.A0B(r302, 2JX.class, -869054267, -824603757);
        if (A0B2 == null || (A0s = A0B2.A0s(GraphQLStringDefUtil.A00(), "GraphQLPaymentsUserFacingErrorCallToActionType")) == null || (A0q = A0B2.A0q()) == null) {
            callToAction = null;
        } else {
            RRA rra2 = new RRA();
            Quh[] values3 = Quh.values();
            int length3 = values3.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    quh = null;
                    break;
                }
                quh = values3[i3];
                if (((String) quh.getValue()).equalsIgnoreCase(A0s)) {
                    break;
                }
                i3++;
            }
            quh.getClass();
            rra2.A00(quh);
            rra2.A02 = A0B2.A0r(3321850);
            rra2.A01 = A0q;
            callToAction = new CallToAction(rra2);
        }
        return new PaymentsError(callToAction2, callToAction, qug, paymentItemType, A15, A0r, A0r2, A0t2, A10, intValue);
    }
}
