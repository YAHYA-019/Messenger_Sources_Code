package com.facebook.payments.p2p.service.model.transactions;

import X.1BL;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SendPaymentMessageResult.class */
public class SendPaymentMessageResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(37);
    public final String id;
    public final DynamicAuthentication mDynamicAuthentication;
    public final OpenWebviewData mOpenWebviewData;
    public final PostTransactionScreenData mPostTransactionScreenData;
    public final String riskResult;
    public final String verificationUrl;

    /* loaded from: SendPaymentMessageResult$DynamicAuthentication.class */
    public class DynamicAuthentication implements Parcelable {
        public static final Parcelable.Creator CREATOR = FKd.A00(38);
        public final String authAmount;
        public final String authCurrency;
        public final String authType;
        public final String cardAssociation;
        public final String cardAssociationImageUrl;
        public final String cardLastFour;
        public final String credentialId;
        public final String descriptorPrefix;
        public final String dynamicDescriptorResolutionStatus;
        public final String errorCode;
        public final String expirationMonth;
        public final String expirationYear;
        public final String flowStep;
        public final String id;

        public DynamicAuthentication() {
            this.id = null;
            this.authType = null;
            this.errorCode = null;
            this.credentialId = null;
            this.cardAssociation = null;
            this.cardLastFour = null;
            this.cardAssociationImageUrl = null;
            this.expirationMonth = null;
            this.expirationYear = null;
            this.flowStep = null;
            this.authCurrency = null;
            this.authAmount = null;
            this.descriptorPrefix = null;
            this.dynamicDescriptorResolutionStatus = null;
        }

        public DynamicAuthentication(Parcel parcel) {
            this.id = parcel.readString();
            this.authType = parcel.readString();
            this.errorCode = parcel.readString();
            this.credentialId = parcel.readString();
            this.cardAssociation = parcel.readString();
            this.cardAssociationImageUrl = parcel.readString();
            this.cardLastFour = parcel.readString();
            this.expirationMonth = parcel.readString();
            this.expirationYear = parcel.readString();
            this.flowStep = parcel.readString();
            this.authCurrency = parcel.readString();
            this.authAmount = parcel.readString();
            this.descriptorPrefix = parcel.readString();
            this.dynamicDescriptorResolutionStatus = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.id);
            parcel.writeString(this.authType);
            parcel.writeString(this.errorCode);
            parcel.writeString(this.credentialId);
            parcel.writeString(this.cardAssociation);
            parcel.writeString(this.cardAssociationImageUrl);
            parcel.writeString(this.cardLastFour);
            parcel.writeString(this.expirationMonth);
            parcel.writeString(this.expirationYear);
            parcel.writeString(this.flowStep);
            parcel.writeString(this.authCurrency);
            parcel.writeString(this.authAmount);
            parcel.writeString(this.descriptorPrefix);
            parcel.writeString(this.dynamicDescriptorResolutionStatus);
        }
    }

    /* loaded from: SendPaymentMessageResult$OpenWebviewData.class */
    public class OpenWebviewData implements Parcelable {
        public static final Parcelable.Creator CREATOR = FKd.A00(39);
        public final String failUrl;
        public final String httpMethod;
        public final String params;
        public final String successUrl;
        public final String webviewUrl;

        public OpenWebviewData() {
            this.params = null;
            this.webviewUrl = null;
            this.successUrl = null;
            this.failUrl = null;
            this.httpMethod = null;
        }

        public OpenWebviewData(Parcel parcel) {
            this.params = parcel.readString();
            this.webviewUrl = parcel.readString();
            this.successUrl = parcel.readString();
            this.failUrl = parcel.readString();
            this.httpMethod = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.params);
            parcel.writeString(this.webviewUrl);
            parcel.writeString(this.successUrl);
            parcel.writeString(this.failUrl);
            parcel.writeString(this.httpMethod);
        }
    }

    public SendPaymentMessageResult() {
        this.id = null;
        this.riskResult = null;
        this.verificationUrl = null;
        this.mOpenWebviewData = null;
        this.mDynamicAuthentication = null;
        this.mPostTransactionScreenData = null;
    }

    public SendPaymentMessageResult(Parcel parcel) {
        this.id = parcel.readString();
        this.riskResult = parcel.readString();
        this.verificationUrl = parcel.readString();
        this.mOpenWebviewData = (OpenWebviewData) 1BL.A0C(parcel, OpenWebviewData.class);
        this.mDynamicAuthentication = (DynamicAuthentication) 1BL.A0C(parcel, DynamicAuthentication.class);
        this.mPostTransactionScreenData = (PostTransactionScreenData) 1BL.A0C(parcel, PostTransactionScreenData.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.riskResult);
        parcel.writeString(this.verificationUrl);
        parcel.writeParcelable(this.mOpenWebviewData, i);
        parcel.writeParcelable(this.mDynamicAuthentication, i);
        parcel.writeParcelable(this.mPostTransactionScreenData, i);
    }
}
