package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbH;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.checkout.configuration.model.bubble.BubbleComponent;
import com.google.common.collect.ImmutableList;

/* loaded from: CheckoutInformation.class */
public final class CheckoutInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(59);
    public final CheckoutEntityScreenComponent A00;
    public final CheckoutPromotionsOptInComponent A01;
    public final ContactInformationScreenComponent A02;
    public final CouponCodeScreenComponent A03;
    public final DebugInfoScreenComponent A04;
    public final EmailOptInScreenComponent A05;
    public final FreeTrialScreenComponent A06;
    public final PayButtonScreenComponent A07;
    public final PaymentCredentialsScreenComponent A08;
    public final PaymentSecurityComponent A09;
    public final PriceSelectorConfig A0A;
    public final PriceTableScreenComponent A0B;
    public final ShippingAddressScreenComponent A0C;
    public final ShippingOptionsScreenComponent A0D;
    public final TermsAndPoliciesScreenComponent A0E;
    public final UserInfo A0F;
    public final BubbleComponent A0G;
    public final ImmutableList A0H;
    public final ImmutableList A0I;
    public final String A0J;
    public final String A0K;

    public CheckoutInformation(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        UserInfo userInfo = null;
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = (BubbleComponent) BubbleComponent.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (CheckoutEntityScreenComponent) parcel.readParcelable(A0e);
        }
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A0H = ImmutableList.copyOf(strArr);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (ContactInformationScreenComponent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (CouponCodeScreenComponent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            int readInt2 = parcel.readInt();
            CustomExtensionScreenComponent[] customExtensionScreenComponentArr = new CustomExtensionScreenComponent[readInt2];
            while (i < readInt2) {
                i = AbI.A01(parcel, A0e, customExtensionScreenComponentArr, i);
            }
            this.A0I = ImmutableList.copyOf(customExtensionScreenComponentArr);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (DebugInfoScreenComponent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (EmailOptInScreenComponent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (FreeTrialScreenComponent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (PayButtonScreenComponent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (PaymentCredentialsScreenComponent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (PaymentSecurityComponent) parcel.readParcelable(A0e);
        }
        this.A0K = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (PriceSelectorConfig) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (PriceTableScreenComponent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (CheckoutPromotionsOptInComponent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (ShippingAddressScreenComponent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = (ShippingOptionsScreenComponent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = (TermsAndPoliciesScreenComponent) parcel.readParcelable(A0e);
        }
        this.A0F = parcel.readInt() != 0 ? (UserInfo) parcel.readParcelable(A0e) : userInfo;
    }

    public CheckoutInformation(CheckoutEntityScreenComponent checkoutEntityScreenComponent, CheckoutPromotionsOptInComponent checkoutPromotionsOptInComponent, ContactInformationScreenComponent contactInformationScreenComponent, CouponCodeScreenComponent couponCodeScreenComponent, DebugInfoScreenComponent debugInfoScreenComponent, EmailOptInScreenComponent emailOptInScreenComponent, FreeTrialScreenComponent freeTrialScreenComponent, PayButtonScreenComponent payButtonScreenComponent, PaymentCredentialsScreenComponent paymentCredentialsScreenComponent, PaymentSecurityComponent paymentSecurityComponent, PriceSelectorConfig priceSelectorConfig, PriceTableScreenComponent priceTableScreenComponent, ShippingAddressScreenComponent shippingAddressScreenComponent, ShippingOptionsScreenComponent shippingOptionsScreenComponent, TermsAndPoliciesScreenComponent termsAndPoliciesScreenComponent, UserInfo userInfo, BubbleComponent bubbleComponent, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2) {
        this.A0G = bubbleComponent;
        this.A00 = checkoutEntityScreenComponent;
        C1pq.A08("checkoutScreenComponentTypes", immutableList);
        this.A0H = immutableList;
        this.A02 = contactInformationScreenComponent;
        this.A03 = couponCodeScreenComponent;
        this.A0I = immutableList2;
        this.A04 = debugInfoScreenComponent;
        this.A05 = emailOptInScreenComponent;
        this.A0J = str;
        this.A06 = freeTrialScreenComponent;
        this.A07 = payButtonScreenComponent;
        this.A08 = paymentCredentialsScreenComponent;
        this.A09 = paymentSecurityComponent;
        C1pq.A08("paymentSessionID", str2);
        this.A0K = str2;
        this.A0A = priceSelectorConfig;
        this.A0B = priceTableScreenComponent;
        this.A01 = checkoutPromotionsOptInComponent;
        this.A0C = shippingAddressScreenComponent;
        this.A0D = shippingOptionsScreenComponent;
        this.A0E = termsAndPoliciesScreenComponent;
        this.A0F = userInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutInformation)) {
                return false;
            }
            CheckoutInformation checkoutInformation = (CheckoutInformation) obj;
            if (!11T.A0O(this.A0G, checkoutInformation.A0G) || !11T.A0O(this.A00, checkoutInformation.A00) || !11T.A0O(this.A0H, checkoutInformation.A0H) || !11T.A0O(this.A02, checkoutInformation.A02) || !11T.A0O(this.A03, checkoutInformation.A03) || !11T.A0O(this.A0I, checkoutInformation.A0I) || !11T.A0O(this.A04, checkoutInformation.A04) || !11T.A0O(this.A05, checkoutInformation.A05) || !11T.A0O(this.A0J, checkoutInformation.A0J) || !11T.A0O(this.A06, checkoutInformation.A06) || !11T.A0O(this.A07, checkoutInformation.A07) || !11T.A0O(this.A08, checkoutInformation.A08) || !11T.A0O(this.A09, checkoutInformation.A09) || !11T.A0O(this.A0K, checkoutInformation.A0K) || !11T.A0O(this.A0A, checkoutInformation.A0A) || !11T.A0O(this.A0B, checkoutInformation.A0B) || !11T.A0O(this.A01, checkoutInformation.A01) || !11T.A0O(this.A0C, checkoutInformation.A0C) || !11T.A0O(this.A0D, checkoutInformation.A0D) || !11T.A0O(this.A0E, checkoutInformation.A0E) || !11T.A0O(this.A0F, checkoutInformation.A0F)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0F, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A01, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A0K, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A0J, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A0I, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A0H, C1pq.A04(this.A00, C1pq.A03(this.A0G)))))))))))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        BubbleComponent bubbleComponent = this.A0G;
        if (bubbleComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bubbleComponent.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A00, i);
        1Du A0b = 1BL.A0b(parcel, this.A0H);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        C3o5.A0d(parcel, this.A02, i);
        C3o5.A0d(parcel, this.A03, i);
        ImmutableList immutableList = this.A0I;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((CustomExtensionScreenComponent) A0Y.next(), i);
            }
        }
        C3o5.A0d(parcel, this.A04, i);
        C3o5.A0d(parcel, this.A05, i);
        1BL.A13(parcel, this.A0J);
        C3o5.A0d(parcel, this.A06, i);
        C3o5.A0d(parcel, this.A07, i);
        C3o5.A0d(parcel, this.A08, i);
        C3o5.A0d(parcel, this.A09, i);
        parcel.writeString(this.A0K);
        C3o5.A0d(parcel, this.A0A, i);
        C3o5.A0d(parcel, this.A0B, i);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A0C, i);
        C3o5.A0d(parcel, this.A0D, i);
        C3o5.A0d(parcel, this.A0E, i);
        C3o5.A0d(parcel, this.A0F, i);
    }
}
