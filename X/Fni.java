package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.payments.paymentmethods.model.AdditionalFields;
import com.facebook.payments.paymentmethods.model.CardFormHeaderParams;
import com.facebook.payments.paymentmethods.model.FbPaymentCardType;
import com.facebook.payments.paymentmethods.model.NewCreditCardOption;
import com.facebook.payments.paymentmethods.model.NewPaymentOption;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;

/* loaded from: Fni.class */
public final class Fni implements GIG {
    public /* bridge */ /* synthetic */ NewPaymentOption Az1(24X r302) {
        CardFormHeaderParams cardFormHeaderParams;
        Qpz qpz;
        DKF.A1T(r302, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        Preconditions.checkArgument(AnonymousClass001.A1W(ERH.A00(JSONUtil.A0H(r302.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), null)), ERH.A04));
        String A0P = C3o5.A0P(r302, "provider", null);
        ImmutableList.Builder A0h = 4YU.A0h();
        Iterator it = JSONUtil.A0E(r302, "available_card_types").iterator();
        while (it.hasNext()) {
            A0h.m11011add((Object) FbPaymentCardType.forValue(JSONUtil.A0H(DKC.A0j(it), null)));
        }
        ImmutableList build = A0h.build();
        Preconditions.checkArgument(7zM.A1b(build));
        Iterable A0E = JSONUtil.A0E(r302, "available_card_categories");
        1Hz r0 = new 1Hz();
        Iterator it2 = A0E.iterator();
        while (it2.hasNext()) {
            String A0H = JSONUtil.A0H(DKC.A0j(it2), null);
            Qpz[] values = Qpz.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    qpz = Qpz.A04;
                    break;
                }
                qpz = values[i];
                if (!qpz.values.contains(DKC.A18(A0H))) {
                    i++;
                }
            }
            r0.A05(qpz);
        }
        ImmutableSet A07 = r0.A07();
        Preconditions.checkArgument(7zM.A1b(A07));
        AdditionalFields A00 = NewCreditCardOption.A00(JSONUtil.A07(r302, "additional_fields"));
        String A0P2 = C3o5.A0P(r302, "title", null);
        2DO A09 = JSONUtil.A09(r302, 2DM.class, "header");
        if (A09.A0W() || !(A09.A0a("title") || A09.A0a("subtitle"))) {
            cardFormHeaderParams = null;
        } else {
            2DO A092 = JSONUtil.A09(A09, 2DM.class, "title");
            cardFormHeaderParams = new CardFormHeaderParams(C3o5.A0P(JSONUtil.A09(A09, 2DM.class, "subtitle"), "text", null), C3o5.A0P(A092, "text", null));
        }
        return new NewCreditCardOption(null, A00, cardFormHeaderParams, build, A07, null, A0P, A0P2);
    }

    public ERH Az2() {
        return ERH.A04;
    }
}
