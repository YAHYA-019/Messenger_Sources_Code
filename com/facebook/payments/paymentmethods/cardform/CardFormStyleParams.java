package com.facebook.payments.paymentmethods.cardform;

import X.1BL;
import X.C53v;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.decorator.PaymentsDecoratorParams;

/* loaded from: CardFormStyleParams.class */
public class CardFormStyleParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(45);
    public final boolean enableHubTitleBar;
    public final boolean hideCardIcon;
    public final boolean hideLoadingState;
    public final boolean hidePaymentsFormFooterView;
    public final PaymentsDecoratorParams paymentsDecoratorParams;
    public final String saveButtonText;
    public final boolean shouldStripPadding;
    public final boolean showCardholderNameField;
    public final boolean showDeleteButton;
    public final boolean showSubmitButton;
    public final String title;

    public CardFormStyleParams() {
        this.title = null;
        this.saveButtonText = null;
        this.paymentsDecoratorParams = null;
        this.showDeleteButton = false;
        this.showSubmitButton = false;
        this.hidePaymentsFormFooterView = false;
        this.hideLoadingState = false;
        this.hideCardIcon = false;
        this.enableHubTitleBar = false;
        this.shouldStripPadding = false;
        this.showCardholderNameField = false;
    }

    public CardFormStyleParams(Parcel parcel) {
        this.title = parcel.readString();
        this.saveButtonText = parcel.readString();
        this.paymentsDecoratorParams = (PaymentsDecoratorParams) 1BL.A0C(parcel, PaymentsDecoratorParams.class);
        this.showDeleteButton = C53v.A0S(parcel);
        this.showSubmitButton = C53v.A0S(parcel);
        this.hidePaymentsFormFooterView = C53v.A0S(parcel);
        this.hideLoadingState = C53v.A0S(parcel);
        this.hideCardIcon = C53v.A0S(parcel);
        this.enableHubTitleBar = C53v.A0S(parcel);
        this.shouldStripPadding = C53v.A0S(parcel);
        this.showCardholderNameField = C53v.A0S(parcel);
    }

    public CardFormStyleParams(PaymentsDecoratorParams paymentsDecoratorParams) {
        this.title = null;
        this.saveButtonText = null;
        this.paymentsDecoratorParams = paymentsDecoratorParams;
        this.showDeleteButton = false;
        this.showSubmitButton = false;
        this.hidePaymentsFormFooterView = false;
        this.hideLoadingState = false;
        this.hideCardIcon = false;
        this.enableHubTitleBar = false;
        this.shouldStripPadding = false;
        this.showCardholderNameField = false;
    }

    public CardFormStyleParams(PaymentsDecoratorParams paymentsDecoratorParams, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.title = str2;
        this.saveButtonText = str;
        this.paymentsDecoratorParams = paymentsDecoratorParams;
        this.showDeleteButton = false;
        this.showSubmitButton = z6;
        this.hidePaymentsFormFooterView = z3;
        this.hideLoadingState = z2;
        this.hideCardIcon = z;
        this.enableHubTitleBar = false;
        this.shouldStripPadding = z4;
        this.showCardholderNameField = z5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.saveButtonText);
        parcel.writeParcelable(this.paymentsDecoratorParams, i);
        parcel.writeInt(this.showDeleteButton ? 1 : 0);
        parcel.writeInt(this.showSubmitButton ? 1 : 0);
        parcel.writeInt(this.hidePaymentsFormFooterView ? 1 : 0);
        parcel.writeInt(this.hideLoadingState ? 1 : 0);
        parcel.writeInt(this.hideCardIcon ? 1 : 0);
        parcel.writeInt(this.enableHubTitleBar ? 1 : 0);
        parcel.writeInt(this.shouldStripPadding ? 1 : 0);
        parcel.writeInt(this.showCardholderNameField ? 1 : 0);
    }
}
