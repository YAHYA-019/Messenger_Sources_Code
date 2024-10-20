package X;

import android.content.Context;
import com.facebook.payments.checkout.configuration.model.CheckoutInformation;
import com.facebook.payments.checkout.configuration.model.PaymentCredentialsScreenComponent;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.checkout.model.SimpleCheckoutData;
import com.facebook.payments.contactinfo.model.ContactInfo;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.payments.paymentmethods.model.PaymentMethodEligibleOffer;
import com.facebook.payments.paymentmethods.model.PaymentMethodGreyedOutOptionConfig;
import com.facebook.payments.paymentmethods.paymentmethodcomponents.model.PaymentMethodComponentData;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: Es7.class */
public final class Es7 {
    public final Evf A00;

    public Es7(Context context) {
        this.A00 = (Evf) 1Hv.A02(context, 99098);
    }

    public void A00(CheckoutData checkoutData) {
        PaymentCredentialsScreenComponent paymentCredentialsScreenComponent;
        Evf evf = this.A00;
        SimpleCheckoutData simpleCheckoutData = (SimpleCheckoutData) checkoutData;
        evf.A07 = simpleCheckoutData.A0G;
        evf.A0A = simpleCheckoutData.A0a;
        evf.A08 = simpleCheckoutData.A0M;
        evf.A01 = simpleCheckoutData.A0B;
        Optional optional = simpleCheckoutData.A0F;
        ContactInfo contactInfo = null;
        evf.A02 = optional != null ? (ContactInfo) optional.orNull() : null;
        Optional optional2 = simpleCheckoutData.A0L;
        if (optional2 != null) {
            contactInfo = (ContactInfo) optional2.orNull();
        }
        evf.A03 = contactInfo;
        evf.A00 = simpleCheckoutData.A02;
        Optional optional3 = simpleCheckoutData.A0I;
        if (optional3 == null) {
            optional3 = Absent.INSTANCE;
        }
        evf.A04 = (PaymentMethod) optional3.orNull();
        Optional optional4 = simpleCheckoutData.A0J;
        if (optional4 == null) {
            optional4 = Absent.INSTANCE;
        }
        evf.A05 = (PaymentMethodEligibleOffer) optional4.orNull();
        Optional optional5 = simpleCheckoutData.A0K;
        if (optional5 == null) {
            optional5 = Absent.INSTANCE;
        }
        evf.A06 = (PaymentMethodGreyedOutOptionConfig) optional5.orNull();
        CheckoutInformation checkoutInformation = simpleCheckoutData.A07.A02.A06;
        if (checkoutInformation == null || (paymentCredentialsScreenComponent = checkoutInformation.A08) == null) {
            return;
        }
        ImmutableList immutableList = paymentCredentialsScreenComponent.A02;
        ArrayList A0s = AnonymousClass001.A0s();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            PaymentMethodComponentData A0b = DKF.A0b(it);
            if (A0b.A04) {
                A0s.add(A0b.A03);
            }
        }
        evf.A09 = ImmutableList.copyOf((Collection) A0s);
    }
}
