package com.facebook.payments.checkout.model;

import X.1BK;
import X.1BL;
import X.1Du;
import X.1JF;
import X.4YU;
import X.4YV;
import X.7zM;
import X.AbF;
import X.AnonymousClass001;
import X.C1pq;
import X.C53v;
import X.DKF;
import X.DKI;
import X.ERH;
import X.ERI;
import X.EVD;
import X.FEn;
import X.FKZ;
import X.GLm;
import X.Qpd;
import X.Qpk;
import X.R2m;
import X.RTg;
import X.Ret;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.locale.Country;
import com.facebook.payments.checkout.configuration.model.CheckoutInformation;
import com.facebook.payments.checkout.configuration.model.CheckoutPromotionsOptInComponent;
import com.facebook.payments.checkout.configuration.model.CheckoutTermsAndPolicies;
import com.facebook.payments.checkout.configuration.model.ContactInformationScreenComponent;
import com.facebook.payments.checkout.configuration.model.CouponCode;
import com.facebook.payments.checkout.configuration.model.CouponCodeCheckoutPurchaseInfoExtension;
import com.facebook.payments.checkout.configuration.model.CouponCodeScreenComponent;
import com.facebook.payments.checkout.configuration.model.DebugInfo;
import com.facebook.payments.checkout.configuration.model.DebugInfoScreenComponent;
import com.facebook.payments.checkout.configuration.model.PaymentCredentialsScreenComponent;
import com.facebook.payments.checkout.configuration.model.PaymentSecurityComponent;
import com.facebook.payments.checkout.configuration.model.PriceSelectorConfig;
import com.facebook.payments.checkout.configuration.model.ShippingAddressScreenComponent;
import com.facebook.payments.checkout.configuration.model.ShippingOptionsScreenComponent;
import com.facebook.payments.checkout.configuration.model.TermsAndPoliciesScreenComponent;
import com.facebook.payments.contactinfo.model.ContactInfo;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.paymentmethods.model.CreditCard;
import com.facebook.payments.paymentmethods.model.NewPaymentOption;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.payments.paymentmethods.model.PaymentMethodEligibleOffer;
import com.facebook.payments.paymentmethods.model.PaymentMethodGreyedOutOptionConfig;
import com.facebook.payments.paymentmethods.model.PaymentMethodsInfo;
import com.facebook.payments.paymentmethods.model.PaymentOption;
import com.facebook.payments.paymentmethods.paymentmethodcomponents.model.PaymentMethodComponentData;
import com.facebook.payments.shipping.model.MailingAddress;
import com.facebook.payments.shipping.model.ShippingOption;
import com.facebook.payments.shipping.model.SimpleMailingAddress;
import com.google.common.base.Absent;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Present;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: SimpleCheckoutData.class */
public final class SimpleCheckoutData implements CheckoutData {
    public static final Parcelable.Creator CREATOR = FKZ.A00(17);
    public final int A00;
    public final Parcelable A01;
    public final Country A02;
    public final CheckoutPromotionsOptInComponent A03;
    public final CheckoutTermsAndPolicies A04;
    public final PriceSelectorConfig A05;
    public final AuthorizationData A06;
    public final CheckoutCommonParams A07;
    public final Qpd A08;
    public final PaymentsSessionStatusData A09;
    public final SendPaymentCheckoutResult A0A;
    public final ContactInfo A0B;
    public final CurrencyAmount A0C;
    public final PaymentMethodsInfo A0D;
    public final GLm A0E;
    public final Optional A0F;
    public final Optional A0G;
    public final Optional A0H;
    public final Optional A0I;
    public final Optional A0J;
    public final Optional A0K;
    public final Optional A0L;
    public final Optional A0M;
    public final ImmutableList A0N;
    public final ImmutableList A0O;
    public final ImmutableList A0P;
    public final ImmutableList A0Q;
    public final ImmutableList A0R;
    public final ImmutableMap A0S;
    public final ImmutableMap A0T;
    public final ImmutableSet A0U;
    public final Boolean A0V;
    public final Integer A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;

    public SimpleCheckoutData(RTg rTg) {
        this.A07 = rTg.A07;
        this.A09 = rTg.A09;
        this.A0i = rTg.A0i;
        GLm gLm = rTg.A0E;
        this.A0E = gLm == null ? ERH.A0C : gLm;
        this.A0V = rTg.A0V;
        this.A0h = rTg.A0h;
        this.A0e = rTg.A0e;
        this.A0X = rTg.A0X;
        this.A0a = rTg.A0a;
        this.A0P = rTg.A0P;
        this.A0G = rTg.A0G;
        this.A0Q = rTg.A0Q;
        this.A0M = rTg.A0M;
        this.A0R = rTg.A0R;
        this.A0F = rTg.A0F;
        this.A0L = rTg.A0L;
        this.A0O = rTg.A0O;
        this.A0B = rTg.A0B;
        this.A01 = rTg.A01;
        Qpd qpd = rTg.A08;
        qpd.getClass();
        this.A08 = qpd;
        Optional optional = rTg.A0I;
        this.A0I = optional == null ? Absent.INSTANCE : optional;
        this.A0H = rTg.A0H;
        this.A0J = rTg.A0J;
        this.A0K = rTg.A0K;
        this.A02 = rTg.A02;
        this.A0N = rTg.A0N;
        this.A0D = rTg.A0D;
        this.A0T = (ImmutableMap) MoreObjects.firstNonNull(rTg.A0T, RegularImmutableMap.A03);
        this.A0Y = rTg.A0Y;
        this.A06 = rTg.A06;
        this.A00 = rTg.A00;
        this.A0A = rTg.A0A;
        this.A05 = rTg.A05;
        this.A04 = rTg.A04;
        this.A03 = rTg.A03;
        this.A0W = rTg.A0W;
        this.A0C = rTg.A0C;
        this.A0f = rTg.A0f;
        Map map = rTg.A0S;
        this.A0S = ImmutableMap.copyOf(map == null ? AnonymousClass001.A0u() : map);
        this.A0Z = rTg.A0Z;
        this.A0b = rTg.A0b;
        this.A0j = rTg.A0j;
        this.A0d = rTg.A0d;
        this.A0c = rTg.A0c;
        this.A0k = rTg.A0k;
        this.A0g = rTg.A0g;
        this.A0U = rTg.A0U;
    }

    public SimpleCheckoutData(Parcel parcel) {
        this.A07 = (CheckoutCommonParams) 1BL.A0C(parcel, CheckoutCommonParams.class);
        this.A09 = (PaymentsSessionStatusData) 1BL.A0C(parcel, PaymentsSessionStatusData.class);
        this.A0i = C53v.A0S(parcel);
        String readString = parcel.readString();
        this.A0E = (GLm) MoreObjects.firstNonNull(EVD.A00(readString, ERI.values()), EVD.A00(readString, ERH.values()));
        this.A0V = DKI.A0J(parcel);
        this.A0h = parcel.readString();
        this.A0e = parcel.readString();
        this.A0X = parcel.readString();
        this.A0a = parcel.readString();
        this.A0G = C53v.A00(parcel, MailingAddress.class);
        this.A0Q = C53v.A04(parcel, MailingAddress.class);
        this.A0P = C53v.A04(parcel, DebugInfo.class);
        this.A0M = C53v.A00(parcel, ShippingOption.class);
        this.A0R = C53v.A04(parcel, ShippingOption.class);
        this.A0F = C53v.A00(parcel, ContactInfo.class);
        this.A0L = C53v.A00(parcel, ContactInfo.class);
        this.A0O = C53v.A04(parcel, ContactInfo.class);
        this.A0B = (ContactInfo) 1BL.A0C(parcel, ContactInfo.class);
        this.A01 = 1BL.A0C(parcel, getClass());
        this.A08 = C53v.A07(parcel, Qpd.class);
        this.A0I = C53v.A00(parcel, PaymentMethod.class);
        this.A0H = C53v.A00(parcel, NewPaymentOption.class);
        Optional A00 = C53v.A00(parcel, PaymentMethodEligibleOffer.class);
        this.A0J = A00 == null ? Absent.INSTANCE : A00;
        Optional A002 = C53v.A00(parcel, PaymentMethodGreyedOutOptionConfig.class);
        this.A0K = A002 == null ? Absent.INSTANCE : A002;
        this.A02 = (Country) 1BL.A0C(parcel, Country.class);
        this.A0N = C53v.A04(parcel, CheckoutAdditionalPaymentMethod.class);
        this.A0D = (PaymentMethodsInfo) 1BL.A0C(parcel, PaymentMethodsInfo.class);
        HashMap A0u = AnonymousClass001.A0u();
        C53v.A0N(parcel, A0u);
        HashMap A0u2 = AnonymousClass001.A0u();
        Iterator A0x = AnonymousClass001.A0x(A0u);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            A0u2.put(A0z.getKey(), ImmutableList.copyOf((Collection) A0z.getValue()));
        }
        this.A0T = ImmutableMap.copyOf((Map) A0u2);
        this.A0Y = parcel.readString();
        this.A06 = (AuthorizationData) 1BL.A0C(parcel, AuthorizationData.class);
        this.A00 = parcel.readInt();
        this.A0A = (SendPaymentCheckoutResult) 1BL.A0C(parcel, SendPaymentCheckoutResult.class);
        this.A05 = (PriceSelectorConfig) 1BL.A0C(parcel, PriceSelectorConfig.class);
        this.A04 = (CheckoutTermsAndPolicies) 1BL.A0C(parcel, CheckoutTermsAndPolicies.class);
        this.A03 = (CheckoutPromotionsOptInComponent) 1BL.A0C(parcel, CheckoutPromotionsOptInComponent.class);
        this.A0W = (Integer) 4YV.A0l(parcel, Integer.class);
        this.A0C = (CurrencyAmount) 1BL.A0C(parcel, CurrencyAmount.class);
        this.A0f = parcel.readString();
        this.A0S = C53v.A05(parcel);
        this.A0Z = parcel.readString();
        this.A0b = parcel.readString();
        this.A0j = C53v.A0S(parcel);
        this.A0d = parcel.readString();
        String readString2 = parcel.readString();
        this.A0c = readString2 == null ? "UNSET_OR_UNRECOGNIZED_ENUM_VALUE" : readString2;
        this.A0k = C53v.A0S(parcel);
        this.A0g = parcel.readString();
        ImmutableSet A06 = C53v.A06(parcel, Qpk.class.getClassLoader());
        this.A0U = A06 == null ? RegularImmutableSet.A05 : A06;
    }

    public SimpleCheckoutData A00(CheckoutInformation checkoutInformation) {
        ImmutableList immutableList;
        String str;
        PaymentMethodEligibleOffer paymentMethodEligibleOffer;
        PaymentMethodGreyedOutOptionConfig paymentMethodGreyedOutOptionConfig;
        PaymentMethodGreyedOutOptionConfig paymentMethodGreyedOutOptionConfig2;
        PaymentMethodEligibleOffer paymentMethodEligibleOffer2;
        RTg rTg = new RTg();
        rTg.A00(this);
        String str2 = checkoutInformation.A0K;
        str2.getClass();
        PaymentsSessionStatusData paymentsSessionStatusData = this.A09;
        if (paymentsSessionStatusData == null) {
            String str3 = this.A07.A02.A0M.mValue;
            C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
            rTg.A09 = new PaymentsSessionStatusData(null, new PaymentsSessionData(str2, str3), "UNINITIALIZED");
        } else {
            DKF.A1X(str2, paymentsSessionStatusData.A01.A00);
        }
        ShippingAddressScreenComponent shippingAddressScreenComponent = checkoutInformation.A0C;
        if (shippingAddressScreenComponent != null) {
            ImmutableList immutableList2 = shippingAddressScreenComponent.A01;
            rTg.A0Q = immutableList2 == null ? ImmutableList.of() : immutableList2;
            String str4 = shippingAddressScreenComponent.A02;
            MailingAddress mailingAddress = null;
            if (str4 != null && immutableList2 != null) {
                1Du it = immutableList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MailingAddress mailingAddress2 = (MailingAddress) it.next();
                    if (((SimpleMailingAddress) mailingAddress2).mId.equals(str4)) {
                        mailingAddress = mailingAddress2;
                        break;
                    }
                }
            }
            rTg.A0G = Optional.fromNullable(mailingAddress);
        }
        ContactInformationScreenComponent contactInformationScreenComponent = checkoutInformation.A02;
        if (contactInformationScreenComponent != null) {
            rTg.A0O = contactInformationScreenComponent.A04;
            rTg.A0F = Optional.fromNullable(contactInformationScreenComponent.A01);
            rTg.A0L = Optional.fromNullable(contactInformationScreenComponent.A02);
            rTg.A0Z = contactInformationScreenComponent.A05;
            ContactInfo contactInfo = contactInformationScreenComponent.A00;
            if (contactInfo != null) {
                rTg.A0B = contactInfo;
            }
        }
        PaymentCredentialsScreenComponent paymentCredentialsScreenComponent = checkoutInformation.A08;
        if (paymentCredentialsScreenComponent != null) {
            ImmutableList immutableList3 = paymentCredentialsScreenComponent.A02;
            ArrayList A0s = AnonymousClass001.A0s();
            1Du it2 = immutableList3.iterator();
            while (it2.hasNext()) {
                PaymentMethodComponentData A0b = DKF.A0b(it2);
                if (A0b.A04) {
                    A0s.add(A0b.A03);
                }
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0s);
            if (copyOf != null && !copyOf.isEmpty()) {
                PaymentOption paymentOption = (PaymentOption) copyOf.get(0);
                rTg.A0E = paymentOption.BHS();
                rTg.A01(paymentOption);
                rTg.A0H = paymentOption instanceof NewPaymentOption ? new Present(paymentOption) : Absent.INSTANCE;
                if (paymentOption instanceof CreditCard) {
                    rTg.A02 = ((CreditCard) paymentOption).AZA();
                }
            }
            1Du it3 = immutableList3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    paymentMethodEligibleOffer = null;
                    break;
                }
                PaymentMethodComponentData A0b2 = DKF.A0b(it3);
                if (A0b2.A04 && (paymentMethodEligibleOffer2 = A0b2.A01) != null) {
                    String str5 = paymentMethodEligibleOffer2.A00;
                    AbF.A1T(str5);
                    String str6 = paymentMethodEligibleOffer2.A01;
                    AbF.A1V(str6);
                    paymentMethodEligibleOffer = new PaymentMethodEligibleOffer(str5, str6);
                    break;
                }
            }
            rTg.A0J = Optional.fromNullable(paymentMethodEligibleOffer);
            1Du it4 = immutableList3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    paymentMethodGreyedOutOptionConfig = null;
                    break;
                }
                PaymentMethodComponentData A0b3 = DKF.A0b(it4);
                if (A0b3.A04 && (paymentMethodGreyedOutOptionConfig2 = A0b3.A02) != null) {
                    Boolean bool = paymentMethodGreyedOutOptionConfig2.A00;
                    C1pq.A08("greyedOut", bool);
                    String str7 = paymentMethodGreyedOutOptionConfig2.A01;
                    C1pq.A08("subtitle", str7);
                    paymentMethodGreyedOutOptionConfig = new PaymentMethodGreyedOutOptionConfig(str7, bool);
                    break;
                }
            }
            rTg.A0K = Optional.fromNullable(paymentMethodGreyedOutOptionConfig);
        }
        ShippingOptionsScreenComponent shippingOptionsScreenComponent = checkoutInformation.A0D;
        if (shippingOptionsScreenComponent != null) {
            ImmutableList immutableList4 = shippingOptionsScreenComponent.A01;
            immutableList4.getClass();
            rTg.A0R = immutableList4;
            rTg.A0M = Optional.fromNullable(shippingOptionsScreenComponent.A00);
        }
        TermsAndPoliciesScreenComponent termsAndPoliciesScreenComponent = checkoutInformation.A0E;
        if (termsAndPoliciesScreenComponent != null) {
            CheckoutTermsAndPolicies checkoutTermsAndPolicies = termsAndPoliciesScreenComponent.A00;
            checkoutTermsAndPolicies.getClass();
            rTg.A04 = checkoutTermsAndPolicies;
        }
        CheckoutPromotionsOptInComponent checkoutPromotionsOptInComponent = checkoutInformation.A01;
        if (checkoutPromotionsOptInComponent != null) {
            rTg.A03 = checkoutPromotionsOptInComponent;
        }
        DebugInfoScreenComponent debugInfoScreenComponent = checkoutInformation.A04;
        if (debugInfoScreenComponent != null && (immutableList = debugInfoScreenComponent.A00) != null) {
            ImmutableList immutableList5 = this.A0P;
            1Du it5 = immutableList.iterator();
            while (it5.hasNext()) {
                DebugInfo debugInfo = (DebugInfo) it5.next();
                String str8 = debugInfo.A00;
                if (str8 != null && (str = debugInfo.A01) != null) {
                    immutableList5 = R2m.A00(immutableList5, str8, str);
                }
            }
            rTg.A0P = immutableList5;
        }
        CouponCodeScreenComponent couponCodeScreenComponent = checkoutInformation.A03;
        if (couponCodeScreenComponent != null) {
            ImmutableList immutableList6 = couponCodeScreenComponent.A00;
            immutableList6.getClass();
            Preconditions.checkArgument(7zM.A1b(immutableList6));
            CouponCode couponCode = (CouponCode) immutableList6.get(0);
            if (couponCode.A02) {
                String str9 = couponCode.A00.A06;
                if (!1JF.A0B(str9)) {
                    rTg.A0a = str9;
                }
            }
        }
        PriceSelectorConfig priceSelectorConfig = checkoutInformation.A0A;
        CheckoutCommonParams checkoutCommonParams = this.A07;
        CheckoutCommonParamsCore checkoutCommonParamsCore = checkoutCommonParams.A02;
        if (checkoutCommonParamsCore.A06 == null && priceSelectorConfig != null) {
            rTg.A05 = priceSelectorConfig;
            rTg.A0W = priceSelectorConfig.A04;
        }
        PaymentSecurityComponent paymentSecurityComponent = checkoutInformation.A09;
        if (paymentSecurityComponent != null) {
            rTg.A0V = Boolean.valueOf(paymentSecurityComponent.A00);
            rTg.A0d = paymentSecurityComponent.A01();
            rTg.A0c = paymentSecurityComponent.A00();
            rTg.A0k = paymentSecurityComponent.A01;
        }
        Ret ret = new Ret(checkoutCommonParamsCore);
        if (couponCodeScreenComponent != null) {
            ImmutableList immutableList7 = couponCodeScreenComponent.A00;
            immutableList7.getClass();
            Preconditions.checkArgument(7zM.A1b(immutableList7));
            CouponCode couponCode2 = (CouponCode) immutableList7.get(0);
            ret.A07 = new CouponCodeCheckoutPurchaseInfoExtension(couponCode2.A00, Boolean.valueOf(couponCode2.A02), couponCode2.A01);
        }
        ret.A06 = checkoutInformation;
        FEn A00 = FEn.A00(checkoutCommonParams);
        A00.A02 = new CheckoutCommonParamsCore(ret);
        rTg.A07 = new CheckoutCommonParams(A00);
        String str10 = checkoutInformation.A0J;
        if (str10 != null) {
            rTg.A0b = str10;
        }
        return new SimpleCheckoutData(rTg);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A09, i);
        parcel.writeInt(this.A0i ? 1 : 0);
        parcel.writeString((String) this.A0E.getValue());
        C53v.A0I(parcel, this.A0V);
        parcel.writeString(this.A0h);
        parcel.writeString(this.A0e);
        parcel.writeString(this.A0X);
        parcel.writeString(this.A0a);
        C53v.A0B(parcel, this.A0G, i);
        parcel.writeList(this.A0Q);
        parcel.writeList(this.A0P);
        C53v.A0B(parcel, this.A0M, i);
        parcel.writeList(this.A0R);
        C53v.A0B(parcel, this.A0F, i);
        C53v.A0B(parcel, this.A0L, i);
        parcel.writeList(this.A0O);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeParcelable(this.A01, i);
        C53v.A0J(parcel, this.A08);
        C53v.A0B(parcel, this.A0I, i);
        C53v.A0B(parcel, this.A0H, i);
        C53v.A0B(parcel, this.A0J, i);
        C53v.A0B(parcel, this.A0K, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeList(this.A0N);
        parcel.writeParcelable(this.A0D, i);
        ImmutableMap immutableMap = this.A0T;
        HashMap A0u = AnonymousClass001.A0u();
        1Du A0i = 4YU.A0i(immutableMap);
        while (A0i.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0i);
            A0u.put(A0z.getKey(), 1BK.A17((Collection) A0z.getValue()));
        }
        C53v.A0P(parcel, A0u);
        parcel.writeString(this.A0Y);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeValue(this.A0W);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeString(this.A0f);
        parcel.writeMap(this.A0S);
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0b);
        parcel.writeInt(this.A0j ? 1 : 0);
        parcel.writeString(this.A0d);
        parcel.writeString(this.A0c);
        parcel.writeInt(this.A0k ? 1 : 0);
        parcel.writeString(this.A0g);
        C53v.A0R(parcel, this.A0U);
    }
}
