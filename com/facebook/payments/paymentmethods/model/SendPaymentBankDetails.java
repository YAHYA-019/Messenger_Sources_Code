package com.facebook.payments.paymentmethods.model;

import X.11T;
import X.1BL;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.C3o5;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SendPaymentBankDetails.class */
public final class SendPaymentBankDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(67);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public SendPaymentBankDetails(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A07 = C3o5.A0O(parcel);
    }

    public SendPaymentBankDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C1pq.A08("code", str);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        C1pq.A08("image", str5);
        this.A04 = str5;
        AbF.A1U(str6);
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SendPaymentBankDetails)) {
                return false;
            }
            SendPaymentBankDetails sendPaymentBankDetails = (SendPaymentBankDetails) obj;
            if (!11T.A0O(this.A00, sendPaymentBankDetails.A00) || !11T.A0O(this.A01, sendPaymentBankDetails.A01) || !11T.A0O(this.A02, sendPaymentBankDetails.A02) || !11T.A0O(this.A03, sendPaymentBankDetails.A03) || !11T.A0O(this.A04, sendPaymentBankDetails.A04) || !11T.A0O(this.A05, sendPaymentBankDetails.A05) || !11T.A0O(this.A06, sendPaymentBankDetails.A06) || !11T.A0O(this.A07, sendPaymentBankDetails.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
    }
}
