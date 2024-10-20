package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebook.payments.checkout.activity.ShippingPickerActivity;
import com.facebook.payments.checkout.configuration.model.CheckoutInformation;
import com.facebook.payments.checkout.configuration.model.ShippingAddressScreenComponent;
import com.facebook.payments.checkout.model.CheckoutCommonParamsCore;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.checkout.model.SimpleCheckoutData;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.form.model.PaymentsFormDecoratorParams;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.model.FormFieldProperty;
import com.facebook.payments.shipping.model.AddressFormConfig;
import com.facebook.payments.shipping.model.MailingAddress;
import com.facebook.payments.shipping.model.ShippingCommonParams;
import com.facebook.payments.shipping.model.ShippingSource;
import com.facebook.payments.shipping.model.ShippingStyle;
import com.facebook.payments.shipping.model.SimpleMailingAddress;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

/* loaded from: Flm.class */
public final class Flm implements GKH {
    public 1BY A00;
    public final Context A01 = 7zP.A0J();

    public Flm(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public int AcG(CheckoutData checkoutData) {
        return ActionId.LEGACY_MARKER;
    }

    public String AhV(CheckoutData checkoutData) {
        if (!BTl(checkoutData)) {
            return null;
        }
        Optional optional = ((SimpleCheckoutData) checkoutData).A0G;
        optional.getClass();
        MailingAddress mailingAddress = (MailingAddress) optional.get();
        SimpleMailingAddress simpleMailingAddress = (SimpleMailingAddress) mailingAddress;
        return LocaleMember.A02(simpleMailingAddress, simpleMailingAddress.mAddressee, simpleMailingAddress.mStreet, R30.A00(mailingAddress));
    }

    public String Ayg(CheckoutData checkoutData) {
        return ((SimpleMailingAddress) ((MailingAddress) ((SimpleCheckoutData) checkoutData).A0G.get())).mAddressee;
    }

    public Intent B05(CheckoutData checkoutData) {
        ShippingAddressScreenComponent shippingAddressScreenComponent;
        SimpleCheckoutData simpleCheckoutData = (SimpleCheckoutData) checkoutData;
        CheckoutCommonParamsCore checkoutCommonParamsCore = simpleCheckoutData.A07.A02;
        CheckoutInformation checkoutInformation = checkoutCommonParamsCore.A06;
        AddressFormConfig addressFormConfig = (checkoutInformation == null || (shippingAddressScreenComponent = checkoutInformation.A0C) == null) ? null : shippingAddressScreenComponent.A00;
        ShippingStyle shippingStyle = ShippingStyle.SIMPLE_V2;
        ImmutableList immutableList = simpleCheckoutData.A0Q;
        Parcelable shippingCommonParams = new ShippingCommonParams((Country) null, (PaymentsDecoratorParams) null, (PaymentsFormDecoratorParams) null, PaymentsFlowStep.A0p, checkoutCommonParamsCore.A0D.A00, (FormFieldProperty) null, checkoutCommonParamsCore.A0M, addressFormConfig, (MailingAddress) null, (MailingAddress) simpleCheckoutData.A0G.get(), ShippingSource.CHECKOUT, shippingStyle, immutableList, 0);
        Context context = this.A01;
        context.getClass();
        Intent A0D = C3o5.A0D(context, ShippingPickerActivity.class);
        A0D.putExtra("extra_shipping_common_params", shippingCommonParams);
        return A0D;
    }

    public String BG9(CheckoutData checkoutData) {
        return this.A01.getResources().getString(2131965943);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.isPresent() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BTl(com.facebook.payments.checkout.model.CheckoutData r302) {
        /*
            r301 = this;
            r0 = r302
            com.facebook.payments.checkout.model.SimpleCheckoutData r0 = (com.facebook.payments.checkout.model.SimpleCheckoutData) r0
            r302 = r0
            r0 = r302
            com.google.common.base.Optional r0 = r0.A0G
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r303
            boolean r0 = r0.isPresent()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L1f
        L1a:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L1f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Flm.BTl(com.facebook.payments.checkout.model.CheckoutData):boolean");
    }
}
