package com.facebook.payments.webview.model;

import X.11T;
import X.4YW;
import X.AbK;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKW;
import X.RO8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PaymentsWebViewOnlinePaymentParams.class */
public final class PaymentsWebViewOnlinePaymentParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(7);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public PaymentsWebViewOnlinePaymentParams(RO8 ro8) {
        this.A00 = ro8.A00;
        String str = ro8.A01;
        C1pq.A08("failureDismissUrl", str);
        this.A01 = str;
        String str2 = ro8.A02;
        C1pq.A08("httpMethod", str2);
        this.A02 = str2;
        String str3 = ro8.A03;
        C1pq.A08("redirectUrl", str3);
        this.A03 = str3;
        String str4 = ro8.A04;
        C1pq.A08("returnUrl", str4);
        this.A04 = str4;
        String str5 = ro8.A05;
        C1pq.A08("successDismissUrl", str5);
        this.A05 = str5;
        this.A06 = false;
    }

    public PaymentsWebViewOnlinePaymentParams(Parcel parcel) {
        this.A00 = AbK.A15(parcel, C3o5.A01(parcel, this));
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = AbN.A1U(parcel);
    }

    public PaymentsWebViewOnlinePaymentParams(String str, String str2, String str3) {
        this.A00 = null;
        C1pq.A08("failureDismissUrl", str);
        this.A01 = str;
        this.A02 = "";
        C1pq.A08("redirectUrl", str2);
        this.A03 = str2;
        this.A04 = "";
        C1pq.A08("successDismissUrl", str3);
        this.A05 = str3;
        this.A06 = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentsWebViewOnlinePaymentParams)) {
                return false;
            }
            PaymentsWebViewOnlinePaymentParams paymentsWebViewOnlinePaymentParams = (PaymentsWebViewOnlinePaymentParams) obj;
            if (!11T.A0O(this.A00, paymentsWebViewOnlinePaymentParams.A00) || !11T.A0O(this.A01, paymentsWebViewOnlinePaymentParams.A01) || !11T.A0O(this.A02, paymentsWebViewOnlinePaymentParams.A02) || !11T.A0O(this.A03, paymentsWebViewOnlinePaymentParams.A03) || !11T.A0O(this.A04, paymentsWebViewOnlinePaymentParams.A04) || !11T.A0O(this.A05, paymentsWebViewOnlinePaymentParams.A05) || this.A06 != paymentsWebViewOnlinePaymentParams.A06) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))))), this.A06);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A06 ? 1 : 0);
    }
}
