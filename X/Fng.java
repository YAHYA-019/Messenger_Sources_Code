package X;

import com.facebook.common.util.JSONUtil;
import com.facebook.payments.paymentmethods.model.FbPaymentCardType;
import com.facebook.payments.paymentmethods.model.NewCreditCardOption;
import com.facebook.payments.paymentmethods.model.NewPaymentOption;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Fng.class */
public final class Fng implements GIF {
    public /* bridge */ /* synthetic */ NewPaymentOption Az1(24X r302) {
        24X A0e = 4YU.A0e(r302, "available_card_types");
        Preconditions.checkArgument(A0e.A0R());
        Preconditions.checkArgument(AnonymousClass001.A1N(A0e.A05()));
        ImmutableList.Builder A0h = 4YU.A0h();
        Iterator it = A0e.iterator();
        while (it.hasNext()) {
            A0h.m11011add((Object) FbPaymentCardType.forValue(JSONUtil.A0H(DKC.A0j(it), null)));
        }
        return new NewCreditCardOption(null, null, null, A0h.build(), null, null, null, null);
    }

    public ERH Az2() {
        return ERH.A04;
    }
}
