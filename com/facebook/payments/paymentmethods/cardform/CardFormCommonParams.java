package com.facebook.payments.paymentmethods.cardform;

import X.1BL;
import X.C53v;
import X.DKG;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.model.FbPaymentCard;
import com.facebook.payments.paymentmethods.model.NewCreditCardOption;

/* loaded from: CardFormCommonParams.class */
public final class CardFormCommonParams implements CardFormParams, Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(44);
    public Country A00;
    public final CardFormAnalyticsParams cardFormAnalyticsParams;
    public final CardFormStyle cardFormStyle;
    public final CardFormStyleParams cardFormStyleParams;
    public final FbPaymentCard fbPaymentCard;
    public final boolean hideCountrySelector;
    public final NewCreditCardOption newCreditCardOption;
    public final PaymentItemType paymentItemType;
    public final boolean shouldNotSubmitFormOnDoneClick;
    public final boolean showOnlyErroredFields;

    public CardFormCommonParams() {
        this.cardFormStyle = null;
        this.cardFormAnalyticsParams = null;
        this.paymentItemType = null;
        this.cardFormStyleParams = new CardFormStyleParams(PaymentsDecoratorParams.A02(), null, null, false, false, false, false, false, false);
        this.fbPaymentCard = null;
        this.hideCountrySelector = false;
        this.showOnlyErroredFields = false;
        this.shouldNotSubmitFormOnDoneClick = false;
        this.A00 = Country.A01;
        this.newCreditCardOption = null;
    }

    public CardFormCommonParams(Parcel parcel) {
        this.cardFormStyle = (CardFormStyle) C53v.A07(parcel, CardFormStyle.class);
        this.cardFormAnalyticsParams = (CardFormAnalyticsParams) 1BL.A0C(parcel, CardFormAnalyticsParams.class);
        this.cardFormStyleParams = (CardFormStyleParams) 1BL.A0C(parcel, CardFormStyleParams.class);
        this.fbPaymentCard = (FbPaymentCard) 1BL.A0C(parcel, FbPaymentCard.class);
        this.paymentItemType = DKG.A0k(parcel);
        this.hideCountrySelector = C53v.A0S(parcel);
        this.showOnlyErroredFields = C53v.A0S(parcel);
        this.shouldNotSubmitFormOnDoneClick = C53v.A0S(parcel);
        this.A00 = (Country) 1BL.A0C(parcel, Country.class);
        this.newCreditCardOption = (NewCreditCardOption) 1BL.A0C(parcel, NewCreditCardOption.class);
    }

    public CardFormCommonParams(Country country, PaymentItemType paymentItemType, CardFormAnalyticsParams cardFormAnalyticsParams, CardFormStyle cardFormStyle, CardFormStyleParams cardFormStyleParams, FbPaymentCard fbPaymentCard, NewCreditCardOption newCreditCardOption, boolean z, boolean z2, boolean z3) {
        this.cardFormStyle = cardFormStyle;
        this.cardFormAnalyticsParams = cardFormAnalyticsParams;
        this.paymentItemType = paymentItemType;
        this.cardFormStyleParams = cardFormStyleParams;
        this.fbPaymentCard = fbPaymentCard;
        this.hideCountrySelector = z;
        this.showOnlyErroredFields = z3;
        this.shouldNotSubmitFormOnDoneClick = z2;
        this.A00 = country;
        this.newCreditCardOption = newCreditCardOption;
    }

    private void setBillingCountry(String str) {
        if (str != null) {
            this.A00 = Country.A00(null, str);
        }
    }

    @Override // com.facebook.payments.paymentmethods.cardform.CardFormParams
    public CardFormCommonParams Abq() {
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.cardFormStyle);
        parcel.writeParcelable(this.cardFormAnalyticsParams, i);
        parcel.writeParcelable(this.cardFormStyleParams, i);
        parcel.writeParcelable(this.fbPaymentCard, i);
        C53v.A0J(parcel, this.paymentItemType);
        parcel.writeInt(this.hideCountrySelector ? 1 : 0);
        parcel.writeInt(this.showOnlyErroredFields ? 1 : 0);
        parcel.writeInt(this.shouldNotSubmitFormOnDoneClick ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.newCreditCardOption, i);
    }
}
